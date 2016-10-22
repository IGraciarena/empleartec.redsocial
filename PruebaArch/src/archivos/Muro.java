package archivos;

import java.io.Serializable;

public class Muro implements Serializable{
	
	private String publicaciones;
	
	
	public Muro(String publicacion){
		
		this.publicaciones  = "----------------------------------" 
							+ publicacion
							+ "----------------------------------";
	}


	public String getPublicaciones() {
		return publicaciones;
	}


	public void setPublicaciones(String publicaciones) {
		this.publicaciones += publicaciones;
	}
	
	

}
