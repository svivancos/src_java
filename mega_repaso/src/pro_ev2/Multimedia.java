package pro_ev2;
public class Multimedia {

	protected static String titulo;
	protected static String autor;
	protected static String formato;
	protected static int duracion;
	
	public Multimedia(String titulo, String autor, String formato, int duracion){
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public String getFormato(){
		return formato;
	}
	
	public int duracion(){
		return duracion;
	}
	
	public String toString(){
		String resumen =	"Título: "+titulo+"   "
							+"Autor: "+autor+"   "
							+"Formato: "+formato+"   "
							+"Duración: "+duracion+"min";
		return resumen;
	}
	
	public boolean equals(Object obj){
		if(autor == titulo){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Multimedia multi = new Multimedia("Argo","Affleck","avi",120);
		String resumen = multi.toString();
		System.out.println(resumen);
		if(multi.equals(multi) == true){
			System.out.println("Título y autor son iguales");
		}else{
			System.out.println("Título y autor son distintos");
		}
		
		System.out.println("");
		System.out.println("PELÍCULA");
		Pelicula peli = new Pelicula(titulo, autor, formato, duracion);
		peli.setProta("Ben Affleck", "Scarlett Johansson");
		peli.getProta();
		String resumen_peli = peli.toString();
		System.out.println(resumen_peli);
	}
}
