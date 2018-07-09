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
 * Class "Movement"
*/

public class Movement {


/**
 * Constructor setting values using builder
 * @param builder
 */
public Movement(MovementBuilder builder){
		this.number=builder.getNumber();        // setting the value of number using builder as a type of ID
		this.name= builder.getName();       // setting the value of name using builder as a type of Name
	}


/**
 * Get method returning the result of getMovement
 * @param builder
 * @return movement builder
 */
public static Movement getMovement(MovementBuilder builder){
		return new Movement(builder);} // returning the value of builder
	
	
	
	private ID number;      // instantiating number as a type of ID
    private Name name;      // instantiating name as a type of Name

} // end of class
