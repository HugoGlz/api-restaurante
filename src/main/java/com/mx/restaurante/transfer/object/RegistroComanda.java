package com.mx.restaurante.transfer.object;

import java.io.Serializable;
import java.util.ArrayList;

import com.mx.restaurante.beans.Personal;

public class RegistroComanda implements Serializable {

	private static final long serialVersionUID = -2882639870971336418L;
	
	private Integer mesa;
	private Integer comensales;
	private Integer producto;
	private Integer variante;
	private Integer comensal;
	private Integer venta;
	private ArrayList<RegistroModificador> modificadores;
	private Personal usuario;
	
	public RegistroComanda(){}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public Integer getComensales() {
		return comensales;
	}

	public void setComensales(Integer comensales) {
		this.comensales = comensales;
	}

	public Integer getProducto() {
		return producto;
	}

	public void setProducto(Integer producto) {
		this.producto = producto;
	}

	public Integer getVariante() {
		return variante;
	}

	public void setVariante(Integer variante) {
		this.variante = variante;
	}

	public Integer getComensal() {
		return comensal;
	}

	public void setComensal(Integer comensal) {
		this.comensal = comensal;
	}

	public Integer getVenta() {
		return venta;
	}

	public void setVenta(Integer venta) {
		this.venta = venta;
	}

	public ArrayList<RegistroModificador> getModificadores() {
		return modificadores;
	}

	public void setModificadores(ArrayList<RegistroModificador> modificadores) {
		this.modificadores = modificadores;
	}

	public Personal getUsuario() {
		return usuario;
	}

	public void setUsuario(Personal usuario) {
		this.usuario = usuario;
	}

}
