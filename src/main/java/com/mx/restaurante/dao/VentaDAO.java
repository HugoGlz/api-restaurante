package com.mx.restaurante.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.mx.restaurante.beans.DetalleModificador;
import com.mx.restaurante.beans.DetalleVenta;
import com.mx.restaurante.beans.Mesa;
import com.mx.restaurante.beans.Modificador;
import com.mx.restaurante.beans.Precio;
import com.mx.restaurante.beans.Venta;
import com.mx.restaurante.hibernate.HibernateUtils;
import com.mx.restaurante.transfer.object.ModificadorData;
import com.mx.restaurante.transfer.object.VentaData;
import com.mx.restaurante.transfer.object.VentaDetalleData;

public class VentaDAO extends HibernateUtils{

	private Logger logger = Logger.getLogger(this.getClass());
	
	public VentaData getComanda(Integer id){
		
		Venta ventaDB = (Venta)super.findById(Venta.class, id);
		
		if(ventaDB == null){
			return null;
		}
		
		VentaData venta = new VentaData();
		
		if(!cargaVenta(ventaDB,venta)){
			return null;
		}
		
		if(!cargaVentaDetalles(venta)){
			
		}
		
		return venta;
	}

	private boolean cargaVenta(Venta venta, VentaData data){
		Mesa mesa = (Mesa)super.findById(Mesa.class, venta.getMesa());
		
		if(mesa == null){
			logger.error("La mesa(" + venta.getMesa() + ") no existe.");
			return false;
		}
		
		data.setMesa(mesa);
		data.setId(venta.getId());
		data.setPax(venta.getPax());
		
		return true;
	}
	
	private boolean cargaVentaDetalles(VentaData data){
		String query = "FROM DetalleVenta WHERE venta = " + data.getId() + " AND estatus = 1 ";
		
		List<?> records = super.getList(query);
		
		if(records == null){
			logger.error("No existen detalles de venta.");
			return false;
		}
		
		ArrayList<VentaDetalleData> detalles = new ArrayList<VentaDetalleData>(records.size());
		
		Map<Integer, Precio> precios = new HashMap<Integer, Precio>(0);
		
		Map<Integer,Modificador> modificadoresMap = new HashMap<Integer, Modificador>(0);
		
		for(Object record : records){
			DetalleVenta detalle = (DetalleVenta)record;
			
			int idPrecio = detalle.getVariante();
			
			Precio precio = precios.get(idPrecio);
			
			if(precio == null){
				precio = (Precio) super.findById(Precio.class, idPrecio);
			}
			
			if(precio == null){
				logger.error("No existen precio(" + idPrecio + ") para este producto.");
				return false;
			}
			
			precios.put(idPrecio,precio);
			
			VentaDetalleData detalleData = new VentaDetalleData();
			detalleData.setVariante(precio);
			detalleData.setCantidad(detalle.getCantidad());
			detalleData.setDescripcion(detalle.getDescripcion());
			detalleData.setId(detalle.getId());
			detalleData.setPrecioNeto(detalle.getPrecioNeto());
			
			if(!cargaModificadores(data, detalleData,modificadoresMap)){
				return false;
			}
			
			detalles.add(detalleData);
		}
		
		data.setDetalles(detalles);
		return true;
	}
	
	private boolean cargaModificadores(VentaData data, VentaDetalleData detalle, Map<Integer,Modificador> modificadoresMap){
		String query = "FROM DetalleModificador WHERE detalle = " + detalle.getId() + " AND estatus = 1 ";
		
		List<?> records = super.getList(query);
		
		if(records == null){
			logger.error("No existen modificadores de detalles de venta(" + detalle.getId() +").");
			return true;
		}
		
		ArrayList<ModificadorData> modificadores = new ArrayList<ModificadorData>(records.size());
		
		for(Object record : records){
			DetalleModificador modificador = (DetalleModificador)record;
			
			int idModificador = modificador.getModificador();
			
			Modificador modificadorMap = modificadoresMap.get(idModificador);
			
			if(modificadorMap == null && idModificador != 0){
				modificadorMap = (Modificador) super.findById(Modificador.class, idModificador);
			}
			
			if(modificadorMap == null && idModificador != 0){
				logger.error("No existe modificador(" + idModificador + ") para este producto.");
				return false;
			}
			
			modificadoresMap.put(idModificador, modificadorMap);
			
			ModificadorData modificadorData = new ModificadorData();
			modificadorData.setModificador(modificadorMap);
			modificadorData.setDescripcion(modificador.getDescripcion());
			modificadorData.setId(modificador.getId());
			modificadorData.setPrecio(modificador.getPrecio());
			modificadorData.setPrefijo(modificador.getPrefijo());
			
			modificadores.add(modificadorData);
		}
		
		detalle.setModificadores(modificadores);
		
		return true;
	}
}
