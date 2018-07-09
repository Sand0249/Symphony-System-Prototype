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
 * Class "Ticket"
 */
public class Ticket {

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/	
public Ticket(){}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getPrice
 * @return price as double
 */
public double getPrice(){
		return price;       // returning the value of price
}


/**
 * Get method that returns result of getID
 * @return id as ID
 */
public ID getID(){
		return id;           // returning the value of id
} 


/**
 * Get method that returns result of getSeatNumber
 * @return seatNumber as int
 */
public int getSeatNumber(){
		return seatNumber;          // returning the value of seatNumber
}


/**
 * Get method that returns result of getVenue
 * @return venue as Venue
 */
public Venue getVenue(){
		return venue;           // returning the value of venue
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets price as double using setPrice
 * @param price to set as double
 */
public void setPrice(double price){
		this.price=price;                 // setting the value of price  as a type of double
}


/**
 * Set method that sets id as ID using setID
 * @param id to set as ID
 */
public void setID(ID id){
		this.id=id;          // setting the value of id as a type of ID
}


/**
 * Set method that sets seatNumber as int using setSeatNumber
 * @param seatNumber to set as int
 */
public void setSeatNumber(int seatNumber){
		this.seatNumber = seatNumber;            // setting the value of seatNumber as a type of int
}


/**
 * Set method that sets venue as Venue using setVenue
 * @param venue to set as Venue
 */
public void setVenue(Venue venue){
		this.venue=venue;                  // setting the value of venue as a type of Venue
}
	
	
	public double price;         // instantiating  price as a type double
	public ID id;                // instantiating id as a type of ID
	public int seatNumber;       // instantiating seatNumber as a type of 
	public Venue venue;
	
}    // end of class
