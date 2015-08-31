package ent_ev1;
import java.util.*;
import javax.swing.*;
public class Banco {

	private int opc1 = 1;
	private int opc2 = 3;
	private int opc3 = 5;
	private int opc4 = 10;
	
	public int expandir(double not, int opc){
		String str_not = Double.toString(not);
		String[] separar = str_not.split("\\.");
		String ent = separar[0];
		String dec = separar[1];
		int long_cuenta = 0;
		if(opc == 1){
			long_cuenta = opc1;
		}else if(opc == 2){
			long_cuenta = opc2;
		}else if(opc == 3){
			long_cuenta = opc3;
		}else if(opc == 4){
			long_cuenta = opc4;
		}
		int long_datos = ent.length() + dec.length();
		String ceros = "";
		int n_ceros = long_cuenta - long_datos;
		for(int i = 0; i < n_ceros; i++){
			ceros += "0";
		}
		String salida = ent + ceros + dec;
		int resultado = Integer.parseInt(salida);
		//System.out.println(resultado);
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la notación> ");
		double not = teclado.nextDouble();
		System.out.println("1. Cuenta infantil");
		System.out.println("2. Cuenta nómina");
		System.out.println("3. Cuenta autónomo");
		System.out.println("4. Cuenta futbolista");
		System.out.print("Elige una opción> ");
		int opc = teclado.nextInt();
		Banco banco = new Banco();
		banco.expandir(not, opc);
	}
}
