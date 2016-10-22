package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Datos{

	private List <Usuario> usuarios = new ArrayList<Usuario>();
	private List <Muro> murosDeUsuarios = new ArrayList <Muro>();
	private List <Publicacion> publicaciones = new ArrayList <Publicacion>();
	private List <Grupo> grupos = new ArrayList <Grupo>();
	
	public Datos(/*List<Usuario> usuarios,List<Muro>muroDeUsuarios,List <Publicacion> publicaciones,List <Grupo> grupos*/) {
		super();
		/*this.usuarios = usuarios;
		this.murosDeUsuarios = muroDeUsuarios;
		this.publicaciones = publicaciones;
		this.grupos = grupos;*/
		
	}
	
	
	public List <Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public List<Muro> getMurosDeUsuarios() {
		return murosDeUsuarios;
	}


	public void setMurosDeUsuarios(int index, Muro muroUsuario) {
		this.murosDeUsuarios.add(index, muroUsuario);
	}


	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}


	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}


	public List<Grupo> getGrupos() {
		return grupos;
	}


	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	
	
}
