package pro_ev2;
public class Examen{

	private String asignatura;
	private String aula;
	private String fecha;
	private String hora;
	
	public Examen(String fecha, String hora){
		asignatura = null;
		aula = null;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public void setAsignatura(String asignatura){
		this.asignatura = asignatura;
	}
	
	public void setAula(String aula){
		this.aula = aula;
	}
	
	public void tablon(){
		System.out.println(asignatura);
		System.out.println(aula);
		System.out.println(fecha);
		System.out.println(hora);
	}
	
	public static void main(String[] args) {
		Fecha fec = new Fecha(1,9,2015);
		Hora hora = new Hora(8,30);
		Examen ex = new Examen(fec.toString(), hora.toString());
		ex.setAsignatura("Programación");
		ex.setAula("DAW1");
		ex.tablon();

	}

}
