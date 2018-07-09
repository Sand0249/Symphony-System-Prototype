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
 * Class "Date"
 */

public class Date {

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Date(){}

/**
 * parameterized constructor
 * @param builder
 */
public Date(DateBuilder builder){
		builder.getDay();
		builder.getMonth();
		builder.getTime();
		builder.getYear();
}


/**
 * Get method that returns result of getDate
 * @return Date(builder) as Date
 */
public static Date getDate(DateBuilder builder) {
		return new Date(builder);
}
	
	
	private Year year;      // instantiating year as a type of Year
	private Month month;    // instantiating month as a type of Month
	private Day day;        // instantiating day as a type of Day
	private Time time;      // instantiating time as a type of Time

} // end of class
