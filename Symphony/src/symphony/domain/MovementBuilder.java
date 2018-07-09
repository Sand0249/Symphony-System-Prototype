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
 * Class "MovementBuilder"
 */
public class MovementBuilder {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public MovementBuilder(){}

/**
 * 
 * @return Movement.getMovement using Movement class
 */
public Movement build(){
		return Movement.getMovement(this); // returning Movement class  
		
	}
	
	
	
/**
 * 	Builder method setting value of number and returning the value of class
 * @param number
 * @return the builder class
 */
public MovementBuilder movementID(ID number){
	this.number= number;      // setting the value of number as a  type of movementId
	return this;              // returning the value of same class
		
	}

/**
 * builder method setting value of name and returning value of class
 * @param name
 * @return the builder class
 */
public MovementBuilder Name(Name name){
		this.name=name;     // setting the value of name as a type of Name
		return this;        // returning the value of same class
}

/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getNumber
 * @return number as ID
 */
public ID getNumber() {
		
		return number;        // returning the value of number as a type of ID
	}


/**
 * Get method that returns result of getName
 * @return name as Name
 */
public Name getName() {
		return name;          // returning the value of name as a type of Name 
	}
	 
public ID number;    // instantiating the value of number as a type of ID
public Name name;    // instantiating the value of name as a type of Name
		
	
}    // end of class
