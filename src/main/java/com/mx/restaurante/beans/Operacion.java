package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

public class Operacion implements Serializable{

	private static final long serialVersionUID = 3676246806778169360L;
	
	private Integer id;
	private Calendar fecha;
	private Integer usrInicia;
	private Integer cajero;
	private Double fondo;
	private Integer turno;
	private Integer estatus;
	
	public Operacion(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Integer getUsrInicia() {
		return usrInicia;
	}

	public void setUsrInicia(Integer usrInicia) {
		this.usrInicia = usrInicia;
	}

	public Integer getCajero() {
		return cajero;
	}

	public void setCajero(Integer cajero) {
		this.cajero = cajero;
	}

	public Double getFondo() {
		return fondo;
	}

	public void setFondo(Double fondo) {
		this.fondo = fondo;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
}
