package com.mx.restaurante.beans;

import java.io.Serializable;

public class Area implements Serializable{

	private static final long serialVersionUID = 5489173755303861275L;
	
	private Integer id;
	private String descripcion;
	private String impresora;
	private Integer unica;
	
	public Area(){}

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

	public String getImpresora() {
		return impresora;
	}

	public void setImpresora(String impresora) {
		this.impresora = impresora;
	}

	public Integer getUnica() {
		return unica;
	}

	public void setUnica(Integer unica) {
		this.unica = unica;
	}
	
}
