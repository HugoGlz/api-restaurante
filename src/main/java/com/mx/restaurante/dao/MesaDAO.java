package com.mx.restaurante.dao;

import java.util.ArrayList;
import java.util.List;

import com.mx.restaurante.beans.Mesa;
import com.mx.restaurante.hibernate.HibernateUtils;

public class MesaDAO extends HibernateUtils{
	
	public ArrayList<Mesa> getMesas(Integer estacion,Integer estatus){
		
		String query = "FROM Mesa WHERE estacion = " + estacion
						+ " AND estatus =" + estatus
						+ " ORDER BY numero";
		
		List<?> records = super.getList(query);
		
		if(records == null || records.isEmpty()){
			return null;
		}
		
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		
		for(Object record : records){
			Mesa mesa = (Mesa)record;
			mesas.add(mesa);
		}
		
		return mesas;
	}

}
