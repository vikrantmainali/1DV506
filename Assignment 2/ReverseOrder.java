package vm222cv_assign2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrder {

	public static void main(String[] args) {

		ArrayList<Integer> list =  new ArrayList<Integer>(); //using an ArrayList allows us to store the integers provided in a list
	 
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int max = 0;
		
		System.out.print("Enter positive integers. End by giving a negative integer.\n\n");
		
		while (true)
		{
			System.out.print("Provide integer "+(i)+" : ");
			max = scan.nextInt();
			
			if(max<0) //if you input a number less than 0, the scanner stops
			{
				break;
			}
			
			list.add(max); //adding the keyboard inputs into the list
			i++; //just used to print the integer number
			}

	 		Collections.reverse(list); //reverses the given list	        
	     
	     System.out.println("\n"+list);
	     
		scan.close();
	}
}

