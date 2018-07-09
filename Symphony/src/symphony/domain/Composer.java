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
 * Class "Composer"
 */
public class Composer extends Individual{

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
	 * Default Constructor
	 */
public Composer(){}

/**
 * parameterized constructor
 */
public Composer(Name name, Address address, Telephone telephone){
	super(name,address,telephone);
}

} // end of class
