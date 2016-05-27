//package com.mx.restaurante.servlets;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.log4j.Logger;
//
//import com.mx.restaurante.beans.Asistencia;
//import com.mx.restaurante.beans.Estacion;
//import com.mx.restaurante.beans.Mesa;
//import com.mx.restaurante.beans.Personal;
//import com.mx.restaurante.dao.MesaDAO;
//import com.mx.restaurante.utils.Constants;
//import com.mx.restaurante.utils.JSON;
//
//@WebServlet(name = "GetMesas", urlPatterns = {"/servicios/GetMesas"})
//
//public class GetMesas extends HttpServlet {
//	
//	private static final long serialVersionUID = -4600316817730783026L;
//
//	private static final Logger logger = Logger.getLogger(GetMesas.class);
//	
//	@Override
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		Personal personal = (Personal)request.getSession().getAttribute(Constants.USER.getNombre());
//		
//		if(personal == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}
//		
//		Asistencia asistencia = personal.getAsistencia();
//		
//		if(asistencia == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}
//		
//		Estacion estacion = asistencia.getEstacion();
//		
//		if(estacion == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}
//
//		
//		Integer estacionId = estacion.getId();
//		
//		if(estacionId == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}
//
//		String estatusString = StringUtils.trimToNull(request.getParameter("estatus"));
//		Integer estatus = 1;
//		
//		try{
//			estatus = Integer.parseInt(estatusString); 
//		}catch(Exception e){
//			logger.error("Estatus is invalid",e);
//		}
//		
//		MesaDAO dao = new MesaDAO();
//		
//		ArrayList<Mesa> mesas = dao.getMesas(estacionId,estatus);
//		
//		JSON.writeJSON(response, true,"OK", new Object[]{mesas},new String[]{"mesas"});	
//		
//	}
//}