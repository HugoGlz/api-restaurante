package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_det_vtas")
public class DetalleVenta implements Serializable{

	private static final long serialVersionUID = -6386372164871327800L;
	
	@Id @GeneratedValue
	@Column( name = "id_det")
	private Integer id;
	@Column( name = "id_enc")
	private Integer venta;
	@Column( name = "id_carta")
	private Integer carta;
	@Column( name = "id_variante")
	private Integer variante;
	@Column( name = "descripcion")
	private String descripcion;
	@Column( name = "cantidad")
	private Integer cantidad;
	@Column( name = "precio")
	private Double precio;
	@Column( name = "precio_neto")
	private Double precioNeto;
	@Column( name = "comanda")
	private Integer comanda;
	@Column( name = "id_mesero")
	private Integer mesero;
	@Column( name = "id_mesa")
	private Integer mesa;
	@Column( name = "comensal")
	private Integer comensal;
	@Column( name = "hora_registro")
	private Calendar horaRegistro;
	@Column( name = "usr_cancelacion")
	private Integer usuarioCancelacion;
	@Column( name = "hora_cancelacion")
	private Calendar horaCancelacion;
	@Column( name = "usr_cortesia")
	private Integer usuarioCortesia;
	@Column( name = "hora_cortesia")
	private Calendar horaCortesia;
	@Column( name = "aplica_dcto")
	private Integer aplicaDescuento;
	@Column( name = "estatus")
	private Integer estatus;
	
	public DetalleVenta(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVenta() {
		return venta;
	}

	public void setVenta(Integer venta) {
		this.venta = venta;
	}

	public Integer getCarta() {
		return carta;
	}

	public void setCarta(Integer carta) {
		this.carta = carta;
	}

	public Integer getVariante() {
		return variante;
	}

	public void setVariante(Integer variante) {
		this.variante = variante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getPrecioNeto() {
		return precioNeto;
	}

	public void setPrecioNeto(Double precioNeto) {
		this.precioNeto = precioNeto;
	}

	public Integer getComanda() {
		return comanda;
	}

	public void setComanda(Integer comanda) {
		this.comanda = comanda;
	}

	public Integer getMesero() {
		return mesero;
	}

	public void setMesero(Integer mesero) {
		this.mesero = mesero;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public Integer getComensal() {
		return comensal;
	}

	public void setComensal(Integer comensal) {
		this.comensal = comensal;
	}

	public Calendar getHoraRegistro() {
		return horaRegistro;
	}

	public void setHoraRegistro(Calendar horaRegistro) {
		this.horaRegistro = horaRegistro;
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

	public Integer getUsuarioCortesia() {
		return usuarioCortesia;
	}

	public void setUsuarioCortesia(Integer usuarioCortesia) {
		this.usuarioCortesia = usuarioCortesia;
	}

	public Calendar getHoraCortesia() {
		return horaCortesia;
	}

	public void setHoraCortesia(Calendar horaCortesia) {
		this.horaCortesia = horaCortesia;
	}

	public Integer getAplicaDescuento() {
		return aplicaDescuento;
	}

	public void setAplicaDescuento(Integer aplicaDescuento) {
		this.aplicaDescuento = aplicaDescuento;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

}