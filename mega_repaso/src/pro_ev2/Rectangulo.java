package pro_ev2;
public class Rectangulo {

	private int ancho;
	private int alto;
	private String medidas;
	
	public Rectangulo(){
		alto = 0;
		ancho = 0;
	}
	
	public void setAncho(int ancho){
		this.ancho = ancho;
	}
	
	public void setAlto(int alto){
		this.alto = alto;
	}
	
	public void resumen(){
		medidas = "Alto: "+alto+"cm y Ancho: "+ancho+"cm";
		System.out.println(medidas);
	}
	
	public void inc_alto(){
		alto += 1;
	}
	
	public void inc_ancho(){
		ancho += 1;
	}
	
	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo();
		rec.setAlto(5);
		rec.setAncho(3);
		rec.resumen();
		rec.inc_alto();
		rec.inc_ancho();
		rec.resumen();

	}

}
