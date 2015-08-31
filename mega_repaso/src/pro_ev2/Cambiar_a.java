package pro_ev2;
import javax.swing.*;
import java.io.*;
public class Cambiar_a {

	private String str;
	public String cambiado = "";
	
	public Cambiar_a(String texto){
		str = texto;
	}
	
	public String change(){
		char[] vec = new char[str.length()];
		StringReader textoInput = new StringReader(str);
		CharArrayWriter textoOutput = new CharArrayWriter();
		int car = 0;
		char[] voc = {'a','e','i','o','u','á','é','í','ó','ú'};
		
		try{
			while((car = textoInput.read()) != -1){
				textoOutput.write(car);
			}
			vec = textoOutput.toCharArray();
			
			for(int v = 0; v < vec.length; v++){
				for(int a = 0; a < voc.length; a++){
					if(vec[v] == voc[a]){
						vec[v] = 'a';
					}
				}
			}
			
			for(int v = 0; v < vec.length; v++){
				cambiado += vec[v];
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			textoInput.close();
			textoOutput.close();
		}
	
		return cambiado;
	}
	
	public static void main(String[] args) {
		
		Cambiar_a A = new Cambiar_a("Voy a cambiar todas las vocales minúsculas");
		String salida = A.change();
		JOptionPane.showMessageDialog(null, salida);
	}

}
