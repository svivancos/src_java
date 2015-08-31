package pro_ev2;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class Acaba_o {

	private String str;
	
	public Acaba_o(String texto){
		str = texto;
	}
	
	public void contar(){
		int cont = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'o'){
				if(i == str.length() - 1){
					cont++;
				}else if(str.charAt(i+1) == ' '){
					cont++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, cont);
	}
	
	public void contar_palabras(){
		StringTokenizer token = new StringTokenizer(str);
		int palabras = token.countTokens();
		JOptionPane.showMessageDialog(null, palabras);
	}
	
	public static void main(String[] args) {
		
		Acaba_o acaba = new Acaba_o("En un lugar de la mancha, de cuyo nombre no puedo acordarme");
		acaba.contar();
		acaba.contar_palabras();

	}

}
