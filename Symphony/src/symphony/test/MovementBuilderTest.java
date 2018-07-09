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
import symphony.domain.MovementBuilder;
import symphony.domain.Name;

public class MovementBuilderTest {
	ID id;
	Name name;
	
	MovementBuilder g=new MovementBuilder();
	/**
	 * This test is used to test Constructor
	 * */
	@Test
	public void testMovementBuilder() {
		assertNotNull("should be not null", new MovementBuilderTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new MovementBuilderTest());
	}

	
	/**
	 * This test is used to test Name()
	 * */

	@Test
	public void testName() {
		assertTrue( name == g.getName());}	
	
    
	/**
	 * This test is used to test GetID
	 **/
	@Test
	public void testGetID() {
		System.out.println("Executed ID getter");
		assertEquals(id, g.getNumber());
		assertTrue( id == g.getNumber());}	
	
    /**
     * This test is used to test GetName()
     * */
	@Test
	public void testGetName() {
		System.out.println("Executed ID getter");
		assertEquals(name, g.getName());
		assertTrue( name == g.getName());}	
	}


