package symphony.test;

import static org.junit.Assert.*;

import org.junit.Test;

import symphony.domain.Month;

public class MonthTest {
Month a=new Month();

/**
 * This test is used to test Constructor
 **/
	@Test
	public void testMonth() {
		assertNotNull("should be not null", new MonthTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new MonthTest());
	}

/**
 * This test is used to test GetMonth
 **/
	@Test
	public void testGetMonth() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getMonth());
		assertTrue(9 == a.getMonth());
	}

/**
 * This test is used to test SetMonth
 **/	
	@Test
	public void testSetMonth() {
		a.setMonth(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getMonth());
		assertFalse(8 == a.getMonth());
	}

}
