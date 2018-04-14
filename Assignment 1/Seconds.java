package vm222cv_assign1;

import java.util.Scanner;

public class Seconds {


	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hours: ");
		int hours = scan.nextInt(); //we're letting the computer scan the next integer since we're dealing with whole numbers here
		
		System.out.print("Minutes: ");
		int minutes = scan.nextInt();	
		
		System.out.print("Seconds: ");			
		int second = scan.nextInt();
		
		scan.close();
		
		int result = hours*3600 + minutes*60 + second; //making a formula converting hours to seconds, minutes to seconds and seconds to seconds
		
		System.out.print("Total time measured in seconds: "+ result);
		
	}
}
	
//Vikrant Mainali
