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
import symphony.domain.Date;

public class DateTest {
Date q= new Date();
Date date;
	@Test
	public void testDate() {
		assertNotNull("should be not null", new DateTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new DateTest());
	}

	@Test
	public void testDateDateBuilder() {
		Date c = new Date();
		assertNotNull("should be not null",  c );
		assertNotEquals("", c);
		System.out.println("Default Constructor2");
	}

	@Test
	public void testGetDate() {
		System.out.println("Executed ID getter");
		
		
	}

}
