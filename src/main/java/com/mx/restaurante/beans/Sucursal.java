package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_sucursales")
public class Sucursal implements Serializable{
	
	private static final long serialVersionUID = 3569441677034361363L;
	
	@Id @GeneratedValue
	@Column( name = "id_sucursal")
	private Integer id;
	@Column( name = "nombre")
	private String nombre;
	@Column( name = "rfc")
	private String rfc;
	@Column( name = "razon_social")
	private String razonSocial;
	@Column( name = "direccion")
	private String direccion;
	@Column( name = "num_ext")
	private String numExt;
	@Column( name = "num_int")
	private String numInt;
	@Column( name = "colonia")
	private String colonia;
	@Column( name = "municipio")
	private String municipio;
	@Column( name = "cp")
	private String cp;
	
	public Sucursal(){}

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

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumExt() {
		return numExt;
	}

	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	public String getNumInt() {
		return numInt;
	}

	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}
		
}