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

import symphony.domain.AccountHolder;
import symphony.domain.Credit;
import symphony.domain.ID;
import symphony.domain.Payment;

public class CreditTest {
ID t=new ID();
String id="PB26";
Credit a=new Credit();
int cardNumber=92;

Credit accountHolder;
Credit date;

	@Test
	public void testGetCardNumber() {
		System.out.println("Executed ID getter");
		assertEquals(92, a.getCardNumber());
		assertTrue(92 == a.getCardNumber());
	}

	@Test
	public void testgetId() {
		System.out.println("Executed ID getter");
		assertEquals(id, t.getId());
		assertTrue(id == t.getId());	
	}

	@Test
	public void testGetDate() {
		System.out.println("Executed ID getter");
		assertEquals(id, t.getId());
		assertTrue(id == t.getId());	
	}

	@Test
	public void testGetAccountHolder() {
		System.out.println("Executed ID getter");
		assertEquals(accountHolder, a.getHolder());
		assertTrue( null == a.getHolder());	
	}

	@Test
	public void testAccountHolder() {
	
	}

	@Test
	public void testSetID() {
		t.setId("PB26");
		System.out.println("Executed id setter");
		assertEquals("PB26", t.getId());
		
		assertFalse("1600" == t.getId());
	}

	@Test
	public void testSetDate() {
		System.out.println("Executed ID getter");
		assertEquals(date, a.getDate());
		assertTrue( null == a.getDate());	
		
	}

	@Test
	public void testSetCardNumber() {
		a.setCardNumber(9);
		System.out.println("Executed id setter");
		assertEquals(9, a.getCardNumber());
		
		assertFalse(8 == a.getCardNumber());
	}

}
