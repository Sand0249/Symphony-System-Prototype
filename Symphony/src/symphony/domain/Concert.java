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
 * Class "Concert"
 */

public class Concert {

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Concert(){}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getConductor
 * @return conductor as Conductor
 */
public Conductor getConductor(){
		return conductor;}          // returning conductor as a type of Conductor
	

/**
 * Get method that returns result of getConcertNumber
 * @return concertNumber as ID
 */
public ID getConcertNumber(){
		return concertNumber;      // returning concertNumber as a type of ID
	}


/**
 * Get method that returns result of getPerform
 * @return perform as Perform
 */
public Perform getPerform(){
		return perform;          // returning perform as a type of Perform
	}


/**
 * Get method that returns result of getDate
 * @return date as Date
 */
public Date getDate(){
		return date;	       // returning date as a type of Date
	}


/**
 * Get method that returns result of getVenue
 * @return venue as Venue
 */
public Venue getVenue(){
		return venue;	    // returning venue as a type of Venue
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets concertNumber ID int using setConcertNumber
 * @param   concertNumber to set as ID
 */
public void  setConcertNumber(ID concertNumber){
	  this.concertNumber=concertNumber;        // setting value of concertNumber
   }


/**
 * Set method that sets perform as Perform using setPerform
 * @param  perform to set as Perform
 */
public void setPerform(Perform perform){
	   this.perform= perform;               // setting value of perform
}	


/**
 * Set method that sets date as Date using setDate
 * @param   date to set as Date
 */
public void setDate(Date date){
	   this.date= date;                    // setting calue of date
   }


/**
 * Set method that sets venue as Venue using setVenue
 * @param   venue to set as Venue
 */
public void setVenue(Venue venue){
	   this.venue= venue;              // setting value of venue
   }	
	
	private Conductor conductor;     // instantiating conductor as a type of Conductor
	private ID concertNumber;        // instantiating concertNumber as a type of ID
	private Perform perform;         // instantiating perform as a type of Perform
	private Date date;               // instantiating date as a type of Date
	private Venue venue;             // instantiating venue as a type of Venue
	
	
} // end of class
