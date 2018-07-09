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

import symphony.domain.Address;
import symphony.domain.Composer;
import symphony.domain.Composition;
import symphony.domain.ID;
import symphony.domain.Individual;
import symphony.domain.Name;
import symphony.domain.Telephone;

public class IndividualTest {
	Individual q=new Individual();
	Composition c= new Composition();
Address t=new Address();
Telephone b= new Telephone();
	Name f=new Name();
	ID a=new ID();
	String name="java";
	String address="1800 baseline";
	String id="PB26";
	String telephone="123";

	@Test
	public void testIndividual() {

	}

/**
 * This test is used to test Constructor
 **/
	@Test
	public void testIndividualNameAddressTelephone() {
		Individual c = new Individual(null,null,null);
		assertNotNull("should be not null",  c );
		assertNotEquals("", c);
		System.out.println("Default Constructor");
	}

/**
 * This test is used to test GetName
 **/
	@Test
	public void testGetName() {
		System.out.println("Executed  getter Name");
		assertEquals(name, f.getName());
		assertTrue(name == f.getName());
	}

	
/**
 * This test is used to test Telephone
 **/
	@Test
	public void testGetTelephone() {
		System.out.println("Executed telephone getter");
		assertEquals(telephone, b.getTelephone());
		assertTrue(telephone == b.getTelephone());
		}
	
	
/**
 * This test is used to test GetID
 **/
	@Test
	public void testGetID() {
		System.out.println("Executed telephone getter");
		assertEquals(id, a.getId());
		assertTrue(id == a.getId());
		}
	
	
/**
 * This test is used to test SetName
 * */
	@Test
	public void testSetName() {
		f.setName("java");
		System.out.println("Executed Address setter");
		assertEquals("java", f.getName());
		assertFalse("1600" == f.getName());
	}


/**
 * This test is used to test SetID
 * */	

	@Test
	public void testSetID() {
		a.setId("PB26");
		System.out.println("Executed id setter");
		assertEquals("PB26", a.getId());
		
		assertFalse("1600" == a.getId());
	}
	
/**
 * This test is used to test SetTelephone
 * */	
	public void testSetTelephone(){
		b.setTelephone("123");
		System.out.println("Executed Telephone setter");
		assertEquals("123", b.getTelephone());
		
		assertFalse("1600" == b.getTelephone());
	}

/**
 * This test is used to test ToString
 **/	
	@Test
	public void testToString() {
		String it="Name of person is " + null 
				+"  Address of the person is " + null 
				+ "Telephone of the person is " 
				+ null + " ID is "+ null;
		assertEquals(it, q.toString());
	
	}

}
