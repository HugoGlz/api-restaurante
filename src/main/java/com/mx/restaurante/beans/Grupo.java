package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_grupos")
public class Grupo implements Serializable{

	private static final long serialVersionUID = -4973278546499675170L;

	@Id @GeneratedValue
	@Column( name = "id_grupo")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "tipo")
	private Integer tipo;
	
	public Grupo(){}

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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
}
