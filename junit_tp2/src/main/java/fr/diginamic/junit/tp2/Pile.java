
package fr.diginamic.junit.tp2;

import java.util.ArrayList;
import java.util.List;

public class Pile {

	private List<Integer> integers;
	private int sizeMax;

	public Pile() {
		sizeMax = 0;
		if (integers == null) {
			integers = new ArrayList<Integer>();
		}
	}

	public Pile(int sizeMax) {
		this.sizeMax = sizeMax;

		if (integers == null) {
			integers = new ArrayList<Integer>();
		}
	}

	public void push(Integer element) {
		if (integers.size() > sizeMax) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			integers.add(element);
		}
	}

	public void pop() {
		Integer lastElement = integers.get(integers.size()-1);
		integers.remove(lastElement);
	}

	public void popAll() {
		integers.clear();
	}

	public Integer peek() {
		return integers.get(integers.size()-1);
	}

	public List<Integer> getIntegers() {
		return integers;
	}

	public void setIntegers(List<Integer> integers) {
		this.integers = integers;
	}

}
