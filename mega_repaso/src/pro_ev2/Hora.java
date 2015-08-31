package pro_ev2;
public class Hora {

	private int hora;
	private int minuto;
	
	public Hora(int h, int m){
		hora = h;
		minuto = m;
	}
	
	public Hora(){};
	
	public void printHora(){
		System.out.println(hora);
	}
	
	public void printMinuto(){
		System.out.println(minuto);
	}
	
	public int getHora(){
		return hora;
	}
	
	public int getMinuto(){
		return minuto;
	}
	
	public String toString(){
		String ex_hora = +hora+":"+minuto;
		return ex_hora;
	}
}
