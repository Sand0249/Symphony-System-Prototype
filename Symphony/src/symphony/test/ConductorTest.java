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

import symphony.domain.Composer;
import symphony.domain.Conductor;

public class ConductorTest {
/**
 * This is used to test default Constructor
 **/
	@Test
	public void testConductor() {
		assertNotNull("should be not null", new ConductorTest()); // Here assertNotNull is used
		System.out.println("Default Constructor");                // This is used to print Statement
			assertNotEquals("", new ConductorTest());             // Here assertNotEquals is used
	}

/**
 * This is used to test second Conductor
 **/	
	@Test
	public void testConductorNameAddressTelephone() {
		 Conductor c = new Conductor(null,null,null);            
			assertNotNull("should be not null",  c );            // Here assertNotNull is used
			assertNotEquals("", c);                              // Here assertNotEquals is used
			System.out.println("Default Constructor2");          // This is used to print Statement
	}

}
