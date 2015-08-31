package pro_ev3;
import java.io.*;

import javax.swing.*;
public class Extraer_numeros {

	private String ruta;
	
	public Extraer_numeros(String str){
		ruta = str;
	}
	
	public void num_output(String salida) throws FileNotFoundException{
		
		// Leer
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
			
			// Filtrar
			char[] vec = new char[texto.length()];
			StringReader textoInput = new StringReader(texto);
			CharArrayWriter textoOutput = new CharArrayWriter();
			int car = 0;
			while((car = textoInput.read()) != -1){
				textoOutput.write(car);
			}
			vec = textoOutput.toCharArray();
			
			String numeros = "";
			char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
			for(int v = 0; v < vec.length; v++){
				for(int n = 0; n < nums.length; n++){
					if(vec[v] == nums[n]){
						numeros += vec[v];
					}
				}
			}
			
			// Exportar
			FileOutputStream guardar = new FileOutputStream(salida);
			char num = 0;
			for(int n = 0; n < numeros.length(); n++){
				num = numeros.charAt(n);
				guardar.write((byte)num);
			}
			
			JOptionPane.showMessageDialog(null, "Exportado correctamente");
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
		
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Extraer_numeros extract = new Extraer_numeros("C:/Users/Salvy/Desktop/Cosuchas/prueba1.txt");
		extract.num_output("C:/Users/Salvy/Desktop/Cosuchas/repaso_nums.txt");

	}

}
