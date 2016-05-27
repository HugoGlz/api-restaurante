package com.mx.restaurante.transfer.object;

import java.io.Serializable;

import com.mx.restaurante.beans.Modificador;

public class ModificadorData implements Serializable{

	private static final long serialVersionUID = -4976362425220774976L;
	
	private Integer id;
	private Modificador modificador;
	private String descripcion;
	private Double precio;
	private Integer prefijo;
	
	public ModificadorData(){}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Modificador getModificador() {
		return modificador;
	}
	public void setModificador(Modificador modificador) {
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
	public Integer getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(Integer prefijo) {
		this.prefijo = prefijo;
	}

}
