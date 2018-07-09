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
 * Class "Venue"
 */
public class Venue {


/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Venue(){}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getConcerts
 * @return concerts as int
 */
public int getConcerts(){
	return concerts;                  // returning the value of concerts as a type of int
} 


/**
 * Get method that returns result of getAddress
 * @return address as Address
 */
public Address getAddress(){
	return address;             // returning the value of address as a type of Address
}


/**
 * Get method that returns result of getSeats
 * @return seats as int
 */
public int getSeats(){
	return seats;                  // returning the value of seats
	}


/**
 * Get method that returns result of getTickets
 * @return tickets as int
 */
public int getTickets(){
	return tickets;                       // returning the value of tickets
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets concerts as int using setConcerts
 * @param   concerts to set as int
 */	
public void setConcerts(int concerts){
	this.concerts=concerts;        // setting the value of concerts as a type of int
	}


/**
 * Set method that sets address as Address using setAddress
 * @param   address to set as Address
 */	
public void setAddress(Address address){
	this.address=address;                         // setting the value of address as a type of Address
}


/**
 * Set method that sets seats as int using setSeats
 * @param   seats to set as int
 */
public void setSeats(int seats){
	this.seats = seats;                // setting the value of seats as a type of int
}


/**
 * Set method that sets tickets as int using setTickets
 * @param   tickets to set as int
 */
public void setTickets(int tickets){
	this.tickets=tickets;              // setting the value of tickets as a type of int
}




private int concerts;                  // instantiating private attribute named concerts as a type of int
private Address address;               // instantiating address as a type og Address
private int seats;                     // instantiating private seats as a type of int
private int tickets;                   // instantiating tickets as a type of int


}       // end of class


