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

import symphony.domain.ConcertSeason;
import symphony.domain.Conductor;
import symphony.domain.OpeningDate;

public class ConcertSeasonTest {
	private OpeningDate openingDate;
	private int seasonLength=9;
ConcertSeason a=new ConcertSeason();
	@Test
	public void testConcertSeason() {
		assertNotNull("should be not null", new ConcertSeasonTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new ConcertSeasonTest());
	}

	@Test
	public void testConcertSeasonOpeningDateInt() {
		 ConcertSeason c = new ConcertSeason();
			assertNotNull("should be not null",  c );
			assertNotEquals("", c);
			System.out.println("Default Constructor2");
	}

	@Test
	public void testGetOpeningDate() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getSeasonLength());
		assertTrue(9 == a.getSeasonLength());
	}

	@Test
	public void testgetSeasonLength() {
		System.out.println("Executed year getter");
		assertEquals(9, a.getSeasonLength());
		assertTrue(9 == a.getSeasonLength());
	}

	@Test
	public void testSetOpeningDate() {
		a.setOpeningDate(openingDate);
		System.out.println("Executed Address setter");
		assertEquals(openingDate, a.getOpeningDate());
		assertTrue(openingDate== a.getOpeningDate());
	}

	@Test
	public void testSetSeasonLength() {
		a.setSeasonLength(9);
		System.out.println("Executed Address setter");
		assertEquals(9, a.getSeasonLength());
		assertFalse(8 == a.getSeasonLength());
	}

	@Test
	public void testToString() {
	String it="Opening Date for the concert is " 
            + openingDate + 	" Season Length is " 
			+ seasonLength;
	assertEquals(it, a.toString());
	}

}
