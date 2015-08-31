package pro_ev2;
import javax.swing.*;
public class string4 {
	public static void main(String[] args) {
		
		String str1 = JOptionPane.showInputDialog("Introduce algo: ");
		String str2 = JOptionPane.showInputDialog("Introduce algo: ");
		
		if(str1.equals(str2)){
			JOptionPane.showMessageDialog(null, "Son iguales");
		}else{
			JOptionPane.showMessageDialog(null, "Son distintos");
		}
	}

}
