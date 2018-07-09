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

import symphony.domain.Date;
import symphony.domain.Perform;

public class PerformTest {
Perform t=new Perform();
Date performDate;
	@Test
	public void testPerform() {
		assertNotNull("should be not null", new PerformTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new PerformTest());
	}

	@Test
	public void testAdd() {
		
	}

	@Test
	public void testGetPerformDate() {
		
		System.out.println("Executed ID getter");
		assertEquals(performDate, t.getPerformDate());
		assertTrue( null == t.getPerformDate());	
	}

	@Test
	public void testSetPerformDate() {
		t.setPerformDate(performDate);
		System.out.println("Executed id setter");
		assertEquals(performDate, t.getPerformDate());
		
		assertFalse(performDate == t.getPerformDate());
	}

	@Test
	public void testToString() {
		String it="Perform Date is "+ performDate;
		assertEquals(it, t.toString());
	}

}
