package vm222cv_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) throws FileNotFoundException  
	{

		File file = new File("C:/Users/vikra/Desktop/java_courses/1DV506/src/vm222cv_assign4/HistoryOfProgramming.txt");
		//Reading file from the given directory, the sysout's below print out the method and values
		System.out.println("Reading file from: " + file);
		System.out.println("Number of upper case letters: " + upperCaseCount(file));
		System.out.println("Number of lower case letters: " + lowerCaseCount(file));
		System.out.println("Number of \"whitespaces\": " + whitespaceCount(file));
		System.out.println("Number of others: " + otherCount(file));
	}
	
	public static int upperCaseCount(File file) //method to count upper cases in a file
	{	
		int upperCase = 0;

		Scanner scan;
		try 
		{
			scan = new Scanner(file);
			
			while (scan.hasNext()) 
			{
			String str= scan.nextLine();
			
			for (int i = 0; i <= str.length()-1; i++) //for loop going from first index of string to last index
			{
				if (Character.isUpperCase(str.charAt(i))) // if character at specific index is upper case
				{
					upperCase++; //then the upper case counter goes up
				}
			}
			}
			scan.close();
		}
		catch (FileNotFoundException e) //if file cannot be found, then it throws and exception and exits
		{
			e.printStackTrace();
			System.exit(0);
		} 
		
	return upperCase; //returns the upper case count value 
	}
	
	
	public static int lowerCaseCount(File file) //same explanation as previous one but for lower case counting
	{	
		int lowerCase = 0;
		
		try
		{
			Scanner scan = new Scanner(file);
						
			while (scan.hasNext())
			{
			String str= scan.nextLine();
				
			for (int i = 0; i <= str.length()-1; i++) 
			{
				if (Character.isLowerCase(str.charAt(i)))
				{
					lowerCase++; 
				}
			}
		}
			scan.close();
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			System.exit(0);
		} 
		
		return lowerCase;
		}
	
	
	public static int whitespaceCount(File file) //same explanation as previous except for whitespace counting
	{	
		int whitespace = 0;
		
		try
		{
			Scanner scan = new Scanner(file);
			
			
			while (scan.hasNextLine())
			{
			String str = scan.nextLine();
			
			whitespace++; //whitespace is incremented here as well since scan.nextline consumes newline character
			
			for (int i = 0; i <= str.length()-1; i++) 
			{
				if (Character.isWhitespace(str.charAt(i)))
				{
					whitespace++; 
				}
			}
		}
			scan.close();
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			System.exit(0);
		} 
		
		return whitespace;
		}
	
	
	public static int otherCount (File file) //same explanation as previous ones except for counting other characters
	{
		int other = 0;

		try
		{
		Scanner scan = new Scanner(file);
		
		
		while (scan.hasNext())
		{
		String str= scan.nextLine();
		
	
		for (int i = 0; i <= str.length()-1; i++) 
		{
		if (Character.isUpperCase(str.charAt(i)) == false && Character.isLowerCase(str.charAt(i)) == false && Character.isWhitespace(str.charAt(i)) == false)
		{
			other++;
		}
		}
		}
		scan.close();
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			System.exit(0);
		} 
		return other;
	}
}