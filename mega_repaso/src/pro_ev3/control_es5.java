package pro_ev3;
import java.io.*;
import javax.swing.*;
public class control_es5 {

	public void mayus(String texto){
		try{
			char[] vec = new char[texto.length()];
			StringReader textoInput = new StringReader(texto);
			CharArrayWriter textoOutput = new CharArrayWriter();
			int car = 0;
			while((car = textoInput.read()) != -1){
				textoOutput.write(car);
			}
			vec = textoOutput.toCharArray();
			
			vec[0] = Character.toUpperCase(vec[0]);
			vec[vec.length - 1] = Character.toUpperCase(vec[vec.length - 1]);
			for(int i = 0; i < vec.length - 1; i++){
				if(vec[i] == ' '){
					vec[i-1] = Character.toUpperCase(vec[i-1]);
					vec[i+1] = Character.toUpperCase(vec[i+1]);
				}
			}
			
			String salida = "";
			for(int i = 0; i < vec.length; i++){
				salida += vec[i];
			}
			
			JOptionPane.showMessageDialog(null, salida);
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
	}
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Escribe un texto");
		control_es5 cambiar = new control_es5();
		cambiar.mayus(texto);
	}

}
