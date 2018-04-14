package vm222cv_assign1;

import java.util.Scanner;


public class BMI {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give your length in metres: ");
		double length = scan.nextDouble();      //use double here because length is in metres meaning that it has decimal places
		
		System.out.print("Give your weight in kilograms: ");
		double weight = scan.nextDouble();		//use double here because weight can also have decimal places
		
		scan.close();
		
		double bmi = weight/(length*length);
		
		System.out.print("Your BMI is: "+ Math.round(bmi));  /*Math.round is used here to get the bmi value to an integer rather than leaving it
																as a double */
	}
}

//Vikrant Mainali