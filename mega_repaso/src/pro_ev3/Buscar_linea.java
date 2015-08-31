package pro_ev3;
import java.sql.*;
import java.io.*;
import javax.swing.*;
public class Buscar_linea {

	public void palabra(String ruta){
		try{
			// Comprobar si existe
			File file = new File(ruta);
			if(file.exists()){
				// Si existe, leer el fichero
				FileReader leer = new FileReader(file);
				BufferedReader buffer = new BufferedReader(leer);
				String linea = "";
				int n_linea = 1;
				String palabra = JOptionPane.showInputDialog("Escribe la palabra a buscar");
				
				while((linea = buffer.readLine()) != null){
					if(linea.indexOf(palabra) != -1){
						System.out.println("Línea "+n_linea+"> "+linea);
					}
					n_linea++;
				}
				buffer.close();
				leer.close();
			}else{
				JOptionPane.showMessageDialog(null, "El fichero no existe");
			}
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
	}
	public static void main(String[] args) {
		String ruta = JOptionPane.showInputDialog("Escribe la ruta del fichero");
		Buscar_linea buscar = new Buscar_linea();
		buscar.palabra(ruta);
	}

}
