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

import symphony.domain.Ticket;
import symphony.domain.Venue;

public class VenueTest {
Venue a=new Venue();

/**
 * This test is used to test Constructor*/
	@Test
	public void testVenue() {
		assertNotNull("should be not null", new Venue());
		System.out.println("Default Constructor");
			assertNotEquals("", new Venue());
	}
/**
 * This test is used to test GetConcert()
 **/
	@Test
	public void testGetConcerts() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getConcerts());
		assertTrue(9 == a.getConcerts());
	}

/**
 * This test is used to test GetSeats()
 **/
	@Test
	public void testGetSeats() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getSeats());
		assertTrue(9 == a.getSeats());
	}

/**
 * This test is used to test GetTicket()
 **/	
	@Test
	public void testGetTickets() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getTickets());
		assertTrue(9 == a.getTickets());

	}
/**
 * This test is used to test SetConcerts()
 **/
	@Test
	public void testSetConcerts() {
		a.setConcerts(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getConcerts());
		assertFalse(8 == a.getConcerts());
	}

	
/**
 * This test is used to test SetSeats()
 **/
	@Test
	public void testSetSeats() {
		a.setSeats(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getSeats());
		assertFalse(8 == a.getSeats());
		
	}

/**
 * This test is used to test SetTickets()*/
	@Test
	public void testSetTickets() {
		
		a.setTickets(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getTickets());
		assertFalse(8 == a.getTickets());
	
	}

}
