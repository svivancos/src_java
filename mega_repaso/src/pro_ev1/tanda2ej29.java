package pro_ev1;
public class tanda2ej29 {
	public static void main(String[]args){
		int[] v_num = {20,45,7,9,45,95,10,23,11,99,30,0,-4};
		int mayor = v_num[0], menor = v_num[0];
		for(int i = 1; i < v_num.length; i++){
			if(v_num[i] < menor){
				menor = v_num[i];
			}else if(v_num[i] > mayor){
				mayor = v_num[i];
			}
		}
		System.out.print("El menor es el "+menor+" y el mayor es el "+mayor);
	}
}
