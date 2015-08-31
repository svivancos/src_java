package pro_ev2;
public class Coche {

	protected String matricula;
	protected int velocidad;
	protected int marcha;
	
	public Coche(String matricula){
		this.matricula = matricula;
		velocidad = 0;
		marcha = 0;
	}
	
	public void acelerar(int acelerar){
		this.velocidad += acelerar;
	}
	
	public void frenar(int frenar){
		this.velocidad -= frenar;
	}
	
	public int getVelocidad(){
		return velocidad;
	}
	
	protected void cambiaMarcha(int marcha){
		if(marcha > 0){
			this.marcha = marcha;
		}else{
			System.out.println("No puede haber una marcha negativa");
		}
	}
	
	public int getMarcha(){
		return marcha;
	}
	
	public String toString(){
		String resumen =	"Velocidad: "+velocidad+"km/h   "
							+"Marcha actual: "+marcha+"   "
							+"Matrícula: "+matricula;
		return resumen;
	}
	
	public static void main(String[] args) {
		Coche mazda = new Coche("7721CCL");
		String resumen;
		System.out.println(resumen = mazda.toString());
		mazda.cambiaMarcha(1);
		mazda.acelerar(20);
		System.out.println(resumen = mazda.toString());
		mazda.cambiaMarcha(2);
		mazda.acelerar(20);
		System.out.println(resumen = mazda.toString());
		mazda.cambiaMarcha(2);
		mazda.frenar(5);
		System.out.println(resumen = mazda.toString());
		

	}

}
