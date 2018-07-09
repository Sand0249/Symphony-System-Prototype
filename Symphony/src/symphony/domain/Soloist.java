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
 * Class "Soloist"
 */
       /**
        *  in this class Singleton pattern is used by making constructors private
        */
public class Soloist extends Individual{
	

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default  privateConstructor
*/
private Soloist(){}

/**
 * parameterized   private constructor
 * @param name 
 * @param address
 * @param telephone
 * @param expert
 */
private Soloist(Name name, Address address , Telephone telephone, String expert){
		super(name, address, telephone);
		this.expert = expert;
}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getExpert
 * @return expert as string
 */
public String getExpert(){
		return expert;    // returning the value of expert
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets expert as string using setExpert
 * @param   expert to set as string
 */
public void setExpert(String expert){
		this.expert=expert;       // setting the value of expert as atype of string
		
		
	}
private String expert;         // instantiating expert as a type of string

} // end of class
