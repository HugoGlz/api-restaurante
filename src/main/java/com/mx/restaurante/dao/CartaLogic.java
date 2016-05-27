package com.mx.restaurante.dao;

import java.util.ArrayList;
import java.util.List;

import com.mx.restaurante.beans.Carta;
import com.mx.restaurante.beans.Familia;
import com.mx.restaurante.hibernate.HibernateUtils;

public class CartaLogic extends HibernateUtils{

	public ArrayList<Carta> getProducts(int familia){
		String query = "FROM Carta WHERE estatus = 1";
		
		List<?> records = super.getList(query);
		
		if(records == null || records.isEmpty()) return null;
		
		ArrayList<Carta> cartas = new ArrayList<Carta>(0);
		
		for(Object record : records){
			Carta carta = (Carta)record;
			cartas.add(carta);
		}
		
		return cartas;
	}
	
	public ArrayList<Familia> getAllFamilias(){
		String query = "FROM Familia";
		
		List<?> records = super.getList(query);
		
		if(records == null || records.isEmpty()){
			return null;
		}
		
		ArrayList<Familia> familias = new ArrayList<Familia>(0);
		
		for(Object record : records){
			Familia familia = (Familia)record;
			familias.add(familia);
		}
		
		return familias;
	}

}
