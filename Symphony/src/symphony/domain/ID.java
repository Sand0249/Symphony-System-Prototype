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
 * Class "ID"
 */
public class ID {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public ID(){}
	
    	
/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getId
 * @return id as string
 */	
public String getId(){
		return id;  // returning the value of id
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets id as string using setId
 * @param   id to set as string
 */
public void setId(String id){
		this.id=id; // setting the value of id as a type of string
}
	
	private String id;    // instantiating id as a type of string

} // end of class
