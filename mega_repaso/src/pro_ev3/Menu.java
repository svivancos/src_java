package pro_ev3;
import javax.swing.*;
public class Menu {

	public void crear(int num){
		System.out.print("MEN�");
		int cont = 1;
		String str_cont;
		String[][] matriz = new String[num][2];
		for(int x = 0; x < matriz.length; x++){
			for(int y = 0; y < matriz[x].length; y++){
				str_cont = Integer.toString(cont);
				if(y == 0){
					matriz[x][y] = str_cont+">";
				}else{
					matriz[x][y] = JOptionPane.showInputDialog("Escribe el nombre del �tem");
					cont++;
				}
			}
		}
		
		for(int x = 0; x < matriz.length; x++){
			System.out.println();
			for(int y = 0; y < matriz[x].length; y++){
				System.out.print(matriz[x][y]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe el n�mero de �tems"));
		Menu menu = new Menu();
		menu.crear(num);
	}
}
