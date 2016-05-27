package com.mx.restaurante.transfer.object;

import java.io.Serializable;
import java.util.ArrayList;

import com.mx.restaurante.beans.Mesa;

public class VentaData implements Serializable{

	private static final long serialVersionUID = -8107929613217092243L;
	
	private Integer id;
	private Mesa mesa;
	private Integer pax;
	private ArrayList<VentaDetalleData> detalles;
	
	public VentaData(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Integer getPax() {
		return pax;
	}

	public void setPax(Integer pax) {
		this.pax = pax;
	}

	public ArrayList<VentaDetalleData> getDetalles() {
		return detalles;
	}

	public void setDetalles(ArrayList<VentaDetalleData> detalles) {
		this.detalles = detalles;
	}

}
