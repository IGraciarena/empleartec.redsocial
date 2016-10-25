package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.empleartec.redsocial.redsocial.*;


import interfaces.UserServices;


public class ServiciosUsuario implements UserServices{
	
	private int indexLogin;  //indice del usuario logueado
	
	//metodos
	public void agregarAmigo(Datos datos, Usuario amigo) {
		Usuario user = datos.getUsuarios().get(indexLogin); 	//traigo al usuario
		user.setAmigos(amigo,  true);							//agrego amigo
		datos.setUsuarios(user);							//lo agrego modificado en datos
	}
	
	public void eliminarAmigo(Datos datos, Usuario eliminar) {
		Usuario user = datos.getUsuarios().get(indexLogin);		//traigo usuario
		for (int i = 0; i < user.getAmigos().size(); i++){		//recorro lista Amigos
			if (user.compareTo(eliminar) == 0){					//busco por nombre y email
				user.setAmigos(eliminar, false);				//elimino amigo
			}
		}		
	}
	
	public void modificarCuenta(Datos datos) {
		Usuario user = datos.getUsuarios().get(indexLogin);
		
		if(button1){			//FALTAN LOS BUTTONS!
			String email;
			user.setEmail(email);
			datos.setUsuarios(user);
		}else if(button2){		//FALTAN LOS BUTTONS!
			String pw;
			user.setPw(pw);
			datos.setUsuarios(user);
		}
	}
	
	public void login(Datos datos) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Email: ");
		String email = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		boolean a = false;
		for (Usuario i : datos.getUsuarios()){
			if (email == i.getEmail()){
				if (pw == i.getPw()){
					datos.setIndexLogin(datos.getUsuarios().indexOf(i));
					a = true;
					// MOSTRAR PANTALLA PRINCIPAL
					return;
				}else System.out.println("CONTRASEÑA INCORRECTA");				
			}
		}
		if ( a == false) System.out.println("NO EXISTIS O EMAIL INCORRECTO");
	}
	
	public void logout(Datos datos) {
		// PANTALLA DE "ESTA SEGURO?"
		//PANTALLA INICIO/REGISTRO
		
	}
	
	public void registrar(Datos datos){
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		String nombre = s.nextLine();
		System.out.println("Ingrese Edad: ");
		int edad = s.nextInt();
		System.out.println("Ingrese Email: ");
		String email = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		Usuario user = new Usuario(nombre,edad,pw,email);
		datos.setUsuarios(user);
		
	}
	
	public void buscarUsuario(Datos datos){
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre a buscar: ");
		String nombreaB = s.nextLine();
		boolean a = false;
		for (Usuario i : datos.getUsuarios()){
				if (nombreaB == i.getNombre()){
					a = true;
					// MUESTRA LISTA USUARIOS Y AGREGA SI QUIERE
				}	
		}
		if ( a == false){
			System.out.println("NO EXISTE USUARIO");
		}
	}
	
	public void publicar(Datos datos){
		Usuario user = datos.getUsuarios().get(indexLogin);
		List <Publicacion> publicaciones = user.getMuroUsuario().getPublicaciones();
		Publicacion publicacion = new Publicacion();
		publicacion.setTexto("FALTA INTERFAZ");
		publicaciones.add(publicacion);
		user.getMuroUsuario().setPublicaciones(publicaciones);
		datos.setUsuarios(user);			
	}
	
	public void eliminar(Datos datos){
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		System.out.println("Esta seguro de eliminar su cuenta? "); 	// ESTA ES OTRA PANTALLA
		
		if(button1){
			List <Usuario> usuarios = new ArrayList<Usuario>();
			//OPCION 
			usuarios = datos.getUsuarios();
			usuarios.remove(indexLogin);
			datos.setListaUsuarios(usuarios);
			
			//OPCION 2
			datos.getUsuarios().remove(indexLogin);
		}else if(button2){
			// VUELVE A LA PANTALLA X
		}
	}

	public void seguir(Datos datos) {
		Usuario user = datos.getUsuarios().get(datos.getIndexLogin());
		
		user.setSeguidores(seguidor);
		
	}
	

	public void dejarSeguir(Datos datos) {
		// TODO Auto-generated method stub
		
	}
	
	public int getIndexLogin() {
		return indexLogin;
	}

}
