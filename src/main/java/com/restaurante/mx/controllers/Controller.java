package com.restaurante.mx.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.restaurante.beans.Carta;
import com.mx.restaurante.beans.Familia;
import com.mx.restaurante.dao.CartaLogic;

@RestController
public class Controller {

	@RequestMapping("/test")
	public ArrayList<String> buildTest(){
		ArrayList<String> list = new ArrayList<String>(0);
		list.add("test 1");
		list.add("test 2");
		list.add("test 3");
		list.add("test 4");
		return list;
	}
	
	@RequestMapping("/carta")
	public ArrayList<Carta> buildCarta(){
		CartaLogic dao = new CartaLogic();
		ArrayList<Carta> productos = dao.getProducts(1);
		return productos;
	}
	
	@RequestMapping("/cartas")
	public ArrayList<Familia> buildCartas(){
		CartaLogic dao = new CartaLogic();
		ArrayList<Familia> familias = dao.getAllFamilias();
		return familias;
	}
	
	
}
