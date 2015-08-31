package pro_ev3;
import java.io.*;
import javax.swing.*;
public class Contar_car {

	public void recuento(String ruta, char car){
		try{
			File file = new File(ruta);
			FileReader leer = new FileReader(file);
			BufferedReader buffer = new BufferedReader(leer);
			String txt = "";
			String aux;
			while((aux = buffer.readLine()) != null){
				txt += aux;
			}
			buffer.close();
			
			int cont = 0;
			for(int i = 0; i < txt.length(); i++){
				if(txt.charAt(i) == car){
					cont++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Hay "+cont+" \""+car+"\"");
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		String ruta = JOptionPane.showInputDialog("Escribe la ruta");
		char car = JOptionPane.showInputDialog("Escribe el carácter").charAt(0);
		Contar_car contar = new Contar_car();
		contar.recuento(ruta, car);
	}

}
