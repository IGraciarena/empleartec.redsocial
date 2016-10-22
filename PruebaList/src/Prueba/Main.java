package Prueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add("Chau");
		lista.add("Abc");
		lista.add("Def");
		
		
		String rutaAcceso = "D:/archi.txt";
		File archivo = new File(rutaAcceso);
		/*BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            //bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            //bw.write("Acabo de crear el fichero de texto.");
        }
        
        for (int i =0; i<lista.size(); i++){
        	String valor = "";
        	valor = lista.get(i);
        	bw.write(valor + "\n" + "\t");
        	bw.write("\n");
        }*/
        
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea = br.readLine();
        while(br.readLine()!=null){
        	System.out.println(linea);
        }
        br.close();
	}

}
