package vm222cv_assign2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide a positive integer: ");
		
		int integers = scan.nextInt(); 
			
		scan.close();
			     	
		int zero = 0;
		int even = 0;
		int odd = 0;
			
		while (integers > 0)
		{
			int modulo = integers%10; //this helps us calculate through all the digits provided, and at the end the number is shortened as well
			
			if (modulo == 0) //if the integers%10 gives a result of 0 then this means the 0 counter increases
			{
				zero++;
			}
			
			else if (modulo%2==0) //if the (integers%10)/2 gives a result of 0 then the number is even since every even number is divisible by 2
			{
				even++; //increasing the count of even number if requirement is met
			}
			
			else //if its not zero or even, then the number must be odd therefore it the odd counter increases if non of the above conditions are met
			{
				odd++;
			}
		
			integers = integers/10; 
			/*divides the the given integer by 10 so that it shortens the number from the right hand side, 1000/10 = 100, 
			100/10 = 10, etc. since it is an int, the decimal place isn't rounded up or taken care of allowing us to check conditions for each digit
			starting from the right hand side */
		}
	
	    System.out.println("Number of zero's: "+zero);
	    System.out.println("Number of odd's: "+odd);
	    System.out.println("Number of even's: "+even);
	   	 
	}
}






	
	
	

