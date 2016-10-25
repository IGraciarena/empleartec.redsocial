package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.empleartec.redsocial.redsocial.Datos;
import com.empleartec.redsocial.redsocial.Grupo;
import com.empleartec.redsocial.redsocial.Usuario;

import interfaces.GroupServices;

public class ServiciosGrupo implements GroupServices {

	public void crearGrupo(Datos datos) {
		
		Grupo nuevo = new Grupo(datos.getUsuarios().get(indexLogin), "GRUPO UNO");
		datos.setGrupos(nuevo);
				
	}

	public void agregarParticipantes(Datos datos) {
		String nombreaB;
		List<Usuario> encontrados = new ArrayList<Usuario>();
		for (Usuario i : datos.getUsuarios()){
			if (nombreaB == i.getNombre()){
				encontrados.add(i);
				a = true;
				
			}	
		}
		
		//MOSTRAR CADA USUARIO ENCONTRADO CON BOTON AGREGAR COMO PARTICIPANTE
		if ( a == false){
			System.out.println("NO EXISTE USUARIO");
	}
		
	}

	public void eliminarParticipantes(Datos datos) {
		datos.getGrupos().get(index)
		
	}

	public void buscarUsuario() {
		// TODO Auto-generated method stub
		
	}

	public void abandonarGrupo() {
		// TODO Auto-generated method stub
		
	}

	public void eliminarGrupo() {
		// TODO Auto-generated method stub
		
	}

	public void agregarParticipantes() {
		// TODO Auto-generated method stub
		
	}

	public void eliminarParticipantes() {
		// TODO Auto-generated method stub
		
	}

	
	

}
