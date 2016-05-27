package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_mesas")
public class Mesa implements Serializable{

	private static final long serialVersionUID = 6680654413802990078L;

	@Id
	@Column( name = "numero")
	private Integer numero;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "estatus")
	private Integer estatus;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "id_estacion")
	private Estacion estacion;
	@Column( name = "reservada")
	private Integer reservada;
	@Column( name = "fecha_res")
	private Calendar fechaReservacion;
	
	public Mesa(){}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}

	public Integer getReservada() {
		return reservada;
	}

	public void setReservada(Integer reservada) {
		this.reservada = reservada;
	}

	public Calendar getFechaReservacion() {
		return fechaReservacion;
	}

	public void setFechaReservacion(Calendar fechaReservacion) {
		this.fechaReservacion = fechaReservacion;
	}
		
}