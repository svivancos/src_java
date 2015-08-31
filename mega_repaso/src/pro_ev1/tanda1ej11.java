package pro_ev1;
public class tanda1ej11 {
	public static void main(String[] args) {
		int total = 0;
		String str_num = "";
		for(int cont = 0; cont < 20; cont++){
			if(cont % 2 != 0){
				total += cont;
				str_num += cont+" ";
			}
		}
		System.out.print("El producto (suma) de "+str_num+"es "+total);
	}
}
