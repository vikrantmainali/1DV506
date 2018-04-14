package vm222cv_assign3;

public class TextAnalyzer {

	String text; 
	int charCount = 0;
	int upperCaseCount = 0;
	int whitespaceCount = 0;
	int digitCount = 0;
	
	
	public TextAnalyzer(String str) //constructor for analyzing a given string
	{
		text = str;
	}

	
	public int charCount() //method for counting characters in the string
	{
		int i;
		int n = text.length()-1;
		
		for (i = 0; i <= n; i++) //for loop from 0 (first index) to n (last index)
		{
			charCount++; //increase charCount for each loop
		}
		return charCount; //return the amount
	}
	
	
	public int upperCaseCount() //method for counting upper cases
	{
		int i;
		int n = text.length()-1;
		
		for (i = 0; i <= n; i++) //for loop from 0 (first index) to n (last index)
		{
			if (Character.isUpperCase(text.charAt(i))) //if the character at any indices is upper case
			{
				upperCaseCount++; // then increase the upper case counter
			}
		}
		return upperCaseCount; //return the amount
	}
	
	
	public int whitespaceCount() //method for counting white spaces
	{
		int i;
		int n = text.length()-1;
		
		for (i = 0; i <= n; i++) //for loop from 0 (first index) to n (last index)
		{
			
			if (Character.isWhitespace((text.charAt(i)))) // if the character at any indices is white space
			{
				whitespaceCount++;  //then increase the white space counter
			}
		}
		return whitespaceCount; //return the amount
	}
	
	
	public int digitCount() //method for counting digits
	{
		int i;
		int n = text.length()-1; //for loop from 0 (first index) to n (last index)
		
		for (i = 0; i <= n; i++)
		{
			if (Character.isDigit(text.charAt(i))) //if the character at any indices is a digit
			{
				digitCount++; //then increase the digit counter
			}
		}	
		return digitCount; //return the amount
	}
	
	
	public boolean containsChar(char check) //method to check if the text contains a given character
	{
		int i;
		int n = text.length()-1;
		
		for (i = 0; i <= n; i++) //for loop from 0 (first index) to n (last index)
		{
			if (text.charAt(i) == check) //if the character at any index from 0-n is the same as the given character (check) 
			{
				return true; //then return true
			}
		}
		return false; //otherwise return false
	}
	
	
	public boolean containsString(String check) //method to check if a given text contains a given string
	{
		int i; 
		int n = text.length()-1;
		
		for (i = 0; i <= n; i++) //for loop going from first index to last 
		{
			if (text.contains(check)) //if text contains the string
			{
				return true; //the return true 
			}
		}
		return false;//otherwise return false
	}
}

