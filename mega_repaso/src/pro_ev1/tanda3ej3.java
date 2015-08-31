package pro_ev1;
public class tanda3ej3 {
	public static void main(String[] args) {

		int[] vec = {1,2,3,4,5,6,7,8,9,10};
		int fin = vec.length - 1;
		for(int i = 0; i < vec.length / 2; i++){
			System.out.print(vec[i]+" "+vec[fin]+" ");
			fin--;
		}
	}
}
