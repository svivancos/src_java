package pro_ev1;
import java.util.Scanner;
public class tanda1ej5 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
												// (min - (max+1) + max)
		int loto = (int)Math.floor(Math.random()*(0-11)+10);
		System.out.println("Adivina el número. Está entre el 0 y el 10");
		int num;
		do{
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			if(num == loto){
				System.out.println("Has acertado");
			}else{
				System.out.println("Sigue probando");
			}
		}while(num != loto);
	}
}
