package vm222cv_assign4.sort_cities;

public class City implements Comparable<City> 
{
	
	private String city;
	private int zipCode;

	public City(String newEntry) //constructor for city with string
	{ 
		String[] citiesArray = newEntry.split(";"); 
		/*this allows us to split the inputs into two part in the array, 
		 the string part and the integers part after the semicolon*/
		
		String postalCode = citiesArray[0]; //the numbers get saved as the 0th index of the array
				
		city = citiesArray[1]; //the cities get saved as the 1st index of the array
		
		zipCode = Integer.parseInt(postalCode); //allows us to get the postal code in int form instead of string
	}

	
	public int compareTo(City entry)  //allows us to compare the zip codes together so we can sort them in order
	{ 
		int comparedZip = zipCode - entry.zipCode;
		
		return comparedZip;
	}

	
	public String toString() //returning the strings in form ZipCode City
	{ 
		return zipCode + " " + city;
	}

}

