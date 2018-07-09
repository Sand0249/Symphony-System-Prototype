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
 * Class "OpeningDate"
 */
public class OpeningDate {
	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public OpeningDate(){}
	
/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getOpeningDay
 * @return  openingDay as int
 */
public int getOpeningDay(){
		return openingDay;          // returning the value of openingDay
}


/**
 * Get method that returns result of getOpeningMonth
 * @return  openingMonth as int
 */
public int getOpeningMonth(){
		return openingMonth;         // returning the value of openingMonth
}


/**
 * Get method that returns result of getOpeningYear
 * @return  openingYear as int
 */
public int getOpeningYear(){
		return openingYear;         // returning the value of openingYear
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets openingDay as int using setOpeningDay
 * @param   openingDay to set as int
 */	
public void setOpeningDay(int openingDay){
		this.openingDay=openingDay;        // setting the value of openingDay as a type of int
}


/**
 * Set method that sets openingMonth as int using setOpeningMonth
 * @param   openingMonth to set as int
 */	
public void setOpeningMonth(int openingMonth){
		this.openingMonth=openingMonth;  // setting the value of openingMonth as a type of int
}


/**
 * Set method that sets openingYear as int using setOpeningYear
 * @param   openingYear to set as int
 */
public void setopeningYear(int openingYear){
		this.openingYear=openingYear;      // setting the value of openingYear as a type of int
}
	
	
	private int openingDay;            // instantiating openingDay as a type of int
	private int openingMonth;          // instantiating openingMonth as a type of int
	private int openingYear;          // instantiating openingYear as a type of int

}      // end of class
