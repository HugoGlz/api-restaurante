package com.mx.restaurante.beans;

import java.io.Serializable;

public class Folio implements Serializable{

	private static final long serialVersionUID = -4217460003348229031L;
	
	private Integer id;
	private Integer siguiente;
	
	public Folio(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Integer siguiente) {
		this.siguiente = siguiente;
	}

}
