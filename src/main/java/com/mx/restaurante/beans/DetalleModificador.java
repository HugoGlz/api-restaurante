package com.mx.restaurante.beans;

import java.io.Serializable;

public class DetalleModificador implements Serializable{

	private static final long serialVersionUID = -823667392124166486L;
	
	private Integer id;
	private Integer detalle;
	private Integer modificador;
	private String descripcion;
	private Double precio;
	private Integer estatus;
	private Integer prefijo;
	
	public DetalleModificador(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDetalle() {
		return detalle;
	}

	public void setDetalle(Integer detalle) {
		this.detalle = detalle;
	}

	public Integer getModificador() {
		return modificador;
	}

	public void setModificador(Integer modificador) {
		this.modificador = modificador;
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

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Integer getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(Integer prefijo) {
		this.prefijo = prefijo;
	}
}