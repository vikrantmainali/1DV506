package vm222cv_assign2;

import java.util.Scanner;
import java.util.Random;

public class HighLow {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		int number = rand.nextInt(100)+1; //generates random integers from 1-100
		
		int guess = 0;
		int chances = 0;
		
		System.out.println("Guess a number between 1 and 100, you have 10 chances to guess. Good luck! \n");
		
		for (chances = 1; chances <= 10; chances++) //looping from 1st chance to the 10th and final
		{
			System.out.print("Enter guess number "+chances+": ");
			guess = scan.nextInt();
			
		if (guess == number) //if the input number is the same as the random generated number then it print the following and breaks the program
		{
			System.out.println("Correct answer, it took you "+chances+" tries!");
			break;
		}
		
		else if (guess>number) //if the input number is greater than the random generated number it prints a hint to guess lower
		{
			System.out.println("Clue: guess lower!\n");
		}
		
		else if (guess<number) //if the input number is greater than the random generated number it prints a hint to guess higher
		{
			System.out.println("Clue: guess higher!\n");
		}
		}
		
		while (chances > 10) //if you have guessed 10 times, it prints that you have no more chances left and breaks
		{
			System.out.println("Sorry, you have run out of chances to guess!");
			break;
		}
		scan.close();
}
}




		 
		 
		 
		

	

		
		
	



