package servicios;

import java.util.Scanner;

import com.empleartec.redsocial.redsocial.Datos;
import com.empleartec.redsocial.redsocial.Usuario;

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
	public void login() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		String nombre = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();	
	}
	public void logout() {
		
		
	}
	public void registrar(Datos listaUsuarios) {
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
		listaUsuarios.setUsuarios(nombre1);
	}
	public void buscarUsuario() {
		// TODO Auto-generated method stub
		
	}
	public void publicar() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}
}
