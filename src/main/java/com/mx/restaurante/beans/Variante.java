package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_variantes")
public class Variante implements Serializable{

	private static final long serialVersionUID = -6482439836780005129L;
	
	@Id @GeneratedValue
	@Column( name = "id_variante")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "estatus")
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
