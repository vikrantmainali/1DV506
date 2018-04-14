package vm222cv_assign3;

public class SweID {

	public static void main(String[] args) {

	String personalNum = "981113-0112";
	String pN2 = "981113-0112";
	String pN3 = "981121-0312";
	String pN4 = "811228-9874";
	String pN5 = "811228-9873";
	
	System.out.println("first part: " + getFirstPart(personalNum));
	System.out.println("second part: " + getSecondPart(personalNum));
	System.out.println("checking if number is female number: " + isFemaleNumber(personalNum));
	System.out.println("checking if number is male number: " + isMaleNumber(personalNum));
	System.out.println("checking if two id numbers are equal (true example): " + areEqual(personalNum,pN2));
	System.out.println("checking if two id numbers are equal (false example): " + areEqual(personalNum,pN3));
	System.out.println("check if it is correct checksum (a true example): " +isCorrect(pN4));
	System.out.println("check if it is correct checksum (a false example): " +isCorrect(pN5));
	}
		
	
	private static String getFirstPart(String str) //method to get the first part of the string (YYMMDD)
	{			
			return str.substring(0,6); 
			//we can easily do that by using str.substring since the indices will always be the same when giving personal number of form YYMMDD-XXXX
	}
	
	
	private static String getSecondPart(String str) //method to get the second part of the string (XXXX)
	{	
			return	str.substring(7,11); //same reasoning as previous use of str.substring 
	}
	

	private static boolean isFemaleNumber(String str) //checking if the given personal number is a female number
	{
		if (Integer.parseInt(str.substring(9))%2==0) 
			/*Integer.parseInt is used because we're using string to store the personal number, 
			female personal numbers have even ninth number, therefore we get the 9th number using str.substring
			and check if the number mod 2 is equal to 0 to check if it is even or not*/
		
			return true; //if the number is even, it gives us true
		else	
			return false; //otherwise it gives us false
	}
	
	
	private static boolean isMaleNumber(String str) //checking if the given personal number is a male number
	{
		if (Integer.parseInt(str.substring(9))%2!=0) //same theory as before except male personal number is if the 9th number is odd
			return true;
		else
			return false;
	}
	
		
	public static boolean areEqual(String str, String str2) //checking if two given personal numbers are equal or not
	{
		if (str.equals(str2)) //comparing two strings to see if they are equal or not
			
			return true; //if equal then it gives us true
		else
			return false; //otherwise it gives us false
	}
	
	
	public static boolean isCorrect(String str) //method to check if the given personal number is of correct type
	{
		int month = Integer.parseInt(str.substring(2,4)); //getting the MM index in the string 
		int day = Integer.parseInt(str.substring(4,6)); //getting the DD index in the string
	
		
		if (month>12) //since month cannot be greater than 12
		{
			return false; //return false if given month is more than 12
		}
		
		
		if (day>31) //since there aren't any months with more than 31 days
		{
			return false; //return false if given day is more than 31
		}
		
		int checkSum = 0;
		int lastDigit = Integer.parseInt(str.substring(10));
		int product;
		int result;
		int[] results = new int[str.length()];

		
		for (int i = 0; i < str.length()-1; i++)
		{
			
			while (str.charAt(i) == '-') //if the character from index 0 to final index is hyphen then move on to the next number
			{
				i++;
			}
			
			if (i == 0 || i == 2 || i == 4 || i == 7 || i == 9) //these are the indices for which the checksum algorithm is multiplied by 2
			{
				product = 2;
			}
		
			else
			{
				product = 1; //if none of the previous indices then product is 1
			}
			
			result =Integer.parseInt((String.valueOf(str.charAt(i))))*product; 
			//result of multiplying the value of each index by corresponding product
			
			
		
		if (Integer.toString(result).length() == 2)
			//if the string is a double digit 
		{
			result = (Integer.parseInt(String.valueOf(Integer.toString(result).charAt(0)))+
					result%10);
			/*then the result is the character at 0 (the tens place of the double digit)
			plus the result%10 (which is the ones place of the double digit)*/
		}
				
		else if (Integer.toString(result).length() == 1)
			//if the string is a single digit
		{			
			result = Integer.parseInt(String.valueOf(Integer.toString(result).charAt(0)));
			//then the result is just the digit itself * 1 (because of the else statement above)
		}

		
		results[i] = result; //storing the results array with result
				
		int sum = sum(results); //summing up all the elements in the array results using the method below
				
		checkSum = 10-(sum%10); //"10 minus last digit" part from wikipedia' personal identity number (sweden) checksum section
		
		}
		
		if ((checkSum != lastDigit)) //if the checkSum is not eqaul to the last digit
		{
			return false; //then return false
		}
		
		return true; //otherwise return true
	}
	
	
	private static int sum(int[] arr) //method to sum elements of an array
	{
		int sum = 0; 
		int i;
		
		for(i = 0; i<=arr.length-1; i++) //for loop going from 0 (first index of array) to arr.length-1 (last index of array)
		{
		
		sum = sum + arr[i]; //goes through all indices of array arr and adds them up
		}
		
		return sum; //gives us the sum of the elements in the array
	}	
}
	
	


