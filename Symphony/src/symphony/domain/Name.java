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
 * Class "Name"
 */
public class Name {
	

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Name(){}

	
/* ACCESSORS	-----------------------------------------------------	*/

/**
* Get method that returns result of getName
* @return name as String
*/
public String getName(){
		return name;}         // returning the value of name

/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets name string using setName
 * @param   name to set as string
 */	
public void setName(String name){
		this.name=name;         // setting the value of name as a type of string

}
	
	public String name;       // instantiating name as a type of string 

} // end of class
