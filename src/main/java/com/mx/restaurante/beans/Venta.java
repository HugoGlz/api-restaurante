package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_enc_vtas")
public class Venta implements Serializable{

	private static final long serialVersionUID = 2624919631792365820L;
	
	@Id @GeneratedValue
	@Column( name = "id_enc")
	private Integer id;
	@Column( name = "fecha")
	private Calendar fecha;
	@Column( name = "tipo")
	private Integer tipo;
	@Column( name = "tipo_nota")
	private Integer tipoNota;
	@Column( name = "turno")
	private Integer turno;
	@Column( name = "num_mesa")
	private Integer mesa;
	@Column( name = "id_mesero")
	private Integer mesero;
	@Column( name = "pax")
	private Integer pax;
	@Column( name = "abre")
	private Calendar abre;
	@Column( name = "descuento")
	private Double descuento;
	@Column( name = "usr_descuento")
	private Integer usuarioDescuento;
	@Column( name = "usr_cancelacion")
	private Integer usuarioCancelacion;
	@Column( name = "hora_cancelacion")
	private Calendar horaCancelacion;
	@Column( name = "hora_llegada")
	private Calendar horaLlegada;
	@Column( name = "estatus")
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