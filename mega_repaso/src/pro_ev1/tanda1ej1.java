package pro_ev1;
import java.util.Scanner;
public class tanda1ej1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		do{
			System.out.print("Introduce un número y te digo su cuadrado: ");
			num = teclado.nextInt();
			if(num >= 0){
				int cuad = num*num;
				System.out.println(cuad);
			}else{
				System.out.print("Aplicación cerrada");
			}
		}while(num >= 0);

	}

}
