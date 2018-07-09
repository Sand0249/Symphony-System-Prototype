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
 * Class "Year"
 */
public class Year {

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Year(){}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getYear
 * @return year as int
 */
public int getYear(){
	return year;              // returning the value of year
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets year as int using setYear
 * @param   year to set as int
 */	
public void setYear(int year){
	this.year=year;          // setting value of year as a type of int
}

private int year;    // instantiating year as a type int

} //end of class
