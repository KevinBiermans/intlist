package intlist.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import intlist.IntList;

class IntListTest {

	@Test
	void test() {
		IntList intList = new IntList();
		intList.addElement(42);
		
		int[] elements = intList.getElements();
		assertEquals(42, elements[0]);
		//assertArrayEquals(new int[] {42}, elements);
		
		/*elements[0] = 43;
		assertEquals(42, intList.getElementAt(0));*/
		// kopie of niet?
		// representation exposure: als het wijzigen van 
		// iets teruggekregen met een get(), het origineel wijzigt
		// als dit gebeurt dan klopt dit hier: assertEquals(43, intList.getElementAt(0));
		
		
		intList.setElement(0, 43);
		assertEquals(43, elements[0]); // als dit klopt -> REPRESENTATION EXPOSURE
		// klant wijzigt het inList object en ziet dat ook de int array gewijzigd is!
	}

}
