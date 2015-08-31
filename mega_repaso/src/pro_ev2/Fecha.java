package pro_ev2;
public class Fecha{

	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int d, int m, int a){
		dia = d;
		mes = m;
		año = a;
	}
	
	public Fecha(){};
	
	public void printDia(){
		System.out.println(dia);
	}
	
	public void printMes(){
		System.out.println(mes);
	}
	
	public void printAño(){
		System.out.println(año);
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAño(){
		return año;
	}
	
	public String toString(){
		String fecha =	dia+"/"+mes+"/"+año;
		return fecha;
	}
}
