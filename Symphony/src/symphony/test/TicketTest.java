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

import symphony.domain.ID;
import symphony.domain.Name;
import symphony.domain.Ticket;
import symphony.domain.Venue;

public class TicketTest {
	ID t=new ID();
	Name n = new Name();
	Ticket l = new Ticket();
	String id="PB26";
	String name="Prabdeep";
	String price="12";
    Venue venue = null;
	/**
	 * This test is used to test Constructor
	 **/
	@Test
	public void testTicket() {
		assertNotNull("should be not null", new Ticket());
		System.out.println("Default Constructor");
			assertNotEquals("", new Ticket());
	}

	/**
	 * This test is used to test GetPrice
	 **/
	@Test
	public void testGetPrice() {
		System.out.println("Executed Price getter");
		assertEquals(price, l.getPrice());
		
	}

   /**
    * This test is used to test GetID
    **/	
	@Test
	public void testGetID() {
		System.out.println("Executed ID getter");
		assertEquals(id, t.getId());
		assertTrue(id == t.getId());
	}

	/**
	 * This test is used to test SeatNumber
	 *  */
	@Test
	public void testGetSetNumber() {
		System.out.println("Executed Number getter");
		assertEquals(name, t.getId());
		assertTrue(name == t.getId());
	}

	/**
	 * This test is used to test GetVenue
	 **/
	@Test
	public void testGetVenue() {
		System.out.println("Executed ID getter");
		assertEquals(venue, n.getName());
		
		
	}
    /**
     * This test is used to test SetPrice
     **/
	@Test
	public void testSetPrice() {
		t.setId("PB26");
		System.out.println("Executed id setter");
		assertEquals("PB26", t.getId());
		
		assertFalse("1600" == t.getId());
	}

	/**
	 * This test is used to test SetID
	 **/
	@Test
	public void testSetID() {
		t.setId("PB26");
		System.out.println("Executed id setter");
		assertEquals("PB26", t.getId());
		
		assertFalse("1600" == t.getId());
	}

	

}
