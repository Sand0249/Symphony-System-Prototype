package symphony.test;

/*
 * @version		1.0.0
 * @authors:	Simranjit Singh Sandhu
 *              Prabdeep Singh Pannu
 *              Princedeep Singh
 *              Vikramjeet Singh
 *              Ali Akbari
 *	Modified:   12 April 2017
 */

import static org.junit.Assert.*;

import org.junit.Test;

import symphony.domain.Time;

public class TimeTest {
	Time a=new Time();
	@Test
	public void testTime() {
		
	}
/**
 * testing getter for hour as a type of int
 */
	@Test
	public void testGetHour() {
		System.out.println("Executed ID getter");
		assertEquals(9, a.getHour());
		assertTrue(9 == a.getHour());
	}

	
	/**
	 * testing getter for min as a type of int
	 */
	@Test
	public void testGetMin() {
		System.out.println("Executed ID getter");
		assertEquals(9, a.getMin());
		assertTrue(9 == a.getMin());
		
	}

	
	/**
	 * Testing getter for sec as a type of int
	 */
	@Test
	public void testGetsec() {
		System.out.println("Executed ID getter");
		assertEquals(9, a.getsec());
		assertTrue(9 == a.getsec());
	}

	/**
	 * Testing Setter for hour as a type of int
	 */
	@Test
	public void testSetHour() {
		a.setHour(9);
		System.out.println("Executed id setter");
		assertEquals(9, a.getHour());
		
		assertFalse(8 == a.getHour());
	}

	@Test
	public void testSetMin() {
		a.setMin(9);
		System.out.println("Executed id setter");
		assertEquals(9, a.getMin());
		
		assertFalse(8 == a.getMin());
	}
	
	/**
	 * Testing setter for sec as a type of int
	 */
	
	@Test
	public void testSetsec() {
		a.setsec(9);
		System.out.println("Executed id setter");
		assertEquals(9, a.getsec());
		
		assertFalse(8 == a.getsec());	
	}
	
	/**
	 * Testing toString method
	 */

	@Test
	public void testToString() {
		int hour=9;
		int min=9;
		int sec=9;
		String it="Time "+ hour+":"+min+":"+sec;
		assertEquals(it, a.toString());
	}

}
