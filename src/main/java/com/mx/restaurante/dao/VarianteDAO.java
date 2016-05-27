//package com.mx.restaurante.dao;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.mx.restaurante.beans.Precio;
//import com.mx.restaurante.hibernate.HibernateUtils;
//
//public class VarianteDAO extends HibernateUtils{
//
//	public ArrayList<Precio> getVariantes(int carta){
//		
//		String query = "FROM Precio WHERE carta = " + carta;
//		
//		List<Serializable> records = super.getList(query);
//		
//		if(records == null || records.isEmpty()){
//			return null;
//		}
//		
//		ArrayList<Precio> variantes = new ArrayList<Precio>(0);
//		
//		for(Serializable record : records){
//			
//			Precio variante = (Precio)record;
//			
//			variantes.add(variante);
//		}
//		
//		return variantes;
//		
//	}
//}
