package pro_ev1;
import java.util.Scanner;
public class tanda2ej36 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número de 4 cifras: ");
		int num = teclado.nextInt();
		String str_num = "";
		str_num += num;
		if(str_num.length() == 4){
			for(int i = 0; i < str_num.length(); i++){
				System.out.println(str_num.charAt(i));
			}
		}else{
			System.out.print("Esa no es la longitud que te he dicho");
		}
	}
}
