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

import symphony.domain.Telephone;

public class TelephoneTest {
Telephone b=new Telephone();
String telephone="123";

/**
 * This test is used to test Constructor
 **/
	@Test
	public void testTelephone() {
		assertNotNull("should be not null", new TelephoneTest());
		System.out.println("Default Constructor");
	}
/**
 * This test is used to test GetTelephone
 **/
	@Test
	public void testGetTelephone() {
		System.out.println("Executed telephone getter");
		assertEquals(telephone, b.getTelephone());
		assertTrue(telephone == b.getTelephone());
		
	}
/**
 *This test is used to test SetTelephone
 **/
	@Test
	public void testSetTelephone() {
		b.setTelephone("123");
		System.out.println("Executed Telephone setter");
		assertEquals("123", b.getTelephone());
		
		assertFalse("1600" == b.getTelephone());
	
	}

}
