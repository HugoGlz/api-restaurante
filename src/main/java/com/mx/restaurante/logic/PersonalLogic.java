package com.mx.restaurante.logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.mx.restaurante.beans.Asistencia;
import com.mx.restaurante.beans.Operacion;
import com.mx.restaurante.beans.Personal;
import com.mx.restaurante.dao.PersonalDAO;

public class PersonalLogic {
	
	private Logger logger = Logger.getLogger(this.getClass());

	private String message;
	private Personal personal;
	
	public boolean existPersonal(String clave){
		PersonalDAO dao = new PersonalDAO();
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(cal.getTime());
		
		Operacion operacion = dao.getOperacionByDate(date);
		
		if(operacion == null){
			this.setMessage("Hoy no se ha iniciado operaciones.");
			return false;
		}
		
		if(operacion.getEstatus() == 0){
			this.setMessage("Hoy se han cerrado las operaciones.");
			return false;
		}
		
		Personal personal = dao.getPersonalByNip(clave);
		
		if(personal == null){
			this.setMessage("No existe ningun usuario con este nip.");
			return false;
		}
		
		if(personal.getEstatus() == 0){
			this.setMessage("El usuario existe pero no esta activo.");
			return false;
		}
		
		if(!(personal.getTipo() == 1 || personal.getTipo() == 2 || personal.getTipo() == 4)){
			this.setMessage("El usuario existe pero no tiene permisos para usar esta aplicación.");
			return false;
		}
		
		Asistencia asistencia = dao.getAsistenciaByIdPersonal(personal.getId(),date);
		
		if(asistencia == null){
			this.setMessage("Hoy no ha registrado asistencia, por favor hagalo antes de continuar.");
			return false;
		}
		
		personal.setAsistencia(asistencia);
		personal.setOperacion(operacion);
		
		this.setPersonal(personal);
		this.setMessage("OK");
		return true;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
}
