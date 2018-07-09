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

public class AccountHolderTest {
   /**
    * This is to test AccountHolder method
    * 
    * */
	
	@Test
	public void testAccountHolder() {
		assertNotNull("should be not null", new AccountHolderTest());//In this assertNotnull is used
		System.out.println("Default Constructor"); //printing the statement
			assertNotEquals("", new AccountHolderTest());//here is arrertNotEquals is used
	}

}
