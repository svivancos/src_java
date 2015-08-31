package pro_ev1;
import java.util.Scanner;
public class tanda1ej7 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		String str_num = "";
		int sum = 0;
		int cont = 0;
		do{
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			if(num >= 0){
				str_num += num+" ";
				sum += num;
				cont++;
			}else{
				int media = sum / cont;
				System.out.print("La media de "+str_num+"es "+media);
			}
		}while(num >= 0);
	}
}
