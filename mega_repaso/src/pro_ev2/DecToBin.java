package pro_ev2;
public class DecToBin {

	public void conversor(int decimal){
		String binario = "";
		while(decimal != 0){
			if(decimal % 2 == 0){
				binario += "0";
			}else if(decimal % 2 == 1){
				binario += "1";
			}
			decimal /= 2;
		}
		for(int i = binario.length() - 1; i >= 0; i--){
			System.out.print(binario.charAt(i));
		}
	}
	
public static void main(String[]args){
	int decimal	= 35;
	DecToBin tobin = new DecToBin();
	tobin.conversor(decimal);
	}
}
