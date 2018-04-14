package vm222cv_assign4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrunkenWalk 
{	

	public static void main(String[] args) 
	{
		int maxSteps;
		int platformSize; 
		int totalDrunks;
		int fallenPerson = 0;

		Scanner scan = new Scanner(System.in); //scanner for users to give size of platform, steps and amount of people walking

		System.out.println("Enter size of platform: ");
		platformSize = scan.nextInt();

		System.out.println("Enter maximum steps: ");
		maxSteps = scan.nextInt();

		System.out.println("Enter total amount of people that are walking: ");
		totalDrunks = scan.nextInt();

		scan.close();
		

		for (int i = 1; i <= totalDrunks; i++) //for loop since we can only have one drunk person at a time
		{
		RandomWalk drunk = new RandomWalk(maxSteps, platformSize);

		drunk.walk(); //drunk can only walk if he has moreSteps()
		
		if (drunk.inBounds() != true) //if the drunk is not inBounds
			{ 
				fallenPerson++; //then he falls and fallenPerson counter goes up
			}
		drunk = new RandomWalk(maxSteps, platformSize); //resetting the drunk for another drunk 
		}
		
		System.out.println("\nDrunk people that fall: " + fallenPerson);
		
		double percent = (double) 100*fallenPerson/totalDrunks;  //making a percentage of all people that fell
		
		DecimalFormat dc = new DecimalFormat("#.##"); //rounding to two decimal places

		System.out.println("\nOut of " + totalDrunks + " drunk people, "+ dc.format(percent) + "% "
				+ "fell in the water.");

	}
}
