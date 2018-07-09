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
 * Class "Address"
 */
public class Address {

	
/* CONSTRUCTORS	--------------------------------------------------	*/		
	
/**
* Default Constructor
*/
public Address(){
	
}

/**
 * 
 * @param address
 * @param pCode
 * @param streetName
 * @param city
 * @param province
 * @param streetNumber
 */
public Address(String address, PostalCode pCode, String streetName, String city, String province, int streetNumber){
	this.city=city;
	this.pCode=pCode;
	this.province=province;
	this.streetNumber = streetNumber;
	this.streetName=streetName;
	
	}
	


/* ACCESSORS	-----------------------------------------------------	*/

/**
 * Get method that returns result of getStreetNumber
 * @return streetNumber as int
 */
public int getStreetNumber(){
		return streetNumber; // this is returning streetNumber
		}
	

/**
 * Get method that returns result of getStreetName
 * @return streetName as string
 */	
public String getStreetName(){
		return streetName; // this is returning streetName
		}


/**
 * Get method that returns result of getCity
 * @return city as string
 */
public String getCity(){
		return city; // this is returning city
		}


/**
 * Get method that returns result of getStreetNumber
 * @return province as string
 */
public String getProvince(){
		return province;// this is returning province 
		}
	

/**
 * Get method that returns result of getStreetNumber
 * @return pCode as string
 */	
public PostalCode getPostalCode(){
		return pCode;}// this is returning pCode
	


/* MUTATORS	-----------------------------------------------------	*/

/**
 * Set method that sets streetNumber as int using setStreetNumber
 * @param   streetNumber to set as int
 */	
public void setStreetNumber(int streetNumber){
	this.streetNumber=streetNumber;  // setting value of streetNumber
    }


/**
 * Set method that sets streetName as string using setStreetName
 * @param   streetName to set as string
 */	
public void setStreetName(String streetName){
		this.streetName=streetName;  // setting value of streetName
	    }

/**
 * Set method that sets city as string using setCity
 * @param   city to set as string
 */
public void setCity(String city){
		this.city=city;            // setting value of city
	    }

/**
 * Set method that sets province as string using setProvince
 * @param   province to set as province
 */
public void setProvience(String province){
		this.province=province;        // setting value of province
	    }

/**
 * Set method that sets pCode as string using setPCode
 * @param   pCode to set as pCode
 */
public void setPostalCode(PostalCode pCode){
		this.pCode=pCode;         // setting value of pCode
	    }


/**
 * toString method that returns all data entered by user and displays Address
 * @return String containing streetName, city, province and pCode and int streetNumber
 */
public String toString(){
		return "Address = " +" "+streetNumber+" "+ streetName+ " "+city+"" +province+""+ pCode;
		}
	
	
	
	private int streetNumber;           // intantiating streetNumber as int
	private String streetName;         // instantiating streetName as string
	private String city;              // instantiating city as string
	private String province;           // instantiating city as province
	private PostalCode pCode;          // instantiating city as pCode
	
}// end class Address
