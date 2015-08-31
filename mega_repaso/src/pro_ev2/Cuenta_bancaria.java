package pro_ev2;
public class Cuenta_bancaria {

	private String titular;
	private int numero;
	private double saldo;
	
	public Cuenta_bancaria(){
		titular = "Salvador Vivancos";
		numero = 845194106;
		saldo = 20.86;
	}
	
	public void retirar(double dinero){
		saldo -= dinero;
	}
	
	public void ingresar(double dinero){
		saldo += dinero;
	}
	
	public void getSaldo(){
		System.out.println("Saldo actual: "+saldo);
	}
	
	public void balance(){
		if(saldo < 500){
			System.out.println(saldo+" eres pobre");
		}else if(saldo >= 500){
			System.out.println(saldo+" no eres pobre");
		}
	}
	
	public String toString(){
		String datos =	"Titular: "+titular+" *** "
						+"Número de cuenta: "+numero+" *** "
						+"Saldo actual: "+saldo;
		return datos;
	}
	
public static void main(String[]args){
		Cuenta_bancaria cuenta = new Cuenta_bancaria();
		String datos = cuenta.toString();
		System.out.println(datos);
		System.out.println("Ingreso 10€");
		double dinero = 10.00;
		cuenta.ingresar(dinero);
		cuenta.getSaldo();
		System.out.println("Retiro 5€");
		dinero = 5.00;
		cuenta.retirar(dinero);
		cuenta.getSaldo();
		System.out.println("Compruebo mi balance");
		cuenta.balance();
		System.out.println("Me toca la quiniela y miro el balance");
		dinero = 15000.00;
		cuenta.ingresar(dinero);
		cuenta.balance();
	}
	
}
