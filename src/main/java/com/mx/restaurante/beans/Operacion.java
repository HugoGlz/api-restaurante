package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_operaciones")
public class Operacion implements Serializable{

	private static final long serialVersionUID = 3676246806778169360L;
	
	@Id @GeneratedValue
	@Column( name = "id_oper")
	private Integer id;
	@Column( name = "fecha")
	private Calendar fecha;
	@Column( name = "usr_inicia")
	private Integer usrInicia;
	@Column( name = "id_cajero")
	private Integer cajero;
	@Column( name = "fondo")
	private Double fondo;
	@Column( name = "turno")
	private Integer turno;
	@Column( name = "estatus")
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
