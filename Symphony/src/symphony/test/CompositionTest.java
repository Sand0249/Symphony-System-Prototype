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
import symphony.domain.Composition;
import symphony.domain.ID;
import symphony.domain.Name;

public class CompositionTest {
Composition c= new Composition();

Name f=new Name(); // This used to initiate Name class
ID a=new ID();     //This used to initiate ID class
String nm="java";  //this is used to set the value of the variable
String iid="PB26"; //this is used to set the value of the variable

/**
 * This test is used to test Composition
 * */
	@Test
	public void testComposition() {
		assertNotNull("should be not null", new CompositionTest());//Here assertNotNull is used
		System.out.println("Default Constructor");                 //This is used to print Statement
			assertNotEquals("", new CompositionTest());            //Here assertNotEquals is used
		
	}
	
/**
 * This is used to test GetID
 * */
	@Test
	public void testGetID() {
		System.out.println("Executed Address getter ID"); //This is used to print Statement
		assertEquals(iid, a.getId());                     //Here assertEquals is used
		assertTrue(iid == a.getId());                     //Here assertTrue is used
		}
	
/**
 * This is used to test GetName
 **/
	@Test
	public void testGetName() {                      
		System.out.println("Executed Address getter Name");  //This is used to print Statement
		assertEquals(nm, f.getName());                        //Here assertEquals is used
		assertTrue(nm == f.getName());
		}
	
	
/**
 * This is used to test Getcomposer
 **/
	@Test
	public void testGetcomposer() {
		Composer p = new Composer(null,null,null);
	    System.out.println("Executed Address getter Composer");//This is used to print Statement
		assertEquals(p, c.getComposer());                       //Here assertEquals is used
		}

/**
 * This is used to test SetID
 **/
    @Test
	public void testSetID() {
		a.setId("PB26");
		System.out.println("Executed Address setter");//This is used to print Statement
		assertEquals("PB26", a.getId());              //Here assertEquals is used
		assertFalse("1600" == a.getId());             //Here assertFalse is used
		
	}

 /**
  * This is used to test SetName
  * */
	@Test
	public void testSetName() {
		f.setName("java");
		System.out.println("Executed Address setter");//This is used to print Statement
		assertEquals("java", f.getName());           //Here assertEquals is used
		assertFalse("1600" == f.getName());          //Here assertFalse is used
	}

	

}
