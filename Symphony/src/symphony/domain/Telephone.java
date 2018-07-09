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
 * Class "Telephone"
 */
public class Telephone {
	
	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Telephone(){}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getelephone
 * @return telephone as string
 */
public String getTelephone(){
		return telephone;                  // returning the value of telephone
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets telephone as string using setTelephone
 * @param   telephone to set as string
 */
public void setTelephone(String telephone){
		this.telephone = telephone;       // setting the value of telephone as a type of string
} 
	
private String telephone;    // instantiating telephone as a type of String

}
