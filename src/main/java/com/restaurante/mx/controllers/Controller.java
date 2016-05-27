package com.restaurante.mx.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.restaurante.beans.Carta;
import com.mx.restaurante.beans.Familia;
import com.mx.restaurante.beans.Mesa;
import com.mx.restaurante.beans.Modificador;
import com.mx.restaurante.dao.CartaLogic;
import com.mx.restaurante.dao.FamiliaDAO;
import com.mx.restaurante.dao.MesaDAO;
import com.mx.restaurante.dao.ModificadorDAO;
import com.mx.restaurante.dao.VentaDAO;
import com.mx.restaurante.transfer.object.VentaData;

@RestController
public class Controller {

	@RequestMapping("/carta")
	public ArrayList<Carta> buildCarta(){
		CartaLogic dao = new CartaLogic();
		ArrayList<Carta> productos = dao.getProducts(1);
		return productos;
	}
	
	@RequestMapping("/cartas")
	public ArrayList<Familia> buildCartas(){
		CartaLogic dao = new CartaLogic();
		ArrayList<Familia> familias = dao.getAllFamilias();
		return familias;
	}
	
	@RequestMapping("/comanda")
	public VentaData getComanda(@RequestParam(value = "comanda", required = true) Integer comandaId){
		VentaDAO dao = new VentaDAO();
		VentaData comanda = dao.getComanda(comandaId);
		return comanda;
	}
	
	@RequestMapping("/familias")
	public ArrayList<Familia> getFamilias(){
		FamiliaDAO dao = new FamiliaDAO();
		ArrayList<Familia> familias = dao.getAllFamilias();
		return familias;
	}
	
	@RequestMapping("/mesas")
	public ArrayList<Mesa> getMesas(
			@RequestParam(value = "personalId", required = true) Integer personalId
			){
		
//		Personal personal = new PersonalDAO().getPersonalById(personalId);
		
//		if(personal == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}
		
//		Asistencia asistencia = personal.getAsistencia();
		
//		if(asistencia == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}
		
//		Estacion estacion = asistencia.getEstacion();
		
//		if(estacion == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}

//		Integer estacionId = estacion.getId();
		Integer estacionId = 1;
		
//		if(estacionId == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}

//		String estatusString = StringUtils.trimToNull(request.getParameter("estatus"));
		Integer estatus = 1;
		
//		try{
//			estatus = Integer.parseInt(estatusString); 
//		}catch(Exception e){
//			logger.error("Estatus is invalid",e);
//		}
		
		MesaDAO dao = new MesaDAO();
		
		ArrayList<Mesa> mesas = dao.getMesas(estacionId,estatus);
		
		return mesas;
	}
	
	
	@RequestMapping(name = "/modificadores", method = RequestMethod.GET)
	public ArrayList<Modificador> getModificadores(
			@RequestParam(value = "familia", required = true) Integer familia
			){
//		Personal personal = (Personal)request.getSession().getAttribute(Constants.USER.getNombre());
//		
//		if(personal == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}

		ModificadorDAO dao = new ModificadorDAO();
		
		ArrayList<Modificador> modificadores = dao.getModificadores(familia);
		
		return modificadores;
	}
}
