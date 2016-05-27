package com.mx.restaurante.dao;

import org.apache.log4j.Logger;

import com.mx.restaurante.beans.Asistencia;
import com.mx.restaurante.beans.Operacion;
import com.mx.restaurante.beans.Personal;
import com.mx.restaurante.hibernate.HibernateUtils;

public class PersonalDAO extends HibernateUtils{

	private Logger logger = Logger.getLogger(this.getClass());
	
	public Personal getPersonalByNip(String clave){
		String query = "FROM Personal WHERE nip = '" + clave + "'";
		Object record = super.getObject(query);
		Personal personal = (Personal)record;
		return personal;
	}
	
	public Asistencia getAsistenciaByIdPersonal(int idPersonal, String date){
		String query = "FROM Asistencia WHERE empleado=" + idPersonal + " AND DATE(fecha) = '" + date + "'";
		
		Object record = super.getObject(query);
		Asistencia asistencia = (Asistencia)record;
		return asistencia;
	}
	
	public Operacion getOperacionByDate(String date){
		String query = "FROM Operacion WHERE DATE(fecha) = '" + date + "'";
		
		Object record = super.getObject(query);
		Operacion operacion = (Operacion)record;
		return operacion;
	}
	
}
