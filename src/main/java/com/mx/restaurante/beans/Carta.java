package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tbl_carta")
public class Carta implements Serializable{

	private static final long serialVersionUID = -2932735639857627849L;

	@Id @GeneratedValue
	@Column( name = "id_carta")
	private Integer id;
	@Column( name = "descripcion")
	private String descripcion;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@Column( name = "familia")
//	private Familia familia;
	@Column( name = "unidad")
	private String unidad;
	@Column( name = "aplica_dcto")
	private Integer aplicaDescuento;
	@Column( name = "estatus")
	private Integer estatus;
	
	public Carta(){}

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

//	public Familia getFamilia() {
//		return familia;
//	}
//
//	public void setFamilia(Familia familia) {
//		this.familia = familia;
//	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public Integer getAplicaDescuento() {
		return aplicaDescuento;
	}

	public void setAplicaDescuento(Integer aplicaDescuento) {
		this.aplicaDescuento = aplicaDescuento;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
}