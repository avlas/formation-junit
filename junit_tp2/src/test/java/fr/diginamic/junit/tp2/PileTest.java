package fr.diginamic.junit.tp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PileTest {

	Pile pile;

	@Before
	public void initTest() {
		pile = new Pile(2);

		List<Integer> ints = new ArrayList<Integer>();
		ints.add(Integer.valueOf(1));
		ints.add(Integer.valueOf(3));
		pile.setIntegers(ints);
	}

	@Test
	public void pushTest() {
		pile.push(Integer.valueOf(12));

		assertEquals(3, pile.getIntegers().size());
		assertTrue(pile.getIntegers().contains(Integer.valueOf(12)));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void pushOutOfIndexTest() {
		pile.push(Integer.valueOf(5));
		pile.push(Integer.valueOf(4));
	}

	@Test
	public void popTest() {
		pile.pop();

		assertEquals(1, pile.getIntegers().size());
	}

	@Test
	public void popAllTest() {
		pile.popAll();

		assertEquals(0, pile.getIntegers().size());
		assertTrue(pile.getIntegers().isEmpty());
	}

	@Test
	public void peekTest() {
		assertEquals(Integer.valueOf(3), pile.peek());
	}
	
	@After
	public void destroyTest() {
		pile = null;
	}
}
