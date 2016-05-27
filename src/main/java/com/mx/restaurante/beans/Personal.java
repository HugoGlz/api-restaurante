package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_personal")
public class Personal implements Serializable{
	
	private static final long serialVersionUID = -2922723048166482903L;
	
	@Id @GeneratedValue
	@Column( name = "id_personal")
	private Integer id;
	@Column( name = "nombre")
	private String nombre;
	@Column( name = "apodo")
	private String apodo;
	@Column( name = "tipo")
	private Integer tipo;
	@Column( name = "nip")
	private Integer nip;
	@Column( name = "fecha_ingreso")
	private Date fechaIngreso;
	@Column( name = "fecha_baja")
	private Date fechaBaja;
	@Column( name = "sueldo_diario")
	private Double sueldoDiario;
	@Column( name = "estatus")
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