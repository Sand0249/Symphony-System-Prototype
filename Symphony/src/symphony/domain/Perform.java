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
 * Class "Perform"
 */
public class Perform {

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Perform(){ }


/**
 * add method adding composition
 * @param composition
 * @return true
 */
public boolean add(Composition composition){
	return true;} 	  // returning true 



/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getPerformDate
 * @return performDate as Date
 */
public Date getPerformDate(){
	return performDate; // returning performDate as Date
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets perfromDAte as Date using setPerformDate
 * @param   performDate to set as Date
 */	
public void setPerformDate(Date performDate){
	this.performDate=performDate;    // setting the value of performDate asa  type of Date
}	


/**
 * toString method that returns all data entered by user and displays Perfrom Date for concert
 * @return performDate as a type of Date
 */
public String toString(){
	return "Perform Date is "+ performDate; // returning the value of performDate
}
	
private Date performDate;    // instantiating performDate as a type of Date

}      // end of class