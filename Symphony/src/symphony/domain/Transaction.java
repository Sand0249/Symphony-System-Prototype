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
 * Class "Transaction"
 */
public class Transaction {


/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Transaction(){}	


/**
 * parameterized constructor
 * @param date
 * @param payment
 * @param id
 * @param ticket
 */
public Transaction(Date date,Payment payment,ID id, Ticket ticket){
	this.date=date;
	this.payment= payment;
	this.id=id;
	this.ticket=ticket;
}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getDate
 * @return date as Date
 */
public Date getDate(){
	return date;        // returning the value of date
}



/**
 * Get method that returns result of getPayment
 * @return payment as Payment
 */
public Payment getPayment(){
	return payment;            // returning the value of payment
}



/**
 * Get method that returns result of getID
 * @return id as ID
 */
public ID getID(){
	return id;             // returning the value of id
}


/**
 * Get method that returns result of getTicket
 * @return ticket as Ticket
 */
public Ticket getTicket(){
	return ticket;           // returning the value of ticket
}

/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets date as Date using setDate
 * @param   date to set as Date
 */
public void setDate(Date date){
	this.date=date;                    // setting the value of date as a type of Date
}


/**
 * Set method that sets payment as Payment using setPayment
 * @param   payment to set as Payment
 */
public void setPayment(Payment payment){
	this.payment =payment;                // setting the value of payment as a type of Payment
}


/**
 * Set method that sets id as ID using setID
 * @param   id to set as ID
 */
public void setID(ID id){
	this.id=id;             // setting the value of id as a type of ID
}


/**
 * Set method that sets ticket as Ticket using setTicket
 * @param   ticket to set as Ticket
 */
public void setTicket(Ticket ticket){
	this.ticket=ticket;           // setting the value of ticket as a type of Ticket
}

public String toString() {
	return "ID is " + id + " Date =" + date + " Tickets  " + ticket + " Payment Method " + payment;
}	
	
	
	
		
private Date date;	
private Payment payment;	
private ID id;	
private Ticket ticket;	
	
}
