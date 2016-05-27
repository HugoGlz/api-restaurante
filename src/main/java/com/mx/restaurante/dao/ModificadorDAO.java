package com.mx.restaurante.dao;

import java.util.ArrayList;
import java.util.List;

import com.mx.restaurante.beans.Modificador;
import com.mx.restaurante.hibernate.HibernateUtils;

public class ModificadorDAO extends HibernateUtils{

	public ArrayList<Modificador> getModificadores(int familia){
		
		String query = "FROM Modificador WHERE familia = " + familia + " AND estatus = 1";
		
		List<?> records = super.getList(query);
		
		if(records == null || records.isEmpty()){
			return null;
		}
		
		ArrayList<Modificador> modificadores = new ArrayList<Modificador>(0);
		
		for(Object record : records){
			
			Modificador modificador = (Modificador)record;
			
			modificadores.add(modificador);
		}
		
		return modificadores;
	}	
	
}