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

import symphony.domain.Address;
import symphony.domain.PostalCode;

public class AddressTest {
	
	Address a=new Address(); // instanting Address class
	int streetNumber=9;      // integer value 9
	String city="ot";        // String value ot
	String Provience="on";   // String value on
	String StreetName="deerfield";// String value deerfield
	PostalCode pCode=null;    // Postal code which is null
	
   /**
    * This to test defualt Constractor
    * */
	@Test
	public void testAddress() {
		
	}

	/**
	 * This is a test for GetStreetNumber
	 * */

	@Test
	public void testGetStreetNumber() {
		System.out.println("Executed ID getter");//This is to print statement
		assertEquals(9, a.getStreetNumber());    // Here assertEquals is used
		assertTrue(9 == a.getStreetNumber());    // Here assertTrue is used
	}

	/**
	 * This is a test for GetStreetName
	 * */
	@Test
	public void testGetStreetName() {
		System.out.println("Executed ID getter"); //This is to print statement
		assertEquals(StreetName, a.getStreetName());//Here assertEquals is used
		assertTrue(StreetName == a.getStreetName());//Here assertTrue is used
	}
	

	/**
	 * This is a test for GetCity
	 * */
	@Test
	public void testGetCity() {
		System.out.println("Executed ID getter");//This is to print Statement
		assertEquals(city, a.getCity());         //Here assertEquals is used
		assertTrue(city == a.getCity());         //Here assertTrue is used
	}
	

	/**
	 * This is used to test GetProvience Method*/
	@Test
	public void testGetProvience() {
		System.out.println("Executed ID getter"); // This is to print Statement
		assertEquals(Provience, a.getProvince());// Here assertEquals is  used 
		assertTrue(Provience == a.getProvince());// Here assertTrue is to used
	}
	
   /**
    * This is used to test GetPostalCode
    * */
	
	@Test
	public void testGetPostalCode() {
		System.out.println("Executed ID getter");// This is to print Statement
		assertEquals(pCode, a.getPostalCode());  // Here assertEquals is used 
		assertTrue(pCode == a.getPostalCode());  // Here assertTrue is used
	}
	
   /**
    * This test is used to test SetStreetName*/
	@Test
	public void testSetStreetName() {
		a.setStreetName("deerfield");                 //Here StreetName is used
		System.out.println("Executed Address setter");//This is used to print Statement
		assertEquals("deerfield", a.getStreetName()); //Here assertEquals is used
		assertFalse("deerfie" == a.getStreetName());  //Here assertFalse is used
	}
    
	/**
	 * This is used to test SetCity
	 * */
 	@Test
	public void testSetCity() {
 		a.setCity("ot");                              //Here setcity is used
		System.out.println("Executed Address setter");//This is used to print Statement
		assertEquals("ot", a.getCity());              //Here assertEquals is used
		assertFalse("deerfie" == a.getCity());        //Here assertFalse  is used
	}
    
 	/**
 	 * This is used to test SetProvince
 	 * */
	@Test
	public void testSetProvince() {
		a.setProvience("deerfield");                 //Here SetProvince is used
		System.out.println("Executed Address setter");//This is used to print Statement
		assertEquals("deerfield", a.getStreetName());//Here assertEquals is used
		assertFalse("deerfie" == a.getStreetName());//Here assertFalse is used
	}
    
	/**
	 * This is used to test SetPostalCode
	 * */
	@Test
	public void testSetPostalCode() {
		a.setPostalCode(null);                     //Here setPostalCode is used
		System.out.println("Executed Address setter");// This is used to print Statement
		assertEquals(pCode, a.getPostalCode());     //Here assertEquals is used
	}
  
	/**
	 * This is used to test ToString
	 * */
	@Test
	public void testToString() {
	
		String it="Adress = " +" "+streetNumber+" "+ StreetName+ " "+city+"" +Provience+""+ pCode; //Here String is used
		assertEquals(it, a.toString()); // Here is assertEquals is used
	}

}
