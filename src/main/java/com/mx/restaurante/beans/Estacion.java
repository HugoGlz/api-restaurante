package com.mx.restaurante.beans;

import java.io.Serializable;

public class Estacion implements Serializable{

	private static final long serialVersionUID = -2835190347455553361L;
	
	private Integer id;
	private String descripcion;
	private Integer piso;
	
	public Estacion(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

}
