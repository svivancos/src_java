package ent_ev1;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Voy a probar los tres ejemplos que salen
 * en el PDF del enunciado del ejercicio ya
 * que esos están corregidos
 * @author Salva
 */
public class Tests_Banco {

	@Test
	public void ejemplo1(){
		Banco cuenta = new Banco();
		assertTrue(cuenta.expandir(1.3, 2) == 103);
	}
	
	@Test
	public void ejemplo2(){
		Banco cuenta = new Banco();
		assertTrue(cuenta.expandir(12.3, 3) == 12003);
	}
	
	@Test
	public void ejemplo3(){
		Banco cuenta = new Banco();
		assertTrue(cuenta.expandir(12345.6, 4) == 1234500006);
	}
}
