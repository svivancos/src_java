package pro_ev3;
import java.io.*;

import javax.swing.*;

import java.util.*;
public class Sin_espacios {

	public void quitar(String ruta){
		try{
			File file = new File(ruta);
			FileReader leer = new FileReader(file);
			BufferedReader buffer = new BufferedReader(leer);
			String texto = "";
			String aux;
			while((aux = buffer.readLine()) != null){
				texto += aux;
			}
			buffer.close();
			
			char[] vec = texto.toCharArray();
			String salida = "";
			for(int i = 0; i < vec.length; i++){
				if(vec[i] != ' '){
					salida += vec[i];
				}
			}
			JOptionPane.showMessageDialog(null, salida);
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		Sin_espacios esp = new Sin_espacios();
		esp.quitar("C:/Users/Salvy/Desktop/Cosuchas/prueba1.txt");

	}

}
