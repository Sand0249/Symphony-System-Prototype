package symphony.domain;
/*
 * @version		1.0.0
 * @authors:	Simranjit Singh Sandhu
 *              Prabdeep Singh Pannu
 *              Princedeep Singh
 *              Vikramjeet Singh
 *              Ali Akbari
 *	Modified:   12 April 2017
 */

/* 
 * Class "PostalCode"
 */
public class PostalCode {

	

/* ACCESSORS	-----------------------------------------------------	*/

/**
* Get method that returns result of getPostalCode
* @return pCode as string
*/
public String getPostalCode(){
		return pCode;        // returning the pCode
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets pCode as string using setPCode
 * @param   pCode to set as string
 */	
public void setPostalCode(String pCode){
		this.pCode=pCode;     // setting the value of pCode as a type of string
	}
	
	
	
private String pCode;         // instantiating pCode as a type of String

}   // end of class
