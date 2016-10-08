package com.empleartec.redsocial.redsocial;

public class Usuario {
	
	private long ID;
	private String pw;
	private String nombre;
	private int edad;
	private Muro muroUsuario;
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Muro getMuroUsuario() {
		return muroUsuario;
	}
	public void setMuroUsuario(Muro muroUsuario) {
		this.muroUsuario = muroUsuario;
	}
	
	
}
