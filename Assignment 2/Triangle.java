	package vm222cv_assign2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int oddInt;
		int noOfLines;
		int spacing;
		int asterisk;
		
		System.out.print("Enter a positive odd integer: ");
		oddInt = scan.nextInt();
		
		scan.close();
		
		if (oddInt % 2 == 0) //since even numbers aren't allowed, and even numbers are divisible by 2, prints out error cause we want odd integers only
		{
			System.out.println("\nError: Number entered is not an odd integer!");
		}
	
		else
		{	
		System.out.println("\nRight-Angled Triangle: \n"); //for right-angled triangle

		    for (noOfLines = 1; noOfLines <= oddInt; noOfLines++) //loop for number of lines to be printed
		    {

		        for (spacing = 0; spacing < (oddInt-noOfLines); spacing++) //loop for spacing before the asterisk
		        {
		            System.out.print(" ");
		        }

		        for (asterisk = 1; asterisk <= noOfLines; asterisk++) //loop for printing out the asterisk
		        {
		            System.out.print("*");
		       
		        }

		        System.out.println(""); //print out on lines
		    }

		    System.out.println("\nIsosceles Triangle: \n"); //for isosceles triangle
		    	
		    for (noOfLines = 1; noOfLines <= oddInt; noOfLines+=2) //here its +=2 because we are skipping the even number of lines. example: 1,3,5 etc
		    {

		        for (spacing = 0; spacing < (oddInt-noOfLines); spacing++) //loop for adding spacing before asterisk
		        {
		            System.out.print(" ");
		        }

		        for (asterisk = 1; asterisk <= noOfLines; asterisk++) //loop for printing asterisk
		        { 
		            System.out.print(" *");
		        }
		        
		        System.out.println(""); //print out on lines
		    }
		}
  }
}

	