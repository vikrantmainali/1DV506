package vm222cv_assign2;

import java.util.Scanner;

public class Palindrome {

public static void main (String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	String og;
	String palindrome = "";
	int i;
	
	System.out.println("Enter a word or a sentence to check if it is a palindrome: \n");
	og = scan.nextLine();
	
	og = og.replaceAll("[^a-zA-Z]","").toLowerCase(); //replaceAll("[^a-zA-Z]","") replaces all non-alphabet and toLowerCase takes everything to lower case
	
	for (i = og.length() - 1; i >= 0; i--) //og.length() - 1 allows us to get the last index of the string
	{
	palindrome = palindrome+og.charAt(i);
	}
	
	if (og.equals(palindrome)) //comparing the two string using .equals
	{	
		System.out.println("\nEntered string is a palindrome.");
	}
	else
		System.out.println("\nEntered string is not a palindrome.");	
	
	scan.close();
	
	}
}