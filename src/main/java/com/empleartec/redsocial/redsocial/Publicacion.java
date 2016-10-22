package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {
	
	private String texto;
	private int meGusta;
	
	
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Publicacion (){
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public int getMeGusta() {
		return meGusta;
	}
	public void setMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}


}
