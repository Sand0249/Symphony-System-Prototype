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
 * Interface "Payment"
 */

public interface Payment {

/* ACCESSORS	-----------------------------------------------------	*/


public abstract ID getId();
public abstract Date getDate();
public abstract AccountHolder getHolder();



/* MUTATORS	-----------------------------------------------------	*/
public abstract void setId(ID id);
public abstract void setDate(Date date);
public abstract void AccountHolder(AccountHolder holder);

/**
 * 
 * toString method
 */
public abstract String toString();


}
