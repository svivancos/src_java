package pro_ev2;
public class Pelicula extends Multimedia{

	private String actor;
	private String actriz;
	private String prota;
	
	public Pelicula(String titulo, String autor, String formato, int duracion) {
		super(titulo, autor, formato, duracion);
		actor = null;
		actriz = null;
	}
	
	public void setProta(String prota_h, String prota_m){
		if(prota_h == null && prota_m == null){
			System.out.print("Tiene que tener un actor/actriz");
		}else{
			actor = prota_h;
			actriz = prota_m;
		}
	}
	
	public String getProta(){
		if(actor == null){
			prota = actriz;
		}else if(actriz == null){
			prota = actor;
		}else{
			prota = actor+" y "+actriz;
		}
		return prota;
	}
	
	public String toString(){
		String resumen =	"Título: "+titulo+"   "
							+"Autor: "+autor+"   "
							+"Formato: "+formato+"   "
							+"Duración: "+duracion+"min   "
							+"Protagonista: "+prota;
		return resumen;
	}

}
