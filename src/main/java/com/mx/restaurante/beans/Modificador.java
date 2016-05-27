package com.mx.restaurante.beans;

import java.io.Serializable;

public class Modificador implements Serializable{

	private static final long serialVersionUID = 7861352324710503116L;
	
	private Integer id;
	private String descripcion;
	private Double precio;
	private Integer familia;
	private Integer variante;
	private Integer estatus;
	
	public Modificador(){}

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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getFamilia() {
		return familia;
	}

	public void setFamilia(Integer familia) {
		this.familia = familia;
	}

	public Integer getVariante() {
		return variante;
	}

	public void setVariante(Integer variante) {
		this.variante = variante;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

}
