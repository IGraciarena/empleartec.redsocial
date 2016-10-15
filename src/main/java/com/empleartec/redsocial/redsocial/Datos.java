package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Datos{

	private List <Usuario> usuarios = new ArrayList<Usuario>();
	
	public Datos(List<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}
	public List <Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	
}
