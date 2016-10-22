package archivos;
import java.io.Serializable;

public class Usuario implements Serializable {

	private String nombre;
	private int id = 0;
	private String email;
	private String pw;
	private Muro publicaciones;
	
	public Usuario(String nombre, String email,String pw) {
		this.nombre = nombre;
		this.email = email;
		this.pw = pw;
		id++;
	}
	
	public Usuario(String nombre, String email,String pw,String publicacionInic) {
		this.nombre = nombre;
		this.email = email;
		this.pw = pw;
		Muro publicaciones = new Muro(publicacionInic);
		id++;
	}
	
	public void imprimir(){
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getMuro(){
		return publicaciones.getPublicaciones();
	}
	
	public void publicar(String texto){
		String publicacion = "----------------------------------" 
							+ texto
							+ "----------------------------------";
		this.publicaciones.setPublicaciones(publicacion);
	}
	
	public String toString(){
		return this.id+ " -- "+this.nombre+" -- Pass: "+this.pw+" -- Email: "+this.email;
				//+ " -- " + this.publicaciones.getPublicaciones();
		
	}
	
	
}
