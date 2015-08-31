package pro_ev2;
public class Recursividad {

	private int num;
	private int resultado;
	
	public void factorial(int n){
		resultado = 1;
		for(int i = 1; i <= num; i++){
			resultado *= i;
		}
		System.out.println("Factorial de "+num+" es "+resultado);
	}
	
	public void fibonacci(){
		int[] vec = new int[17];
		vec[0] = 1;
		vec[1] = 1;
		for(int i = 2; i < vec.length; i++){
			vec[i] = vec[i-1] + vec[i - 2];
		}
		for(int i = 0; i < vec.length; i++){
			System.out.print(vec[i]+" ");
		}
	}
	
	
	// MAIN
	public static void main(String[] args) {
		Recursividad calc = new Recursividad();
		calc.factorial(4);
		calc.fibonacci();

	}

}
