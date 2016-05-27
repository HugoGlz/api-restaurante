package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_precios")
public class Precio implements Serializable{

	private static final long serialVersionUID = -5678995777392571621L;
	
	@Id @GeneratedValue
	@Column( name = "id_precio")
	private Integer id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "id_carta")
	private Carta carta;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "id_variante")
	private Variante variante;
	@Column( name = "precio")
	private Double precio;
	
	public Precio(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Variante getVariante() {
		return variante;
	}

	public void setVariante(Variante variante) {
		this.variante = variante;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}