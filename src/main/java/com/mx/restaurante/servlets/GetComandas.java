//package com.mx.restaurante.servlets;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.lang3.StringUtils;
//
//import com.mx.restaurante.dao.VentaDAO;
//import com.mx.restaurante.transfer.object.VentaData;
//import com.mx.restaurante.utils.JSON;
//
//@WebServlet(name = "GetComandas", urlPatterns = {"/servicios/GetComandas"})
//
//
//public class GetComandas extends HttpServlet {
//
//	private static final long serialVersionUID = -4665577485245982081L;
//	
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String idVentaString = StringUtils.trimToNull(request.getParameter("idVenta"));
//		
//		if(idVentaString == null){
//			return;
//		}
//		
//		Integer id = Integer.parseInt(idVentaString);
//		
//		VentaDAO dao = new VentaDAO();
//		
//		VentaData venta = dao.getComanda(id);
//		
//		if(venta == null){
//			return;
//		}
//		
//		JSON.writeJSON(response, true, "OK", new Object[]{venta}, new String[]{"data"});
//		return;
//	}
//	
//	
//
//}
