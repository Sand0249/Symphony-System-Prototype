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
 * Class "Conductor"
 */

public class Conductor extends Individual{


/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Conductor(){}


/**
 * parameterized constructor
 * @param name
 * @param address
 * @param telephone
 */
public Conductor(Name name, Address address, Telephone telephone){
	super(name,address,telephone);
	
}
} // end of class
