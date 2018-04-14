package vm222cv_assign4.sort_cities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortCities 
{
	
	public static void main(String[] args)
	{
		try 
		{
			File file = new File("C:/Users/vikra/Desktop/java_courses/1DV506/src/vm222cv_assign4/Cities.txt");
			//file we are reading and its directory
			
			Scanner scan = new Scanner(file); //scanner so we can go through the file
			
			ArrayList<City> cities = new ArrayList<City>(); 
			//creating an ArrayList so we can use data structures and it's methods
			
			int total = 0; 	//initializing the counter as 0
		
			
			System.out.println("Reading file from: " + file);
		
		
		while (scan.hasNext()) //while there is more elements to scan
		{ 
			total++; //increase the counter
			
			String newEntry = scan.nextLine();
			
			City city = new City(newEntry); //calling city(String newEntry)
			
			cities.add(city);  //adding the city to arrayList cities
		}
		
		
		System.out.println("\nNumber of cities found: " + total + "\n");

		
		Collections.sort(cities); //sorting the cities

		
		for (int i = 0; i <= cities.size() - 1; i++) //for loop from the first index of cities to last
		{
			System.out.println(cities.get(i)); //printing the cities ArrayList elements
		}
		scan.close();
		} 
		
		
		catch (IOException e) //throw exception
		{
			System.out.println(e.getMessage());
			System.exit(0);

		}

	}

}

