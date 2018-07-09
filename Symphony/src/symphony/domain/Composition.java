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
 * Class "Composition"
 */

public class Composition {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Composition(){}


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getID
 * @return id as ID
 */
public ID getId(){
	return id;    // returning value of id
}


/**
 * Get method that returns result of getName
 * @return name as Name
 */
public Name getName(){
	return name;     // returning value of name
}


/**
 * Get method that returns result of getComposer
 * @return composer as Composer
 */
public Composer getComposer(){
	return composer;         // returning value of composer
}


/**
 * Get method that returns result of getSoloist
 * @return soloist as Soloist
 */
public Soloist getSoloist(){
	return soloist;             // returning value of soloist
}



/**
 * Get method that returns result of getMovement
 * @return movement as Movement
 */
public Movement getMovement(){
	return movement;}       // returning the value of movement



/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets id as ID using setId
 * @param   id to set as ID
 */	
public void setId(ID id){
	this.id=id;          // setting value of id as a type of ID
}


/**
 * Set method that sets name as Name using setName
 * @param   name to set as Name
 */
public void setName(Name name){
	this.name = name;          // setting value of name as a type of Name
}


/**
 * Set method that sets soloist as Soloist using setSoloist
 * @param   soloist to set as Soloist
 */
public void setSoloist(Soloist soloist){
	this.soloist = soloist;    // setting value of soloist as a type of Soloist
}


/**
 * Set method that sets movement as Movement using setMovement
 * @param   movement to set as Movement
 */
public void setMovement(Movement movement){
	this.movement=movement;     //setting the value of movement as a type of Movement
}

private Soloist soloist;     // intantiating soloist as a type of Soloist
private ID id;               // intantiating id as a type of ID
private Name name;           // intantiating name as a type of Name
private Composer composer;   // intantiating composer as a type of Composer
private Movement movement;   // instantiating movement as a type of Movement

}
