package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_det_mod")
public class DetalleModificador implements Serializable{

	private static final long serialVersionUID = -823667392124166486L;
	
	@Id @GeneratedValue
	@Column( name = "id_det_mod")
	private Integer id;
	@Column( name = "id_det")
	private Integer detalle;
	@Column( name = "id_modificador")
	private Integer modificador;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "precio")
	private Double precio;
	@Column( name = "estatus")
	private Integer estatus;
	@Column( name = "prefijo")
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