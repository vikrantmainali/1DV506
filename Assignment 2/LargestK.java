package vm222cv_assign2;

import java.util.Scanner;

public class LargestK {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give a positive integer: ");	
		int positive = scan.nextInt(); 
				
		scan.close();
	
		int k,valueOfK = 0;
	
		for (k = 0; k < positive; k+=2) //loops k starting from 0 but less than the input number and adds 2 every time (0,2,4,6,etc)
		{
			valueOfK = valueOfK+k; //the valueOfK adds the k such that you get 0+2+4+6... <--(for example 0+2+4+6 is when k = 6 and valueOfK is 12)
		
		if (valueOfK > positive){ //valueOfK cannot be greater than input since we are looking for k such that it is less than the input therefore we use k=k-2
			k-=2;
			System.out.println("\nThe largest K such that 0+2+4+6+...+K < "+positive+"  \nK = "+k);	
			break;
		}
		}
	}					
}		

