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

import symphony.domain.Conductor;
import symphony.domain.DateBuilder;
import symphony.domain.Day;
import symphony.domain.Month;
import symphony.domain.Time;
import symphony.domain.Year;

public class DateBuilderTest {
	Year year;
	Month month;
	Day day;
	Time time;
DateBuilder g=new DateBuilder();
	@Test
	public void testDateBuilder() {

		assertNotNull("should be not null", new DateBuilderTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new DateBuilderTest());
	}

	@Test
	public void testDateBuilderYearMonthDay() {
		DateBuilder c = new DateBuilder(null,null,null);
		assertNotNull("should be not null",  c );
		assertNotEquals("", c);
		System.out.println("Default Constructor2");
	}

	

	

	@Test
	public void testGetYear() {
		System.out.println("Executed ID getter");
		assertEquals(year, g.getYear());
		assertTrue( year == g.getYear());}	


	@Test
	public void testGetMonth() {
		System.out.println("Executed ID getter");
		assertEquals(month, g.getMonth());
		assertTrue( month == g.getMonth());	
	}

	@Test
	public void testGetDay() {
		System.out.println("Executed ID getter");
		assertEquals(day,g.getDay());
		assertTrue( day == g.getDay());	
	}

	@Test
	public void testGetTime() {
		System.out.println("Executed ID getter");
		assertEquals(time, g.getDay());
		assertTrue( null == g.getDay());		
	}

}
