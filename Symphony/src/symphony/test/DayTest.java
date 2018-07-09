package symphony.test;

import static org.junit.Assert.*;

import org.junit.Test;

import symphony.domain.Day;

public class DayTest {
Day a=new Day(); 

/**
 * This test is used to test first Constructor
 * */
	@Test
	public void testDay() {
		assertNotNull("should be not null", new DayTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new DayTest());
	}
	
/**
 * This test used to test GetDay
 * */
	@Test
	public void testGetDay() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getDay());
		assertTrue(9 == a.getDay());
	}

/**
 * This test is used to test SetDay
 * */	
	@Test
	public void testSetDay() {
		a.setDay(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getDay());
		assertFalse(8 == a.getDay());
		}
}
