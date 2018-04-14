package vm222cv_assign1;

import java.util.Scanner;

public class Time {
	

	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Number of seconds: ");
		int seconds = scan.nextInt();
		
		scan.close();
		
		int result1 = seconds/3600;  //there are 3600 seconds in an hour 
		int result2 = (seconds % 3600)/60; //the % 3600 allows us to get the rest of the value of seconds, and there are 60 seconds in a minute
		int result3 = seconds % 60;		//this takes the rest of the value of int seconds and then gives it to us as seconds 
		
		
		System.out.println("\nThis corresponds to: ");
		System.out.println(result1+" hours, "+result2+" minutes and "+result3+" seconds ");
	
	}	

}

//Vikrant Mainali