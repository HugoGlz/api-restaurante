package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

public class Mesa implements Serializable{

	private static final long serialVersionUID = 6680654413802990078L;

	private Integer numero;
	private String descripcion;
	private Integer estatus;
	private Estacion estacion;
	private Integer reservada;
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