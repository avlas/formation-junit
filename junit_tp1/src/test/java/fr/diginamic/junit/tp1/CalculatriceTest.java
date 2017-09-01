package fr.diginamic.junit.tp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

	Calculatrice calculatrice;
	
	@Before
	public void initialition() {
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
		
		assertEquals(retour, 4.0, 0.0);
	}
}
