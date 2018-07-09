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

import symphony.domain.Year;

public class YearTest {
Year a = new Year();

/**
 * This test is used to test Year()
 **/
	@Test
	public void testYear() {
		assertNotNull("should be not null", new YearTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new YearTest());
	}

	/**
	 * This test is used to test GetYear()
	 **/
	@Test
	public void testGetYear() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getYear());
		assertTrue(9 == a.getYear());
	}

	/**
	 * This test is used to SetYear()
	 **/
	@Test
	public void testSetYear() {
		
	a.setYear(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getYear());
		assertFalse(8 == a.getYear());
	}

}
