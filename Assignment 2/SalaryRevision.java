package vm222cv_assign2;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
import java.util.Scanner;

public class SalaryRevision {
	
public static void main(String[] args){

	Scanner scan = new Scanner(System.in);		
	ArrayList<Integer> salaries = new ArrayList<Integer>();   

	System.out.println("Provide salaries and terminate with 'X': ");
		do
		{ 
			salaries.add(scan.nextInt()); //the keyboard input gets added into the salaries ArrayList
		}
		
		while (scan.hasNextInt()); //keeps scanning until the input gives integers, any other input than integers will stop the scanner
				
		Collections.sort(salaries); // sorts the input salaries in ascending order i.e; least to greatest

		//average section -->
		
		double average = 0;
		int s = salaries.size();
		for (int i = 0; i < s; i++)
		{
			average += salaries.get(i); //takes the sum of all the input values in ArrayList salaries
		}
		System.out.println("\nAverage salary: "+Math.round(average)/s); //average is sum of all values divided by number of values
		
		//median section -->
		
		double median = 0;
		int i = salaries.size();		
		double median1 = salaries.get(i/2); //median1 is the median when there is an odd amount of inputs
		double median2 = salaries.get(i/2-1); //median2 is used for calculating when there is an even amount of inputs
		
		if(salaries.size()%2==0) //if the number of input is even
		{
		median = (median1+median2)/2; //this is the formula when input is even
		}
		
		else
			median = median1; //if input is not even (i.e; odd) then median is just median1 since that solves it for an odd amount of inputs
		
		System.out.println("Median salary: "+Math.round(median));
		
		//gap section -->
		
		int gap = 0;
		
		gap = salaries.get(salaries.size() - 1)-salaries.get(0); //takes the last index of the list (greatest input) and subtracts the 0th index (smallest input)
		
		System.out.println("Salary gap: "+gap);
		
		scan.close();
	}
}