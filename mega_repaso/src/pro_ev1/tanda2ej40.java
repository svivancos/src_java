package pro_ev1;
import java.util.Scanner;
public class tanda2ej40 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Empezamos con la primera fecha: ");
		System.out.print("Introduce el día (dd)> ");
		int dia1 = teclado.nextInt();
		System.out.print("Introduce el mes (mm)> ");
		int mes1 = teclado.nextInt();
		System.out.print("Introduce el año (aaaa)> ");
		int año1 = teclado.nextInt();
		
		if(dia1 >= 1 && dia1 <= 31 && mes1 >= 1 && mes1 <= 12){
			System.out.println("Empezamos con la segunda fecha: ");
			System.out.print("Introduce el día (dd)> ");
			int dia2 = teclado.nextInt();
			System.out.print("Introduce el mes (mm)> ");
			int mes2 = teclado.nextInt();
			System.out.print("Introduce el año (aaaa)> ");
			int año2 = teclado.nextInt();
			if(dia2 >= 1 && dia2 <= 31 && mes2 >= 1 && mes2 <= 12){
				if(año1 > año2){
					System.out.println("La 2 fecha es más antigua");
				}else if(año1 < año2){
					System.out.println("La 1 fecha es más antigua");
				}else if(año1 == año2){
					if(mes1 > mes2){
						System.out.println("La 2 fecha es más antigua");
					}else if(mes1 < mes2){
						System.out.println("La 1 fecha es más antigua");
					}else if(mes1 == mes2){
						if(dia1 > dia2){
							System.out.println("La 2 fecha es más antigua");
						}else if(dia1 < dia2){
							System.out.println("La 1 fecha es más antigua");
						}else if(dia1 == dia2){
							System.out.println("Las fechas son exactas");
						}
					}
				}
			}else{
				System.out.println("La fecha no es correcta, reinicia la aplicación");
			}
		}else{
			System.out.println("La fecha no es correcta, reinicia la aplicación");
		}

	}

}
