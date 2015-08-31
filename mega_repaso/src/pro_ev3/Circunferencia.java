package pro_ev3;
import java.io.*;
public class Circunferencia implements Serializable{

	private int radio;
	
	public void setRadio(int radio){
		this.radio = radio;
	}
	
	public int getRadio(){
		return radio;
	}
	
	private Punto punto;
	
	public void setPunto(Punto punto){
		this.punto = punto;
	}
	
	public Punto getPunto(){
		return punto;
	}
}
