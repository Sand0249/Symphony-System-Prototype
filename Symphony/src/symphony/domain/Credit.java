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
 * Class "Credit"
 */
public class Credit implements Payment{


/* ACCESSORS	-----------------------------------------------------	*/

/**
* Get method that returns result of getCardNumber
* @return cardNumber as int
*/	
public int getCardNumber(){
		return cardNumber;           // returning the value of cardNumber
}


/**
* Get method that returns result of getID
* @return id as ID
*/	
@Override
public ID getId() {
		return id;               // returning the value of id
}


/**
* Get method that returns result of getDate
* @return date as Date
*/	
@Override
public Date getDate() {
		return date;        // returning the value of date 
}


/**
* Get method that returns result of getHolder
* @return holder as AccountHolder
*/	
@Override
public AccountHolder getHolder() {
		return holder;            // returning the value of holder
}

@Override
public void AccountHolder(AccountHolder holder) {
      this.holder=holder;          // setting the value of holder as a type of AccountHolder
}


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets id as ID using setId
 * @param   id to set as ID
 */	
@Override
public void setId(ID id) {
		this.id=id;          // setting the value of id as a type of ID
}


/**
 * Set method that sets date as Date using setDate
 * @param   date to set as Date
 */
@Override
public void setDate(Date date) {
		this.date = date;         // setting the value of date as a type of Date
}


/**
 * Set method that sets cardNumber as int using setCardNumber
 * @param   cardNumber to set as int
 */
public void setCardNumber(int cardNumber) {
	    this.cardNumber=cardNumber;	   // setting the value of cardNumber as a type of int
}

	private ID id;            // instantiating id as a type of ID
	private Date date;        // instantiating date as a type of Date
	private int cardNumber;   // instantiating cardNumber as a type of int
	private AccountHolder holder; // instantiating holder as a type of AccountHolder
		
}   // end of class
