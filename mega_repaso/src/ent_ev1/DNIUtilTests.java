package ent_ev1;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.*;
/**
 * Test de las pruebas realizadas en el 
 * ejercicio "Diseño de Pruebas" sobre
 * la clase DNIUtils. Voy a realizar las
 * pruebas que ya realicé ejecutando
 * el código pero esta vez todas a la vez
 * tal y como debería salir y desde JUnit
 * @author Salvy
 */
public class DNIUtilTests {

	// Ejercicio1: caminos
	@Test
	public void ej1p1(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("123456789Z"),"ERRDNI-1");
	}
	
	@Test
	public void ej1p2(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("12345678-Z"),"12345678Z");
	}
	
	@Test
	public void ej1p3(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("12345678-V"),"ERRDNI-2");
	}
	
	@Test
	public void ej1p4(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("12345678"),"12345678Z");
	}
	
	@Test
	public void ej1p5(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("12345"),"00012345V");
	}
	
	// Ejercicio2: while
	@Test
	public void ej2p1(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("12345678"),"12345678Z");
	}
	
	@Test
	public void ej2p2(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("1234567"),"01234567L");
	}
	
	@Test
	public void ej2p3(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("123456"),"00123456S");
	}
	
	@Test
	public void ej2p41(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("1"),"00000001R");
	}
	
	@Test
	public void ej2p42(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI(""),"00000000T");
	}
	
	// Ejercicio3: clases de equivalencia
	@Test
	public void ej3RV1(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080"),"23302080K");
	}
	
	@Test
	public void ej3RV2(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080-K"),"23302080K");
	}
	
	@Test
	public void ej3RV3(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080K"),"23302080K");
	}
	
	@Test
	public void ej3V1(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080.K"),"23302080K");
	}
	
	@Test
	public void ej3MV1(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302"),"00023302A");
	}
	
	@Test
	public void ej3MV2(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080"),"23302080K");
	}
	
	@Test
	public void ej3MV3(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080K"),"23302080K");
	}
	
	@Test
	public void ej3RNV1(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("233020801"),"ERRDNI-2");
	}
	
	@Test
	public void ej3RNV2(){
		DNIUtils dni = new DNIUtils(); // !=
		assertThat(dni.checkDNI("23302080/K"),not("23302080K"));
	}
	
	@Test
	public void ej3RNV3(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("23302080-Ñ"),"ERRDNI-2");
	}
	
	@Test 
	public void ej3MNV1(){
		DNIUtils dni = new DNIUtils();
		try {	// Se espera ese error al ejecutar
			   dni.checkDNI("23302A080");
			   fail("Expected NumberFormatException");
		}catch(NumberFormatException e) {
			}
		}
	
	@Test
	public void ej3MNV2(){
		DNIUtils dni = new DNIUtils();
		assertEquals(dni.checkDNI("233020801"),"ERRDNI-2");
	}
	
	@Test 
	public void ej3MNV3(){
		DNIUtils dni = new DNIUtils();
		try {	
			   dni.checkDNI("233020R");
			   fail("Expected NumberFormatException");
		}catch(NumberFormatException e) {
			}
		}
	}