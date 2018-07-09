package symphony.test;

import static org.junit.Assert.*;

import org.junit.Test;

import symphony.domain.Name;

public class NameTest {
	Name f=new Name();
	String name="java";
	
	/**
	 * This test is used to test Constructor
	 **/
	@Test
	public void testName() {
		assertNotNull("should be not null", new NameTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new NameTest());
	
	}
	
	/**
	 * This test is uesd to test GetName
	 **/

	@Test
	public void testGetName() {
		System.out.println("Executed  getter Name");
		assertEquals(name, f.getName());
		assertTrue(name == f.getName());
	}

	/**
	 * This test is used to test SetName
	 **/
	@Test
	public void testSetName() {
		f.setName("java");
		System.out.println("Executed setter Name");
		assertEquals("java", f.getName());
		assertFalse("1600" == f.getName());
	}

}
