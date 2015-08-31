package pro_ev3;
import java.io.*;
import javax.swing.*;
public class Concatenar {

	public void pegar(String f1, String f2, String f3){
		try{
			File file1 = new File(f1);
			FileReader leer1 = new FileReader(file1);
			BufferedReader buffer1 = new BufferedReader(leer1);
			String txt1 = "";
			String aux1;
			while((aux1 = buffer1.readLine()) != null){
				txt1 += aux1;
			}
			buffer1.close();
			
			File file2 = new File(f2);
			FileReader leer2 = new FileReader(file2);
			BufferedReader buffer2 = new BufferedReader(leer2);
			String txt2 = "";
			String aux2;
			while((aux2 = buffer2.readLine()) != null){
				txt2 += aux2;
			}
			buffer2.close();
			
			String txt_f = txt1+" "+txt2;
			FileOutputStream guardar = new FileOutputStream(f3);
			char car = 0;
			for(int i = 0; i < txt_f.length(); i++){
				car = txt_f.charAt(i);
				guardar.write((byte)car);
			}
			
			JOptionPane.showMessageDialog(null, "Guardado con éxito");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Concatenar concatenar = new Concatenar();
		String f1 = "C:/Users/Salvy/Desktop/Cosuchas/entrada1.txt";
		String f2 = "C:/Users/Salvy/Desktop/Cosuchas/entrada2.txt";
		String f3 = "C:/Users/Salvy/Desktop/Cosuchas/examen_pegar.txt";
		concatenar.pegar(f1, f2, f3);

	}

}
