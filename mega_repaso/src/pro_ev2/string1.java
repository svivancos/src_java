package pro_ev2;
import javax.swing.*;
public class string1 {
	public static void main(String[] args) {
		
		String nombre = "Juan";
		String apellido = "Pérez";
		int l_nom = nombre.length();
		int l_ape = apellido.length();
		
		JOptionPane.showMessageDialog(null, nombre+" "+l_nom+"   "+apellido+" "+l_ape);
		

	}

}
