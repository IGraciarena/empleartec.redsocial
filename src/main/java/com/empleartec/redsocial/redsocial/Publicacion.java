package com.empleartec.redsocial.redsocial;

import java.awt.List;
import java.util.ArrayList;

public class Publicacion {
	
	private String txt;
	private boolean meGusta;
	private List <Comentario> comentarios = new ArrayList<Comentario>();
	private long ID;
	
	
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public boolean isMeGusta() {
		return meGusta;
	}
	public void setMeGusta(boolean meGusta) {
		this.meGusta = meGusta;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	
}
