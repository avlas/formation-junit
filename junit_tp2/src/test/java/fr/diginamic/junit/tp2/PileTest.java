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
	Integer firstElement, secondElement, thirdElement, fourthElement;
	
	@Before
	public void initTest() {		
		pile = new Pile(2);
		
		List<Integer> ints = new ArrayList<Integer>();
		firstElement = Integer.valueOf(1);
		secondElement = Integer.valueOf(3);
		ints.add(firstElement);
		ints.add(secondElement);		
		pile.setIntegers(ints);
		
		thirdElement = Integer.valueOf(7);
		fourthElement = Integer.valueOf(4);	
	}

	@Test(expected = NullPointerException.class)
	public void pushNullListTest() {
		pile.setIntegers(null);

		pile.push(thirdElement);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void pushOutOfIndexTest() {
		pile.push(thirdElement);
		pile.push(fourthElement);
	}
	
	@Test
	public void pushTest() {
		pile.push(thirdElement);

		assertEquals(3, pile.getIntegers().size());
		assertTrue(pile.getIntegers().contains(thirdElement));
	}

	@Test(expected = NullPointerException.class)
	public void popNullListTest() {
		pile.setIntegers(null);

		pile.pop();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void popOutOfIndexTest() {
		pile.setIntegers(new ArrayList<Integer>());
		
		pile.pop();
	}

	@Test
	public void popTest() {
		pile.pop();

		assertEquals(-1, pile.getIntegers().indexOf(secondElement));
		assertEquals(1, pile.getIntegers().size());
	}

	@Test(expected = NullPointerException.class)
	public void popAllNullListTest() {
		pile.setIntegers(null);

		pile.popAll();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void popAllOutOfIndexTest() {
		pile.setIntegers(new ArrayList<Integer>());

		pile.popAll();
	}
	
	@Test
	public void popAllTest() {
		pile.popAll();

		assertEquals(0, pile.getIntegers().size());
		assertTrue(pile.getIntegers().isEmpty());
	}

	@Test(expected = NullPointerException.class)
	public void peekNullTest() {
		pile.setIntegers(null);
		
		pile.peek();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void peekOutOfIndexTest() {
		pile.setIntegers(new ArrayList<Integer>());
		
		pile.peek();
	}
	
	@Test
	public void peekTest() {
		assertEquals(secondElement, pile.peek());
	}
	
	@After
	public void destroyTest() {
		pile = null;
	}
}
