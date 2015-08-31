package pro_ev2;
import java.io.*;

import javax.swing.*;

import java.util.*;
public class Contar_char {

	private String str;
	
	public Contar_char(String frase){
		str = frase;
	}
	
	public void Contar(){
		char[] vec = new char[str.length()];
		StringReader textoInput = new StringReader(str);
		CharArrayWriter textoOutput = new CharArrayWriter();
		
		char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l',
		'm','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D',
		'E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V',
		'W','X','Y','Z','á','é','í','ó','ú'};
		
		char[] num = {'1','2','3','4','5','6','7','8','9','0'};
		
		int car = 0, c_letras = 0, c_num = 0, c_esp = 0;
		
		try{
			while((car = textoInput.read()) != -1){
				textoOutput.write(car);
			}
			vec = textoOutput.toCharArray();
			
			for(int v = 0; v < vec.length; v++){
				for(int l = 0; l < letras.length; l++){
					if(vec[v] == letras[l]){
						c_letras++;
					}
				}
			}
			
			for(int v = 0; v < vec.length; v++){
				for(int n = 0; n < num.length; n++){
					if(vec[v] == num[n]){
						c_num++;
					}
				}
			}
			
			for(int v = 0; v < vec.length; v++){
				if(vec[v] == ' '){
					c_esp++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Letras: "+c_letras+"\n"+"Números: "+c_num+"\n"+"Espacios: "+c_esp);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			textoInput.close();
			textoOutput.close();
		}
	}
	
	public static void main(String[] args) {
		Contar_char cont = new Contar_char("Hola, vivo en Las Américas, 25, 15-D");
		cont.Contar();
	}
}

