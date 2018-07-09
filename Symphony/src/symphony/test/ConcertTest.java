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

import symphony.domain.Concert;
import symphony.domain.Conductor;
import symphony.domain.Date;
import symphony.domain.Transaction;
import symphony.domain.Venue;

public class ConcertTest {
	Date performDate;
	Concert q=new Concert();
	Date d=new Date();
	Concert perform;
	Date date;
	Concert num;
	Venue venue;
	Conductor conduct;
	@Test
	public void testConcert() {
		assertNotNull("should be not null", new ConcertTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new ConcertTest());
	}

	@Test
	public void testGetConductor() {
		System.out.println("Executed ID getter");
		assertEquals(conduct, q.getConductor());
		assertTrue( conduct == q.getConductor());	
	}

	@Test
	public void testGetConcertNumber() {
		System.out.println("Executed ID getter");
		assertEquals(num, q.getConcertNumber());
		assertTrue( null == q.getConcertNumber());		
	}

	@Test
	public void testGetPerform() {
		System.out.println("Executed ID getter");
		assertEquals(perform, q.getPerform());
		assertTrue( null == q.getPerform());	
	}

	@Test
	public void testGetDate() {
		System.out.println("Executed ID getter");
		assertEquals(date, q.getDate());
		assertTrue( date == q.getDate());	
	}

	@Test
	public void testGetVenue() {
		
	}

	@Test
	public void testSetConcertNumber() {
		q.setPerform(null);
		System.out.println("Executed id setter");
		assertEquals(num, q.getPerform());
	}

	@Test
	public void testSetPerform() {
		q.setPerform(null);
		System.out.println("Executed id setter");
		assertEquals(perform, q.getPerform());
		
	}

	@Test
	public void testSetDate() {
		q.setDate(date);
		System.out.println("Executed id setter");
		assertEquals(date, q.getDate());}

	@Test
	public void testSetVenue() {
		q.setVenue(venue);
		System.out.println("Executed id setter");
		assertEquals(venue, q.getDate());}
	}


