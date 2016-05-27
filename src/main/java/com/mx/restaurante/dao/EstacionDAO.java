//package com.mx.restaurante.dao;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.mx.restaurante.beans.Estacion;
//import com.mx.restaurante.hibernate.HibernateUtils;
//
//public class EstacionDAO extends HibernateUtils{
//
//	private Logger logger = Logger.getLogger(this.getClass());
//	
//	public ArrayList<Estacion> getAllEstaciones(){
//		
//		String query = "FROM Estacion";
//		
//		List<Serializable> records = super.getList(query);
//		
//		if(records == null || records.isEmpty()){
//			logger.error("La tabla estacion esta vacia! revise esto por favor.");
//			return null;
//		}
//		
//		ArrayList<Estacion> estaciones = new ArrayList<Estacion>(0);
//		
//		for(Serializable record : records){
//			
//			Estacion estacion = (Estacion)record;
//			
//			estaciones.add(estacion);
//		}
//		
//		return estaciones;
//		
//	}
//	
//}
