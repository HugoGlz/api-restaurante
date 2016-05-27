package com.mx.restaurante.utils;

public enum Constants {

	USER("user"),
	ESTACION("estacion");
	
	private String nombre;
	
	private Constants(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
