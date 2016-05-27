package com.mx.restaurante.transfer.object;

import java.io.Serializable;
import java.util.ArrayList;

import com.mx.restaurante.beans.Precio;

public class VentaDetalleData implements Serializable{

	private static final long serialVersionUID = 2076524880081972363L;
	
	private Integer id;
	private Precio variante;
	private String descripcion;
	private Integer cantidad;
	private Double precioNeto;
	private ArrayList<ModificadorData> modificadores;
	
	public VentaDetalleData(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Precio getVariante() {
		return variante;
	}

	public void setVariante(Precio variante) {
		this.variante = variante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecioNeto() {
		return precioNeto;
	}

	public void setPrecioNeto(Double precioNeto) {
		this.precioNeto = precioNeto;
	}

	public ArrayList<ModificadorData> getModificadores() {
		return modificadores;
	}

	public void setModificadores(ArrayList<ModificadorData> modificadores) {
		this.modificadores = modificadores;
	}
}
