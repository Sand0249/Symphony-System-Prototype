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

import symphony.domain.Movement;

public class MovementTest {
	Movement move;
	Movement q=new Movement(null);

	@Test
	public void testMovement() {
		assertNotNull("should be not null", new MovementTest());
		System.out.println("Default Constructor");
			assertNotEquals("", new MovementTest());
	}

	@Test
	public void testGetMovement() {
		System.out.println("Executed ID getter");
		assertEquals(move, q.getMovement(null));
		assertTrue( move == q.getMovement(null));	
	}

}
