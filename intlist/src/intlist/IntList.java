package intlist;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntList {
	
	/**
	 * @creates | result 
	 * @basic
	 */
	public int[] getElements() {
		throw new RuntimeException("not yet implemented");
	}		
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() {
		throw new RuntimeException("not yet implemented");
	}		
	/**
	 * @pre | 0 <= index && index <= getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) {
		throw new RuntimeException("not yet implemented");
	}		
	/**
	 * @post | getLength() == 0
	 */
	public IntList() {
		throw new RuntimeException("not yet implemented");
	}
	
	/**
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == value
	 * @post | IntStream.range(0, old(getLength())).allMatch(i ->
	 * 		 | 		getElementAt(i) == old(getElements())[i])
	 * 
	 *  // IntStream.range(a,b).allMatch(i->uitspraak over i)
	 *  // for all i: a <= i < b ==> uitspraak over i
	 *  
	 * @post | Arrays.equals(getElements(), 0, getLength()-1, old(getElements()),0,old(getLength()))
	 */
	public void addElement(int value) {
		throw new RuntimeException("not yet implemented");
	}
	
	/**
	 * @mutates | this
	 * 
	 * @pre | index >= 0 && index <= getLength()
	 * @post | getLength() == old(getLength())
	 * @post | IntStream.range(0, getLength()).allMatch(i -> i==index ? getElementAt(i)==value : getElementAt(i)==old(getElements())[i])
	 */
	public void setElement(int index, int value) {
		throw new RuntimeException("Not yet implemented");
	}
}
