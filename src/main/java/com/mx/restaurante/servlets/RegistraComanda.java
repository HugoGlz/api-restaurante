package com.mx.restaurante.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.mx.restaurante.beans.Personal;
import com.mx.restaurante.logic.RegistraComandaLogic;
import com.mx.restaurante.transfer.object.RegistroComanda;
import com.mx.restaurante.transfer.object.RegistroModificador;
import com.mx.restaurante.utils.Constants;
import com.mx.restaurante.utils.JSON;

@WebServlet(name = "RegistraComanda", urlPatterns = {"/servicios/RegistraComanda"})

public class RegistraComanda extends HttpServlet {

	private static final long serialVersionUID = -2033984708215773565L;

	private static final Logger logger = Logger.getLogger(RegistraComanda.class);
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RegistroComanda comanda = this.getComanda(request,response);

		if(comanda == null){
			return;
		}
		
		Personal personal = (Personal)request.getSession().getAttribute(Constants.USER.getNombre());
		
		comanda.setUsuario(personal);
		
		try{
			RegistraComandaLogic logic = new RegistraComandaLogic();
			logic.guardarComanda(comanda);
			JSON.writeJSON(response, true, "OK",null,null);
			return;
		}catch(Exception e){
			JSON.writeJSON(response, false, "Algun dato requerido no ha sido llenado intentelo de nuevo.",null,null);
			return;
		}
	}
	
	private RegistroComanda getComanda(HttpServletRequest request, HttpServletResponse response){
		
		String message = "Algun dato requerido no ha sido llenado intentelo de nuevo.";
		
		String mesa = StringUtils.trimToNull(request.getParameter("mesa"));
		String comensales = StringUtils.trimToNull(request.getParameter("comensales"));
		String comensal = StringUtils.trimToNull(request.getParameter("comensal"));
		String producto = StringUtils.trimToNull(request.getParameter("producto"));
		String variante = StringUtils.trimToNull(request.getParameter("variante"));
		String venta = StringUtils.trimToNull(request.getParameter("venta"));
		String modificadorTipos[] = request.getParameterValues("modificadorTipo");
		String modificadorValores[] = request.getParameterValues("modificadorValor");
		
		if(mesa == null){
			logger.error("El campo de mesa viene nulo.");
			JSON.writeJSON(response, false, message,null,null);
			return null;
		}
		
		if(comensales == null){
			logger.error("El campo de numero de comensales viene nulo.");
			JSON.writeJSON(response, false, message,null,null);
			return null;
		}
		
		if(comensal == null){
			logger.error("El campo de comensal viene nulo.");
			JSON.writeJSON(response, false, message,null,null);
			return null;
		}
		
		if(producto == null){
			logger.error("El campo de producto viene nulo.");
			JSON.writeJSON(response, false, message,null,null);
			return null;
		}
		
		RegistroComanda comanda = new RegistroComanda();
		
		try{
			comanda.setComensal(Integer.parseInt(comensal));
			comanda.setComensales(Integer.parseInt(comensales));
			comanda.setMesa(Integer.parseInt(mesa));
			comanda.setProducto(Integer.parseInt(producto));
			
			if(variante != null){
				comanda.setVariante(Integer.parseInt(variante));
			}
			
			if(venta != null){
				comanda.setVenta(Integer.parseInt(venta));
			}
		}catch(Exception e){
			logger.error("Algun campo fallo al convertirlo en entero",e);
			JSON.writeJSON(response, false, message,null,null);
			return null;
		}
		
		if(modificadorTipos == null || modificadorValores == null){
			return comanda;
		}
		
		if(modificadorTipos.length != modificadorValores.length){
			logger.error("Las logitudes de los arreglos modificadorTipos(" + modificadorTipos.length +  ")"
					+ " y modificadorValores(" + modificadorValores.length +") son diferentes");
			JSON.writeJSON(response, false, message,null,null);
			return null;
		}
		
		ArrayList<RegistroModificador> modificadores = new ArrayList<RegistroModificador>(0);
		
		for(int index = 0; index < modificadorValores.length; index++){
			RegistroModificador modificador = new RegistroModificador();
			modificador.setModificadorTipo(modificadorTipos[index]);
			modificador.setModificadorValor(modificadorValores[index]);
			modificadores.add(modificador);
		}
		
		comanda.setModificadores(modificadores);
		
		return comanda;
	}
}
