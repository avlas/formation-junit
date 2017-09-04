package fr.diginamic.junit.tp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

	Calculatrice calculatrice;
	
	@Before
	public void setup() {
		calculatrice = new CalculatriceImpl();
	}

	@Test
	public void premierTest() throws Exception {
		assertEquals(1, 1);
	}
	
	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		
		double retour = calculatrice.addition(a, b);
		
		assertEquals(4.0, retour, 0.0);
	}
	
	@Test
	public void multiplicationTest() throws Exception {
		double a = 1;
		double b = 3;
		
		double retour = calculatrice.multiplication(a, b);
		
		assertEquals(3.0, retour, 0.0);
	}
	
	@Test
	public void soustractionTest() throws Exception {
		double a = 1;
		double b = 3;
		
		double retour = calculatrice.soustraction(a, b);
		
		assertEquals(-2.0, retour, 0.0);
	}
	
	@Test
	public void divisionTest() throws Exception {
		double a = 6;
		double b = 3;
		
		double retour = calculatrice.division(a, b);
		
		assertEquals(2.0, retour, 0.0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void zeroDivisionTest() throws Exception {
		double a = 12;
		double b = 0;
		
		calculatrice.division(a, b);
	}
}
