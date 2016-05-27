package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_familias")
public class Familia implements Serializable{

	private static final long serialVersionUID = 1254516522948255437L;

	@Id @GeneratedValue
	@Column( name = "id_familia")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
//	private Area area;
//	private Grupo grupo;
	@Column( name = "agrupa")
	private Integer agrupa;
	
	public Familia(){}

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

//	public Area getArea() {
//		return area;
//	}
//
//	public void setArea(Area area) {
//		this.area = area;
//	}
//
//	public Grupo getGrupo() {
//		return grupo;
//	}
//
//	public void setGrupo(Grupo grupo) {
//		this.grupo = grupo;
//	}

	public Integer getAgrupa() {
		return agrupa;
	}

	public void setAgrupa(Integer agrupa) {
		this.agrupa = agrupa;
	}
	
}