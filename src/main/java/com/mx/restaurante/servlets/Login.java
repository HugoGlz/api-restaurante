package com.mx.restaurante.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.mx.restaurante.beans.Personal;
import com.mx.restaurante.logic.PersonalLogic;
import com.mx.restaurante.utils.Constants;
import com.mx.restaurante.utils.JSON;
import com.mx.restaurante.utils.Utils;

@WebServlet(name = "Login", urlPatterns = {"/servicios/Login"})

public class Login extends HttpServlet {

	private static final long serialVersionUID = -4600316817730783026L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String clave = StringUtils.trimToNull(request.getParameter("clave"));
		
		if(!Utils.isValidNumber(clave)){
			JSON.writeJSON(response, false, "La clave es requerida.",null,null);
			return;
		}
		
		PersonalLogic logic = new PersonalLogic();
		
		boolean exist = logic.existPersonal(clave);
		
		if(!exist){
			JSON.writeJSON(response, exist, logic.getMessage(),null,null);
			return;
		}
		
		Personal personal = logic.getPersonal();
		
		JSON.writeJSON(response, true, "OK.",null,null);
		request.getSession().setAttribute(Constants.USER.getNombre(), personal);
	}
}