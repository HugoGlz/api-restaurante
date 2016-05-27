package com.mx.restaurante.beans;

import java.io.Serializable;

public class Grupo implements Serializable{

	private static final long serialVersionUID = -4973278546499675170L;

	private Integer id;
	private String descripcion;
	private Integer tipo;
	
	public Grupo(){}

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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
}
