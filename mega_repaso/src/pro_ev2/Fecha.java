package pro_ev2;
public class Fecha{

	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha(int d, int m, int a){
		dia = d;
		mes = m;
		a�o = a;
	}
	
	public Fecha(){};
	
	public void printDia(){
		System.out.println(dia);
	}
	
	public void printMes(){
		System.out.println(mes);
	}
	
	public void printA�o(){
		System.out.println(a�o);
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getA�o(){
		return a�o;
	}
	
	public String toString(){
		String fecha =	dia+"/"+mes+"/"+a�o;
		return fecha;
	}
}
