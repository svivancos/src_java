package pro_ev2;
public class Satelite {
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	// Hay que poner el nombre exacto de la clase
	Satelite (double m, double p, double d){
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	public void setPosicion(double m, double p, double d){
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	public void printPosicion(){ // Las variables tienen que ir sin ""
		System.out.println("El satélite se encuentra en el paralelo "+paralelo+
							" y meridiano "+meridiano+" a una distancia de la"
							+ " Tierra de "+distancia_tierra+" kilómetros");
	}
	
	public static void main(String[]args){
		double m = 14.78;
		double p = 89.12;
		double d = 125.44;
		Satelite sat = new Satelite(m,p,d);
		sat.setPosicion(m, p, d);
		sat.printPosicion();
	}
}
