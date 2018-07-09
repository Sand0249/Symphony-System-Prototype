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
 * Class "DateBuilder"
 */
public class DateBuilder {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public DateBuilder(){ }


/**
 * parameterized constructor
 * @param year
 * @param month
 * @param day
 */
public DateBuilder(Year year,Month month,Day day){
		this.year=year;
		this.month = month;
		this.day = day;
}


/**
 * build method retrieving value of date
 * @return Date.getDate
 */
public Date build(){
		return Date.getDate(this);
}


/**
 * Time method setting value time
 * @param time
 * @return Date builder class
 */
public DateBuilder time(Time time){
		this.time = time; // setting the value of 
		return this;  // returning value of class
}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getYear
 * @return year as Year
 */
public Year getYear(){
		return year;  // returning the value of year
} 


/**
 * Get method that returns result of getMonth
 * @return month as month
 */
public Month getMonth(){
		return month;           // returning the value of month
}


/**
 * Get method that returns result of getDay
 * @return day as Day
 */
public Day getDay(){
		return day;           // returning the value of day
}


/**
 * Get method that returns result of getTime
 * @return time as Time
 */
public Time getTime(){
		return time;         // returning the value of time
}
	
	
	
	private Year year;      // instantiating year as a type of Year
	private Day day;        // instantiating day as a type of Day
	private Month month;    // instantiating month as a type of Month
	private Time time;      // instantiating time as a type of Time

}   // end of class
