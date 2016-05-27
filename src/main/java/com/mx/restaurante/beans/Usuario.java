package com.mx.restaurante.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuarios")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = -2922723048166482903L;
	
	@Id @GeneratedValue
	@Column( name = "id_usuario")
	private Integer id;
	@Column( name = "nombre")
	private String nombre;
	@Column( name = "psw")
	private String password;
	@Column( name = "estatus")
	private Integer estatus;
	@Column( name = "permisos_web")
	private String permisosWeb;
	@Column( name = "permisos_adm")
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
