package pro_ev1;
public class tanda2ej46 {
	public static void main(String[] args) {
		
		System.out.print("1 ");
		for(int i = 1; i < 100; i++){
			int div = 0;
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					div += j;
				}
			}
			if(i == div - 1){
				System.out.print(i+" ");
			}
		}
	}
}
