package pro_ev2;
import javax.swing.*;
public class string2 {
	public static void main(String[] args) {
		
		String nombre = "Juan";
		String primerApellido = "Pérez";
		String segundoApellido = "López";
		String completo = nombre+" "+primerApellido+" "+segundoApellido;
		int cont = 0;
		for(int i = 0; i < completo.length(); i++){
			if(completo.charAt(i) != ' '){
				cont++;
			}
		}
		
		JOptionPane.showMessageDialog(null, completo+" "+cont);

	}

}
