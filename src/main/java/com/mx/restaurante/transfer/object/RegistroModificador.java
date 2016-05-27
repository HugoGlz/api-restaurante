package com.mx.restaurante.transfer.object;

import java.io.Serializable;

public class RegistroModificador implements Serializable{

	private static final long serialVersionUID = -6882254734016447812L;
	
	private String modificadorTipo;
	private String modificadorValor;
	
	public RegistroModificador(){}

	public String getModificadorTipo() {
		return modificadorTipo;
	}

	public void setModificadorTipo(String modificadorTipo) {
		this.modificadorTipo = modificadorTipo;
	}

	public String getModificadorValor() {
		return modificadorValor;
	}

	public void setModificadorValor(String modificadorValor) {
		this.modificadorValor = modificadorValor;
	};
}