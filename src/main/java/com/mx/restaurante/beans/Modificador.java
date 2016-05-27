package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_modificadores")
public class Modificador implements Serializable{

	private static final long serialVersionUID = 7861352324710503116L;
	
	@Id @GeneratedValue
	@Column( name = "id_modificador")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "precio")
	private Double precio;
	@Column( name = "id_familia")
	private Integer familia;
	@Column( name = "id_variante")
	private Integer variante;
	@Column( name = "estatus")
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
