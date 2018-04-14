package vm222cv_assign3;

public class Fraction {

	
	private int numerator;
	private int denominator;

	
	public Fraction(int n, int d) //constructor with parameters 
	{	
		if (d == 0) //since denominator can't be 0, we print out an error
		{
			System.err.println("Error: Cannot divide by 0!");
		}
		
		if (d != 0) //when denominator is not 0 (positive or negative)
		{
			numerator = n; 
			denominator = d;
		}
		
	}
	
	
	public int getNumerator() //method to get value of numerator
	{	
		return numerator;
	}
	
	
	public int getDenominator() //method to get value of denominator
	{
		return denominator;
	}
	
	
	public boolean isNegative() //method to check if fraction is negative
	{
		if ((numerator<0) || (denominator<0)) //fraction is negative when either numerator or denominator is less than 0
		{
			return true; //if the above conditions are met then return true
		}
		else
			return false; //otherwise return false
	}
	

	public boolean isEqualTo(Fraction frac) //method to check if two fractions are equal to one another
	{
		if ((frac.numerator % this.numerator == 0) && (frac.denominator % this.denominator == 0)
				|| (this.numerator % frac.numerator == 0) && (this.denominator % frac.denominator == 0))
			/*if two fractional instances are equal, meaning (1/2) = (2/4), etc.*/
		{
			return true; //if above conditions are met then return true
		}	
		else
			return false;//otherwise return false
	}
	
	
	public String add(int newNumerator, int newDenominator)//method to add two fractions
	{
		if (newDenominator == 0) //cannot do operations when denominator is equal to 0
		{
			System.out.println("Cannot add when denominator is 0!");
		}
		else if (newDenominator == denominator) //if the two denominators are equal 
		{
			numerator += newNumerator;//then the two numerators are added to get the new fraction
		}
		if (newDenominator != denominator)
			//if the two denominators are not equal then the following operations (just like how you'd solve it on paper) =>
		{
			numerator *=   newDenominator;
			
			newNumerator *= denominator;
			
			numerator += newNumerator;
			
			denominator *= newDenominator;
		}
		return (Integer.toString(numerator))+"/"+Integer.toString(denominator); //these values however are not in the most simplified form 
	}
	
	
	public String subtract(int newNumerator, int newDenominator)//method to subtract two fractions
	{
		if (newDenominator == 0) //same principle as before applies here
		{
			System.out.println("Cannot subtract when denominator is 0!");
		}
		else if (newDenominator == denominator)
		{
			numerator -= newNumerator;
		}
		if (newDenominator != denominator)
		{
			numerator *=   newDenominator;
			
			newNumerator *= denominator;
			
			numerator -= newNumerator;
			
			denominator *= newDenominator;
		}
		return (Integer.toString(numerator))+"/"+Integer.toString(denominator);
	}
	
	
	public String multiply(int newNumerator, int newDenominator) //method for multiplying two fractions
	{
		if (newDenominator == 0)
		{
			System.out.println("Cannot subtract when denominator is 0!");
		}
			numerator *= newNumerator; //just like how you would do on paper, multiply the two numerators together and two denominators together
			
			denominator *= newDenominator;
		
		return (Integer.toString(numerator))+"/"+Integer.toString(denominator);
	}
	
	
	public String divide(int newNumerator, int newDenominator) //method to divide two fractions
	{
		int flipN = 0;
		
		int flipD = 0;
		
		if (newDenominator == 0)
		{
			System.out.println("Cannot subtract when denominator is 0!");
		}
			flipN = newNumerator; 
			
			flipD = newDenominator;
			
			numerator *= flipD; 
			//just like on paper, during division of fractions, you take the reciprocal of one of the fractions and then multiply
			
			denominator *= flipN;
			
		return (Integer.toString(numerator))+"/"+Integer.toString(denominator);
	}
	

	public String toString() //method to give fractions in form of N/D
	{
		return (Integer.toString(numerator)+"/"+Integer.toString(denominator));
	}
}


