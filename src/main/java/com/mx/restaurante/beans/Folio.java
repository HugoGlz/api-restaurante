package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_folios")
public class Folio implements Serializable{

	private static final long serialVersionUID = -4217460003348229031L;
	
	@Id @GeneratedValue
	@Column( name = "id_folios")
	private Integer id;
	@Column( name = "siguiente")
	private Integer siguiente;
	
	public Folio(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Integer siguiente) {
		this.siguiente = siguiente;
	}

}
