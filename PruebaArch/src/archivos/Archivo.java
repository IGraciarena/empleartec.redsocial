package archivos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Archivo implements Serializable {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public Archivo(){
		
	}
	
	/*
	 * public void escribirUsuario(Usuario user){
	 
		
		try {
			File f = new File("/home/tincho/agenda.txt");
			FileWriter fw;
			BufferedWriter bw;
			if(f.exists()){
				fw = new FileWriter(f, true);
				bw = new BufferedWriter(fw);
				bw.newLine();
				bw.write(user.getId()+"%"+user.getNombre()+"%"+user.getPw()+"%"+user.getEmail());
				
			} else {
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				bw.write(user.getId()+"%"+user.getNombre()+"%"+user.getPw()+"%"+user.getEmail());

			}
			fw.close();
			bw.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}*/
		
		
	 public void escribir(){
	 
	    File fichero = null;
	    FileOutputStream fos = null;
	    try{
	    	fichero = new File("C:\Users\alumno");
	        fos = new FileOutputStream(fichero, true);
	        ObjectOutputStream oos= new ObjectOutputStream(fos);
	        oos.writeObject(new Usuario("tincho","martinmdqp92@gmail.com","12345", "Hola que tal" ));
	        //ObjectOutputStream oos1= new ObjectOutputStream(fos);
	        oos.writeObject(new Usuario("nahuel","nahuelmdp@gmail.com","56789", "eaeaeaea"));
	        //ObjectOutputStream oos2= new ObjectOutputStream(fos);
	        oos.writeObject(new Usuario("ivan","ivanmdp@gmail.com","00000", "primera pubbb"));
	        oos.flush();
	        oos.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	       try {    
	       // Nuevamente aprovechamos el finally para 
	       // asegurarnos que se cierra el fichero.
	       } catch (Exception e2) {
	          e2.printStackTrace();
	       }
		}
		
	
	 }
	 
	 public void leer(){
		 File fichero = null;
		 try{
			 fichero = new File("C:\Users\alumno");
			 ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
			 Object aux = ois.readObject();
			 while (aux!=null){
				 if (aux instanceof Usuario){
					 usuarios.add((Usuario) aux);
					 //System.out.println(aux);
				 }
					 					 
				 aux = ois.readObject();
			 }
			 ois.close();
			 
		 } catch (EOFException e2){
			 System.out.println("FIN FICHERO");
		 }	 
		   catch (Exception e3) {
			 e3.printStackTrace();				 
		 } finally {
			 System.out.println("cantidad usuarios: "+ usuarios.size());
			 for (int i = 0; i < usuarios.size(); i++){
				 Usuario user = usuarios.get(i);
				 System.out.println("hola");
				 System.out.println(user);
			 }
			 
		 }
			 
	 }
			
		 
		 
}
