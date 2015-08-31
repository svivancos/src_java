package pro_ev1;
import java.util.Scanner;
public class tanda2ej41 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un día del mes: ");
		int dia = teclado.nextInt();
		System.out.print("Introduce un mes del año: ");
		int mes = teclado.nextInt() - 1;
		int cont = 0;
		int[] v_meses = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 0; i < mes; i++){
			cont += v_meses[i];
		}
		cont += dia;	
		System.out.print(cont);
	}
}
