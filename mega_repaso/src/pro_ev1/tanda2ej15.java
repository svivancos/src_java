package pro_ev1;
public class tanda2ej15 {
	public static void main(String[] args) {
		String[] v_nom = {"Salva","Laura","Nano","Tirsa","Mar"};
		char[] v_sexo = {'V','M','V','M','M'};
		int v = 0, m = 0;
		for(int i = 0; i < v_sexo.length; i++){
			System.out.println(v_nom[i]+" "+v_sexo[i]);
			if(v_sexo[i] == 'V'){
				v++;
			}else if(v_sexo[i] == 'M'){
				m++;
			}
		}
		System.out.print("Hay "+v+" varones y "+m+" mujeres");
	}
}
