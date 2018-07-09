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
 * Class "ConcertSeason"
 */

public class ConcertSeason {
	

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
	/**
		 * Default Constructor
		 */	
public ConcertSeason(){}


/**
 *parameterized constructor 
 *
 * @param openingDate
 * @param seasonLength
 */
public ConcertSeason(OpeningDate openingDate, int seasonLength){
		this.openingDate=openingDate;
		this.seasonLength=seasonLength;
}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getOpeningDate
 * @return openingDate as OpeningDate
 */
public OpeningDate getOpeningDate(){
		return openingDate;       // returning openingLength as a type of OpeningDate
}


/**
 * Get method that returns result of getSeasonLength
 * @return seasonLength as int
 */
public int getSeasonLength(){
		return seasonLength;     // returning seasonLength as type of int
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets openingDate as OpeningDate using setOpeningDate
 * @param   openingDate to set as OpeningDate
 */	
public void setOpeningDate(OpeningDate openingDate){
		this.openingDate = openingDate;      // setting value of openingDate
	}


/**
 * Set method that sets seasonLength as int using setSeasonLength
 * @param seasonLength to set as int
 */
public void setSeasonLength(int seasonLength){
		this.seasonLength=seasonLength; // setting value of seasonLength
	}


/**
 * toString method that returns all data entered by user and displays ConcertSeason
 * @return OpeningDate containing openingDate and int seasonLength
 */
public String toString(){
		return "Opening Date for the concert is " 
	            + openingDate + 	" Season Length is " 
				+ seasonLength;
	}
	
	private OpeningDate openingDate;    // instantiating openingDate as a type of OpeningDate
	private int seasonLength;           // instantiating seasonLength as a type of int

}  // end of class
