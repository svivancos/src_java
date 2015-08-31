package pro_ev1;
public class tanda3ej7 {
	public static void main(String[] args) {
		
		int[] vec = {5,6,8,9,7,4,3,10,1};

		System.out.print("Sin orden: ");
		for(int i = 0; i < vec.length; i++){
			System.out.print(vec[i]+" ");
		}
		
		System.out.println();
		System.out.print("Ordenado: ");
		int i, j, menor, pos, tmp;
		// FASE 1, cogemos el primer valor lo damos como si fuera el menor y posteriormente probaremos el resto
		for (i = 0; i < vec.length - 1; i++) {
			menor = vec[i];
			pos = i; 
			// FASE 2, con ese teórico menor lo cotejamos con los demás en busca de uno menor
			for (j = i + 1; j < vec.length; j++){ 
					if (vec[j] < menor) { 
						menor = vec[j]; 
						pos = j;
					}
			}
			// FASE 3, si hay uno menor se intercambian las posiciones
			if (pos != i){ 
				tmp = vec[i];
				vec[i] = vec[pos];
				vec[pos] = tmp;
			}
		}

		for(int k = 0; k < vec.length; k++){
			System.out.print(vec[k]+" ");
		}
	}

}
