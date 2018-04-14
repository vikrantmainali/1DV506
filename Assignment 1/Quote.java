package vm222cv_assign1;

import java.util.Scanner; //we have to import scanner since we're getting the users to type into the console

public class Quote {
	
public static void main(String[] args) {
	System.out.print("Write a line of text: ");
	
	Scanner scan = new Scanner(System.in);	
	
			String quote = scan.nextLine(); //asking the users to input something and the computer scans it
			
			scan.close();
			
			System.out.println("Quote: "+"\""+quote+"\""); /* \" is used to add the quotation marks since "" would behave as if it was a part of 
															the print command */
	}
}


//Vikrant Mainali