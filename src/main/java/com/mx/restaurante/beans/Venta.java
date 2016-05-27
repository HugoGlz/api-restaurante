package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

public class Venta implements Serializable{

	private static final long serialVersionUID = 2624919631792365820L;
	
	private Integer id;
	private Calendar fecha;
	private Integer tipo;
	private Integer tipoNota;
	private Integer turno;
	private Integer mesa;
	private Integer mesero;
	private Integer pax;
	private Calendar abre;
	private Double descuento;
	private Integer usuarioDescuento;
	private Integer usuarioCancelacion;
	private Calendar horaCancelacion;
	private Calendar horaLlegada;
	private Integer estatus;
	
	public Venta(){}

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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getTipoNota() {
		return tipoNota;
	}

	public void setTipoNota(Integer tipoNota) {
		this.tipoNota = tipoNota;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public Integer getMesero() {
		return mesero;
	}

	public void setMesero(Integer mesero) {
		this.mesero = mesero;
	}

	public Integer getPax() {
		return pax;
	}

	public void setPax(Integer pax) {
		this.pax = pax;
	}

	public Calendar getAbre() {
		return abre;
	}

	public void setAbre(Calendar abre) {
		this.abre = abre;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Integer getUsuarioDescuento() {
		return usuarioDescuento;
	}

	public void setUsuarioDescuento(Integer usuarioDescuento) {
		this.usuarioDescuento = usuarioDescuento;
	}

	public Integer getUsuarioCancelacion() {
		return usuarioCancelacion;
	}

	public void setUsuarioCancelacion(Integer usuarioCancelacion) {
		this.usuarioCancelacion = usuarioCancelacion;
	}

	public Calendar getHoraCancelacion() {
		return horaCancelacion;
	}

	public void setHoraCancelacion(Calendar horaCancelacion) {
		this.horaCancelacion = horaCancelacion;
	}

	public Calendar getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Calendar horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

}