package vm222cv_assign1;

import java.util.Scanner;

public class ShortName { 
	
		public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String string1 = scan.next();
		char first = string1.charAt(0);
		
		System.out.print("Last Name: ");
		String string2 = scan.next();
		
		scan.close();
	
		if (string2.length() <= 1){
			System.out.println("Short name: "+first+". "+string2.substring(0,1)); 
			/* the first if statement is the case where the last name (string2) is less than 4 characters, in this case 1.
			 if statement allow us to limit the computer to break the steps down.*/
			}
		else if (string2.length() <= 2){
			System.out.println("Short name: "+first+". "+string2.substring(0,2));
			/* if statement like the previous one only executes until it finds the right conditions where as using else if. if the first if fails
			 it runs this one and if the conditions of last name being 2 characters or less. */
			}
		
		else if (string2.length() <= 3){
			System.out.print("Short name: "+first+". "+string2.substring(0,3));
			/* this is also the same as before except the case here is last name of 3 or less characters */
			}
			
		else 
			System.out.print("Short name: "+first+". "+string2.substring(0,4));
		/* the final else only executes if every other if/else if statement before comes back as false, this is the condition
		 	for last names with 4 or more characters */
	}
}

//Vikrant Mainali



