package pro_ev1;
import java.util.Scanner;
public class tanda2ej47 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n1 = teclado.nextInt();
		System.out.print("Introduce un número: ");
		int n2 = teclado.nextInt();
		int div_n1 = 0, div_n2 = 0;
		for(int i = 1; i < n1 - 1; i++){
			if(n1 % i == 0){
				div_n1 += i;
			}
		}
		for(int i = 1; i < n2 - 1; i++){
			if(n2 % i == 0){
				div_n2 += i;
			}
		}
		if(div_n1 == n2 && div_n2 == n1){
			System.out.print("Son amiguitos");
		}else{
			System.out.print("Son archienemigos");
		}
	}
}
