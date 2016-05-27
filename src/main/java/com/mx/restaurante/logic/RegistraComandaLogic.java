package com.mx.restaurante.logic;

import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.mx.restaurante.beans.DetalleModificador;
import com.mx.restaurante.beans.DetalleVenta;
import com.mx.restaurante.beans.Folio;
import com.mx.restaurante.beans.Modificador;
import com.mx.restaurante.beans.Precio;
import com.mx.restaurante.beans.Venta;
import com.mx.restaurante.hibernate.HibernateUtils;
import com.mx.restaurante.transfer.object.RegistroComanda;
import com.mx.restaurante.transfer.object.RegistroModificador;

public class RegistraComandaLogic {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public void guardarComanda(RegistroComanda comanda){
		
		Calendar ahora = Calendar.getInstance();
		HibernateUtils dao = new HibernateUtils();
		
		Integer id = comanda.getVenta() == null ? guardaVenta(comanda,ahora,dao) : actualizaVenta(comanda,dao);

		logger.info("Saving venta=" + id);
		
		ArrayList<DetalleModificador> modificadores = this.getModificadores(comanda,dao);
		
		Integer idDetalle = this.guardaDetalle(comanda,id,ahora,dao,modificadores);
		logger.info("Saving detalle =" + idDetalle);
		
		logger.info("Saving modificador");
		if(modificadores != null){
			this.guardaModificadores(modificadores,id,idDetalle,dao);
		}
	}
	
	private Integer guardaVenta(RegistroComanda comanda, Calendar ahora,HibernateUtils dao){
		Venta venta = new Venta();
		venta.setAbre(ahora);
		venta.setDescuento(0.0d);
		venta.setEstatus(1);
		venta.setFecha(comanda.getUsuario().getOperacion().getFecha());
		venta.setHoraLlegada(ahora);
		venta.setMesa(comanda.getMesa());
		venta.setMesero(comanda.getUsuario().getId());
		venta.setPax(comanda.getComensales());
		venta.setTipo(1);
		venta.setTipoNota(1);
		venta.setTipoNota(1);
		venta.setTurno(comanda.getUsuario().getOperacion().getTurno());
		venta.setUsuarioCancelacion(0);
		venta.setUsuarioDescuento(0);
		return dao.save(venta);
	}
	
	private Integer actualizaVenta(RegistroComanda comanda,HibernateUtils dao){
		String statement = "UPDATE Venta set estatus = 1 WHERE id=" + comanda.getVenta();
		dao.updateQuery(statement);
		return comanda.getVenta();
	}
	
	private Integer guardaDetalle(RegistroComanda comanda, Integer id,Calendar ahora,HibernateUtils dao,ArrayList<DetalleModificador> modificadores){
		DetalleVenta detalle = new DetalleVenta();
		detalle.setCantidad(1);
		detalle.setComensal(comanda.getComensal());
		detalle.setEstatus(1);
		detalle.setHoraRegistro(ahora);
		detalle.setMesa(comanda.getMesa());
		detalle.setMesero(comanda.getUsuario().getId());
		detalle.setUsuarioCancelacion(0);
		detalle.setUsuarioCortesia(0);
		detalle.setVariante(comanda.getVariante());
		detalle.setVenta(id);
		detalle.setCarta(comanda.getProducto());

		Precio precio = (Precio)dao.findById(Precio.class, comanda.getVariante());
		
		detalle.setDescripcion(precio.getCarta().getDescripcion() + " " + precio.getVariante().getDescripcion());
		detalle.setAplicaDescuento(precio.getCarta().getAplicaDescuento());
		detalle.setPrecio(precio.getPrecio());
		
		double precioNeto = precio.getPrecio();
		
		if(comanda.getModificadores() != null){
			for(DetalleModificador modificador : modificadores){
				if(modificador.getPrefijo() == 1){
					precioNeto += modificador.getPrecio();
				}
			}
		}
		
		detalle.setPrecioNeto(precioNeto);
		
		Folio folio = (Folio)dao.findById(Folio.class, 4);
		
		Integer comandaFolio = folio.getSiguiente();
		detalle.setComanda(comandaFolio++);
		
		folio.setSiguiente(comandaFolio);
		dao.update(folio);
		
		return dao.save(detalle);
	}
	
	private ArrayList<DetalleModificador> getModificadores(RegistroComanda comanda,HibernateUtils dao){
		if(comanda.getModificadores() == null){
			logger.info("No existen modificadores para esta comanda");
			return null;
		}
		
		ArrayList<DetalleModificador> detalleModificadores = new ArrayList<DetalleModificador>(0);

		for(RegistroModificador modificador : comanda.getModificadores()){
			Integer id = 0; 
			Double precio = 0d;
			String descripcion = modificador.getModificadorValor();
			Integer prefijo = modificador.getModificadorTipo().equalsIgnoreCase("CON") ? 1 : 
				(modificador.getModificadorTipo().equalsIgnoreCase("SIN") ? 2 : 0);
			
			DetalleModificador detalleModificador = new DetalleModificador();
			
			Modificador modificadorDB = null;
			
			if(!modificador.getModificadorTipo().equalsIgnoreCase("DETALLAR")){
				modificadorDB = (Modificador)dao.findById(Modificador.class, Integer.parseInt(modificador.getModificadorValor()));
				id = modificadorDB.getId();
				precio = modificadorDB.getPrecio();
				descripcion = modificadorDB.getDescripcion();
			}
			
			detalleModificador.setDescripcion(descripcion);
			detalleModificador.setEstatus(1);
			detalleModificador.setPrecio(precio);
			detalleModificador.setModificador(id);
			detalleModificador.setPrefijo(prefijo);
			detalleModificadores.add(detalleModificador);
		}
		
		return detalleModificadores;
	}
	
	private void guardaModificadores(ArrayList<DetalleModificador> modificadores,int id, int idDetalle,HibernateUtils dao){
		for(DetalleModificador modificador : modificadores){
			modificador.setDetalle(idDetalle);
			modificador.setModificador(id);
			dao.save(modificador);
		}
	}
}
