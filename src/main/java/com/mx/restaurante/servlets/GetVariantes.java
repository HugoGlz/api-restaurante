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
//
//import com.mx.restaurante.beans.Personal;
//import com.mx.restaurante.beans.Precio;
//import com.mx.restaurante.dao.VarianteDAO;
//import com.mx.restaurante.utils.Constants;
//import com.mx.restaurante.utils.JSON;
//
//@WebServlet(name = "GetVariantes", urlPatterns = {"/servicios/GetVariantes"})
//
//public class GetVariantes extends HttpServlet {
//	
//	private static final long serialVersionUID = -9100276868295145228L;
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
//		String carta = StringUtils.trimToNull(request.getParameter("carta"));
//		
//		VarianteDAO dao = new VarianteDAO();
//		
//		ArrayList<Precio> variantes = dao.getVariantes(Integer.parseInt(carta));
//		
//		JSON.writeJSON(response, true,"OK", new Object[]{variantes}, new String[]{"variantes"});
//	}
//}