package pro_ev1;
import java.util.Scanner;
public class tanda2ej25 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n_pares = 0;
		int n_impares = 0;
		int t_pares = 0;
		int t_impares = 0;
		int n_ceros = 0;
		int num;
		String pares = "";
		String impares = "";
		
		do{
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			if(num == -1){
				System.out.println("Se acabó");
			}else if(num == 0){
				n_ceros++;
			}else if(num % 2 == 0){
				t_pares += num;
				n_pares++;
				pares += num+" ";
			}else if(num % 2 == 1){
				t_impares += num;
				n_impares++;
				impares += num+" ";
			}
		}while(num != -1);
		
		if(t_pares != 0){
			int m_pares = t_pares / n_pares;
			System.out.println("La media de "+pares+"es "+m_pares);
		}else{
			System.out.println("No has introducido ningún par");
		}
		
		if(t_impares != 0){
			int m_impares = t_impares / n_impares;
			System.out.println("La media de "+impares+"es "+m_impares);
		}else{
			System.out.println("No has introducido ningún impar");
		}
		
		System.out.println("Has introducido "+n_ceros+" ceros");
	}
}
