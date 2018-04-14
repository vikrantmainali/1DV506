package vm222cv_assign2;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
		System.out.println("Give 10 integers to find out the second largest integer.\n");
		
		Scanner scan = new Scanner(System.in);
		
		int integer;
		int least = Integer.MIN_VALUE; //the integer can be anywhere from -2^31 
		int greatest = Integer.MAX_VALUE;// to 2^31 - 1
		int secondLargest = 0;
		
		for (int i = 1; i <= 10; i++){ //looping 10 times
			System.out.print("Enter integer number "+i+": ");
			integer = scan.nextInt();
				
			if (integer <= greatest) //if the integer you have  input is less than or equal to 2^ 31 - 1, then your integer becomes the greatest
				{
				greatest = integer;	
				}
						
			if (integer >= least) //if it is greater than or equal to -2^31, then the secondLargest integer is the least one and it is the value you have given
			{
				secondLargest = least;
				least = integer;
			}
			else if (integer > secondLargest) //if the integers are again greater than the secondLargest, then the secondLargest becomes that integer
			{
						
				secondLargest = integer;
			}
		 }
		
		 scan.close();
		
		 System.out.println("\n"+secondLargest+" is the second largest integer given.");  
	}
}



