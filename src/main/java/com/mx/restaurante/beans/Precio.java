package com.mx.restaurante.beans;

import java.io.Serializable;

public class Precio implements Serializable{

	private static final long serialVersionUID = -5678995777392571621L;
	
	private Integer id;
	private Carta carta;
	private Variante variante;
	private Double precio;
	
	public Precio(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Variante getVariante() {
		return variante;
	}

	public void setVariante(Variante variante) {
		this.variante = variante;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}