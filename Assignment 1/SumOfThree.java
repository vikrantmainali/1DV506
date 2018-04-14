package vm222cv_assign1;

import java.util.Scanner;

public class SumOfThree {
	

	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a three digit number: ");
		int digits = scan.nextInt(); 
		
		scan.close();
		
		int result = (Math.round(digits/100))+Math.round(digits % 100)/10+Math.round(digits % 10); 
		/*formula to calculate the sum of three digits, the first part Math.round(digits/100) allows the computer to get the very first value of the 
		 * given three digits since Math.round takes it to integer form. 
		 * The second part, Math.round(digits % 100)/10 allows the computer to get the 
		 * second value of the given digits since we're using % 100 which means the remainder left after diving by 100, diving this value by 10 give; 
		 * we're also taking the Math.round here so it round the number to an integer getting rid of the decimal place.
		 * us the value of the digit in tens' place. Finally, digits % 10 gives us the value of the last digit. 
		 */
														
		System.out.print("\nSum of digits: "+  result +"");
	}
}

//Vikrant Mainali