package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_estaciones")
public class Estacion implements Serializable{

	private static final long serialVersionUID = -2835190347455553361L;
	
	@Id @GeneratedValue
	@Column( name = "id_estacion")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "piso")
	private Integer piso;
	
	public Estacion(){}

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

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

}
