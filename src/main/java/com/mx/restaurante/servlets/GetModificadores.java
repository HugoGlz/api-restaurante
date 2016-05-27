package com.mx.restaurante.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.mx.restaurante.beans.Modificador;
import com.mx.restaurante.beans.Personal;
import com.mx.restaurante.dao.ModificadorDAO;
import com.mx.restaurante.utils.Constants;
import com.mx.restaurante.utils.JSON;

@WebServlet(name = "GetModificadores", urlPatterns = {"/servicios/GetModificadores"})

public class GetModificadores extends HttpServlet {
	
	private static final long serialVersionUID = -3013023986111332471L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Personal personal = (Personal)request.getSession().getAttribute(Constants.USER.getNombre());
		
		if(personal == null){
			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
			return;
		}

		String familia = StringUtils.trimToNull(request.getParameter("familia"));
		
		ModificadorDAO dao = new ModificadorDAO();
		
		ArrayList<Modificador> modificadores = dao.getModificadores(Integer.parseInt(familia));
		
		if(modificadores != null){
			JSON.writeJSON(response, true, "OK" ,new Object[]{modificadores} , new String[]{"modificadores"});
		}else{
			JSON.writeJSON(response, false, null,null,null);
		}
		
	}
}