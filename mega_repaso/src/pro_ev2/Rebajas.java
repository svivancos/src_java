package pro_ev2;
public class Rebajas {
	
	private float porcentaje;
	private float po;
	private float pr;
	public Rebajas(float po, float pr){
		this.po = po;
		this.pr = pr;
	};
	
	public void descubrePorcentaje(){
		porcentaje = (100 * pr) / po;
		System.out.print(porcentaje+"%");
	}
	
	public static void main(String[] args) {
		float po = 69.99f;
		float pr = 49.99f;
		Rebajas rebaja = new Rebajas(po,pr);
		rebaja.descubrePorcentaje();

	}

}
