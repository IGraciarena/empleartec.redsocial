package servicios;

import java.util.List;
import java.util.Scanner;

import com.empleartec.redsocial.redsocial.*;


import interfaces.UserServices;

public class ServiciosUsuario implements UserServices{
	
	//metodos
	public void agregarAmigo(Usuario user, Usuario nvoUser) {
		if(!user.getAmigos().contains(nvoUser)){
			user.setAmigos(nvoUser);
		}
	}
	public void eliminarAmigo() {
		// TODO Auto-generated method stub
		
	}
	public void modificarCuenta() {
		// TODO Auto-generated method stub
		
	}
	public void login(Datos datos) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Email: ");
		String email = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		int i = 0 ;
		while (i < datos.getUsuarios().size()){
			Usuario user = datos.getUsuarios().get(i);
			if (email == user.getEmail()){
				if (pw == user.getPw()){
					// MOSTRAR PANTALLA PRINCIPAL
					return;
				} else {
					System.out.println("CONTRASEÑA INCORRECTA");				}
			} else {
				i++;
			}
			
		}
		if ( i == datos.getUsuarios().size()){
			System.out.println("NO EXISTIS O EMAIL INCORRECTO");
		}
	}
	public void logout() {
		
		
	}
	public void registrar(Datos datos) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		String nombre = s.nextLine();
		System.out.println("Ingrese Edad: ");
		int edad = s.nextInt();
		System.out.println("Ingrese Email: ");
		String email = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		Usuario nombre1 = new Usuario(nombre,edad,pw,email);
		datos.setUsuarios(nombre1);
		Muro muro1 = nombre1.getMuroUsuario();
		datos.setMurosDeUsuarios(datos.getUsuarios().indexOf(nombre1), muro1);
		
	}
	public void buscarUsuario(Datos datos) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre a buscar: ");
		String nombreaB = s.nextLine();
		int i = 0;
		while (i < datos.getUsuarios().size()){
			Usuario user = datos.getUsuarios().get(i);
			if (nombreaB == user.getNombre()){
					// MUESTRA LISTA USUARIOS Y AGREGA SI QUIERE
			}	
		}
		
	}
	public void publicar(Datos datos) {
		int i = 0;
		Usuario user = datos.getUsuarios().get(i);
		List <Publicacion> publicaciones = user.getMuroUsuario().getPublicaciones();
		Publicacion publicacion = new Publicacion();
		publicacion.setTexto("FALTA INTERFAZ");
		publicaciones.add(publicacion);
		user.getMuroUsuario().setPublicaciones(publicaciones);
		
		
		
		
		
		user.getMuroUsuario().setPublicaciones(publicaciones);
		
	}
	public void eliminar() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		System.out.println("Esta seguro de eliminar su cuenta? ");
	}
	public void seguir() {
		// TODO Auto-generated method stub
		
	}
	public void dejarSeguir() {
		// TODO Auto-generated method stub
		
	}
	public void agregarAmigo() {
		// TODO Auto-generated method stub
		
	}
	public void registrar() {
		
		
	}
}
