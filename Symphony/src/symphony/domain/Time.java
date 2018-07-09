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
 * Class "Time"
 */
public class Time {
	
	
	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Time(){}



/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getHour
 * @return hour as int
 */
public int getHour(){
		return hour;           // returning the value of hour
}


/**
 * Get method that returns result of getMin
 * @return min as int
 */
public int getMin(){
		return min;         // returning the value of min
}


/**
 * Get method that returns result of getSec
 * @return sec as int
 */
public int getsec(){
		return sec;          // returning the value of sec
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets hour as int using setHour
 * @param   hour to set as int
 */	
public void setHour(int hour){
		this.hour=hour;       // setting the value of hour as a type of int
}

/**
 * Set method that sets min as int using setMin
 * @param   min to set as int
 */	
public void setMin(int min){
		this.min = min;   //setting the value of min as a type of int
}


/**
 * Set method that sets sec as int using setSec
 * @param   sec to set as int
 */	
public void setsec(int sec){
		this.sec = sec;      // setting the value of sec as a type of int
}


/**
 *  toString method that returns all data entered by user and displays time
 *  @return int containing hour, min and sec
 */
public String toString(){
		return "Time "+ hour+":"+min+":"+sec;   // returning hour, min and sec as int
}

    private int hour;      // instantiating hour as a type of int
	private int min;       // instantiating min as a  type of int
	private int sec;       // instantiating sec as a type of int

}   // end of class
