package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_areas")
public class Area implements Serializable{

	private static final long serialVersionUID = 5489173755303861275L;
	
	@Id @GeneratedValue
	@Column( name = "id_area")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "impresora")
	private String impresora;
	@Column( name = "unica")
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
