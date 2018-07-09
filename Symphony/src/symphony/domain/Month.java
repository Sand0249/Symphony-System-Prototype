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
 * Class "Month"
 */

public class Month {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Month(){}
	

/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getMonth
 * @return month as int
 */	
public int getMonth(){
		return month;      // returning value of month
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets month as int using setMonth
 * @param   month to set as int
 */	
public void setMonth(int month){
		this.month=month;        // setting value of month as a type of int
}
	
private int month;

} // end of class
