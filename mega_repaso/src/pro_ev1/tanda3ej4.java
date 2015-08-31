package pro_ev1;
public class tanda3ej4 {
	public static void main(String[] args) {

		int[] vec1 = {1,2,3,4,5};
		int[] vec2 = new int[vec1.length];
		
		for(int i = 0; i < vec1.length; i++){
			if(i == 0){
				vec2[i] = vec1[vec1.length - 1];
				System.out.print(vec2[i]);	
			}else{
				vec2[i] = vec1[i-1];
				System.out.print(vec2[i]);
			}
		}
	}
}
