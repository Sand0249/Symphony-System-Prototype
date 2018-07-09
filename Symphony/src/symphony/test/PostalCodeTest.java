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

import symphony.domain.PostalCode;

public class PostalCodeTest {
	PostalCode f= new PostalCode();
	String postalcode="K2C3N1";

	/**
	 * This test is used test GetPostalCode
	 **/
	@Test
	public void testGetPostalCode() {
		System.out.println("Executed  getter PostalCode");
		assertEquals(postalcode, f.getPostalCode());
		assertTrue(postalcode == f.getPostalCode());
	}

	/**
	 * This test is used to test SetPostalCose
	 **/
	@Test
	public void testSetPostalCode() {
		f.setPostalCode("1800");
		System.out.println("Executed pcode setter");
		assertEquals("1800", f.getPostalCode());
		assertFalse("1600" == f.getPostalCode());
	}

}
