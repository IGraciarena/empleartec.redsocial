package com.empleartec.redsocial.redsocial;

import java.awt.List;
import java.util.ArrayList;

public class Muro {
	
	private List <Publicacion> publicaciones   = new ArrayList<>();

	
	public List <Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
}
