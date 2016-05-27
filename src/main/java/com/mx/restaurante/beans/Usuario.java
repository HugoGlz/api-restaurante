package com.mx.restaurante.beans;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = -2922723048166482903L;
	
	private Integer id;
	private String nombre;
	private String password;
	private Integer estatus;
	private String permisosWeb;
	private String permisosAdm;
	
	public Usuario(){}
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getPermisosWeb() {
		return permisosWeb;
	}

	public void setPermisosWeb(String permisosWeb) {
		this.permisosWeb = permisosWeb;
	}

	public String getPermisosAdm() {
		return permisosAdm;
	}

	public void setPermisosAdm(String permisosAdm) {
		this.permisosAdm = permisosAdm;
	}
}
