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
 * Class "AccountHolder"
 */

/** in this class Singleton design pattern is used by making constructors private
 *
 */
public class AccountHolder extends Individual{

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*
*/
	
private AccountHolder a ;	
private AccountHolder(){ }

/**
 * parameterized constructor
 * @param name
 * @param address
 * @param telephone
 */
private AccountHolder(Name name,Address address,Telephone telephone){
         super( name, address,telephone);		
        
        
	}

public void setT(){
	 if(a == null){
    	 this.a = new AccountHolder();
     }
	 
}

public AccountHolder getT(){
	return a;
}



} // end of class
