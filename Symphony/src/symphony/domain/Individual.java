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
 * Class "Individual"
 */

public class Individual {

/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Individual(){}

/**
 * parameterized constructor
 * @param name
 * @param address
 * @param telephone
 */
public Individual(Name name, Address address, Telephone telephone){
	this.name=name;
	this.address=address;
	this.telephone=telephone;
}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getName
 * @return name as Name
 */
public Name getName(){
	return name;  // returning the value of name
}


/**
 * Get method that returns result of getAddress
 * @return address as Address
 */
public Address getAddress(){
	return address;   // returning the value of address
}


/**
 * Get method that returns result of getTelephone
 * @return telephone as Telephone
 */
public Telephone getTelephone(){
	return telephone;}	 // returning the value of telephone
	

/**
 * Get method that returns result of getId
 * @return id as ID
 */
public ID getId(){
	return id;         // returning the value of id 
}	


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets streetNumber as int using setStreetNumber
 * @param   streetNumber to set as int
 */	
public void setName(Name name){
	this.name= name;         // setting the value of name as a type of Name
}


/**
 * Set method that sets address as Address using setAddress
 * @param   address to set as Address
 */	
public void setAddress(Address address){
	this.address= address;	 // setting the value of address as a type of Address
}


/**
 * Set method that sets id as ID using setId
 * @param   id to set as ID
 */	
public void setId(ID id){
	this.id = id;           // setting the value of id as a type of ID
} 


/**
 * toString method that returns all data entered by user and displays properties of any Individual
 * @return name, address, telephone, id as a type of Name, Address, Telephone and ID respectively
 */
public String toString(){
	return "Name of person is " + this.getName() 
			+"  Address of the person is " + this.getAddress()
			+ "Telephone of the person is " 
			+ this.getTelephone()+ " ID is "+ id;
}

private  Name name;          // instantiating name as a type of Name
private Address address;     // instantiating address as a type of Address
private Telephone telephone; // instantiating telephone as a type of Telephone
private ID id;               // instantiating id as a type of Id


} // end of class
