
public class Address {

	private String streetAddress, city, state;
	private long zipCode;
	
	public Address(String street, String town, String str, long zip){
		streetAddress = street;
		city = town;
		state = str;
		zipCode = zip;
	}
	
	public String toString(){
		String result; 
		result = streetAddress + "\n";
		result+= city +" "+ state+ " "+ zipCode;
		
		return result;
	}
	
}
