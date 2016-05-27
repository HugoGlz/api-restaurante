package com.mx.restaurante.beans;

import java.io.Serializable;

public class Variante implements Serializable{

	private static final long serialVersionUID = -6482439836780005129L;
	
	private Integer id;
	private String descripcion;
	private Integer estatus;
	
	public Variante(){}

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

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
}
