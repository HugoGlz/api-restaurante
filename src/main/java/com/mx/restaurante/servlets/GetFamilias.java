package com.mx.restaurante.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mx.restaurante.beans.Familia;
import com.mx.restaurante.beans.Personal;
import com.mx.restaurante.dao.FamiliaDAO;
import com.mx.restaurante.utils.Constants;
import com.mx.restaurante.utils.JSON;

@WebServlet(name = "GetFamilias", urlPatterns = {"/servicios/GetFamilias"})

public class GetFamilias extends HttpServlet {
	
	private static final long serialVersionUID = 8676060497815683248L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		Personal personal = (Personal)request.getSession().getAttribute(Constants.USER.getNombre());
//		
//		if(personal == null){
//			JSON.writeJSON(response, false, "La sesi\u00F3n expiro intentelo de nuevo.",null,null);
//			return;
//		}

		FamiliaDAO dao = new FamiliaDAO();
		
		ArrayList<Familia> familias = dao.getAllFamilias();
		
		JSON.writeJSON(response, true, "OK", new Object[]{familias},new String[]{"familias"});
	}
}