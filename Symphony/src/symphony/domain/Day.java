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
 * Class "Day"
 */
public class Day {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Day(){}
	

/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getDay
 * @return day as int
 */
public int getDay(){
		return day;    // returning the value of day
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets day as int using setDay
 * @param   day to set as int
 */
public void setDay(int day){
		this.day=day;     // setting the value of day
}
	
	
public int day;    // instantiating the value of day as a type of int

}  // end of class
