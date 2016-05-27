//package com.mx.restaurante.dao;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.mx.restaurante.beans.Familia;
//import com.mx.restaurante.hibernate.HibernateUtils;
//
//public class FamiliaDAO extends HibernateUtils{
//
//	private Logger logger = Logger.getLogger(this.getClass());
//	
//	public ArrayList<Familia> getFamilias(int group){
//		
//		String query = "FROM Familia WHERE grupo = " + group;
//		
//		List<Serializable> records = super.getList(query);
//		
//		if(records == null || records.isEmpty()){
//			return null;
//		}
//		
//		ArrayList<Familia> familias = new ArrayList<Familia>(0);
//		
//		for(Serializable record : records){
//			
//			Familia familia = (Familia)record;
//			
//			familias.add(familia);
//		}
//		
//		return familias;
//		
//	}
//	
//	public ArrayList<Familia> getAllFamilias(){
//		
//		String query = "FROM Familia";
//		
//		List<Serializable> records = super.getList(query);
//		
//		if(records == null || records.isEmpty()){
//			return null;
//		}
//		
//		ArrayList<Familia> familias = new ArrayList<Familia>(0);
//		
//		for(Serializable record : records){
//			
//			Familia familia = (Familia)record;
//			
//			familias.add(familia);
//		}
//		
//		return familias;
//		
//	}
//
//}
