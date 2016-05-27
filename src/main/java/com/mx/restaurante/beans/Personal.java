package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Date;

public class Personal implements Serializable{
	
	private static final long serialVersionUID = -2922723048166482903L;
	
	private Integer id;
	private String nombre;
	private String apodo;
	private Integer tipo;
	private Integer nip;
	private Date fechaIngreso;
	private Date fechaBaja;
	private Double sueldoDiario;
	private Integer estatus;
	private Asistencia asistencia;
	private Operacion operacion;
	
	public Personal(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getNip() {
		return nip;
	}

	public void setNip(Integer nip) {
		this.nip = nip;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Double getSueldoDiario() {
		return sueldoDiario;
	}

	public void setSueldoDiario(Double sueldoDiario) {
		this.sueldoDiario = sueldoDiario;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Asistencia getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}

	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}
}