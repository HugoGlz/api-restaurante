package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_asistencia")
public class Asistencia implements Serializable{
	
	private static final long serialVersionUID = -2922723048166482903L;
	
	@Id @GeneratedValue
	@Column( name = "id_asistencia")
	private Integer id;
	@Column( name = "fecha")
	private Calendar fecha;
	@Column( name = "estatus")
	private String estatus;
	@Column( name = "tipo")
	private String tipo;
	@Column( name = "id_empleado")
	private Integer empleado;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "id_estacion")
	private Estacion estacion;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name = "id_sucursal")
	private Sucursal sucursal;
	
	public Asistencia(){}

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

	public Integer getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Integer empleado) {
		this.empleado = empleado;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}