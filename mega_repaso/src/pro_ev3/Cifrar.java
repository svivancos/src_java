package pro_ev3;
import javax.swing.*;
import java.io.*;
public class Cifrar {

	public void cifrado(String ruta1, String ruta2){
		try{
			File file1 = new File(ruta1);
			FileReader leer1 = new FileReader(file1);
			BufferedReader buffer1 = new BufferedReader(leer1);
			String texto1 = "";
			String aux1;
			while((aux1 = buffer1.readLine()) != null){
				texto1 += aux1;
			}
			buffer1.close();
			
			File file2 = new File(ruta2);
			FileReader leer2 = new FileReader(file2);
			BufferedReader buffer2 = new BufferedReader(leer2);
			String texto2 = "";
			String aux2;
			while((aux2 = buffer2.readLine()) != null){
				texto2 += aux2;
			}
			buffer2.close();
			
			String corto;
			String largo;
			if(texto1.length() < texto2.length()){
				corto = texto1;
				largo = texto2;
			}else{
				corto = texto2;
				largo = texto1;
			}
			
			String largo1 = largo.substring(0, corto.length()); 
			String largo2 = largo.substring(corto.length()); 
			String cifrado = "";
			for(int i = 0; i < corto.length(); i++){
				cifrado += texto1.charAt(i);
				cifrado += largo1.charAt(i);
			}
			
			for(int i = 0; i < largo2.length(); i++){
				cifrado += largo2.charAt(i);	
			}
			
			FileOutputStream guardar = new FileOutputStream("C:/Users/Salvy/Desktop/Cosuchas/cifradorrr.txt");
			char car;
			for(int i = 0; i < cifrado.length(); i++){
				car = cifrado.charAt(i);
				guardar.write((byte)car);
			}
			
			JOptionPane.showMessageDialog(null, "Cifrado y exportado");
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
	}
	
	public void descifrado(String ruta, String ruta1){
		try{
			File file = new File(ruta);
			FileReader leer = new FileReader(file);
			BufferedReader buffer = new BufferedReader(leer);
			String cifrado = "";
			String aux;
			while((aux = buffer.readLine()) != null){
				cifrado += aux;
			}
			buffer.close();
			
			File file1 = new File(ruta1);
			FileReader leer1 = new FileReader(file1);
			BufferedReader buffer1 = new BufferedReader(leer1);
			String fichero1 = "";
			String aux1;
			while((aux1 = buffer1.readLine()) != null){
				fichero1 += aux1;
			}
			buffer1.close();
			
			String descifrado = "";
			descifrado += cifrado.charAt(0);
			for(int i = 1; i < fichero1.length() * 2; i++){
				if(i % 2 == 0){
					descifrado += cifrado.charAt(i);
				}
			}
			descifrado += " ";
			for(int i = 1; i < cifrado.length(); i++){
				if(i % 2 != 0 && i <= fichero1.length() * 2){
					descifrado += cifrado.charAt(i);
				}else if(i >= fichero1.length() * 2){
					descifrado += cifrado.charAt(i);
				}
			}
			System.out.println(descifrado);
			
			
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		String ruta1 = "C:/Users/Salvy/Desktop/Cosuchas/entrada1.txt";
		String ruta2 = "C:/Users/Salvy/Desktop/Cosuchas/entrada2.txt";
		Cifrar app = new Cifrar();
		app.cifrado(ruta1, ruta2);
		String ruta = "C:/Users/Salvy/Desktop/Cosuchas/cifradorrr.txt";
		app.descifrado(ruta, ruta1);

	}

}
