package com.mx.restaurante.beans;

import java.io.Serializable;
import java.util.Calendar;

public class DetalleVenta implements Serializable{

	private static final long serialVersionUID = -6386372164871327800L;
	
	private Integer id;
	private Integer venta;
	private Integer carta;
	private Integer variante;
	private String descripcion;
	private Integer cantidad;
	private Double precio;
	private Double precioNeto;
	private Integer comanda;
	private Integer mesero;
	private Integer mesa;
	private Integer comensal;
	private Calendar horaRegistro;
	private Integer usuarioCancelacion;
	private Calendar horaCancelacion;
	private Integer usuarioCortesia;
	private Calendar horaCortesia;
	private Integer aplicaDescuento;
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