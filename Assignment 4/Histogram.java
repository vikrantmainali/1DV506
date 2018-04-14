package vm222cv_assign4;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Histogram 
{

	public static void main(String [] args)  
	{
		
		try
		{
		Random rand = new Random (); //calling random class so that we can create a file with random integers
				
		File outFile = new File("C:/Users/vikra/Desktop/java_courses/1DV506/src/vm222cv_assign4/output.txt");
		//This is the output file alone with the directory of where the file should be created
		
		PrintWriter printer = new PrintWriter (outFile);
		//using PrintWriter class allows us to 
		
		
		for (int i = 1; i<=200; i++)
		{
			printer.println(rand.nextInt(300)+1);
		}
	      
		printer.close();
		}
		
		catch (FileNotFoundException e) 
		//if something goes wrong while writing file, file not found exception is thrown
		{
			e.printStackTrace();
		}
		

		try 
		{ 	
		File file = new File("C:/Users/vikra/Desktop/java_courses/1DV506/src/vm222cv_assign4/output.txt");
		
		System.out.println("Reading file from: " + file + "\n");
		
		Scanner scan = new Scanner(file); //reading the file that we created with the intergers
		
		ArrayList<Integer> integers = new ArrayList<Integer>(); //creating an integer arraylist
		while(scan.hasNext())
		 {
		   integers.add(scan.nextInt()); //storing the integers inside the created arraylist
		 }
		 		 
		 int count = 0; //initializing the variables 
		 int otherCount = 0;
		 int histogramCount, i;
		 
		 for (i = 0; i<= integers.size()-1;i++)
		 {
		 if (integers.get(i)<=100) //if the number is between 1 and 100, the counter goes up
		 {
			 count++;
		 }	
		 else
		 {
			 otherCount++; //if its not between 1 and 100, then other counter increases
		 }
		 }
		 	
		System.out.println("Number of integers in the interval [1,100]: " +count+ "\n");
		System.out.println("Other integers: " +otherCount+ "\n");
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)<=10)  
		//if number is between 1 and 10, counter increases and based on counter, asterix is printed out
		{
			histogramCount++;
		}
		}
		System.out.print("1  - 10  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=11 && integers.get(i)<=20)
		//if number is between 11 and 20, counter increases and based on counter, asterix is printed out

		{
			histogramCount++;
		}
		}
		System.out.print("11 - 20  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }

		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=21 && integers.get(i)<=30)
		//if number is between 21 and 30, counter increases and based on counter, asterix is printed out

		{
			histogramCount++;
		}
		}
		System.out.print("21 - 30  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		//and so on...
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=31 && integers.get(i)<=40)
		{
			histogramCount++;
		}
		}
		System.out.print("31 - 40  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=41 && integers.get(i)<=50)
		{
			histogramCount++;
		}
		}
		System.out.print("41 - 50  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=51 && integers.get(i)<=60)
		{
			histogramCount++;
		}
		}
		System.out.print("51 - 60  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=61 && integers.get(i)<=70)
		{
			histogramCount++;
		}
		}
		System.out.print("61 - 70  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=71 && integers.get(i)<=80)
		{
			histogramCount++;
		}
		}
		System.out.print("71 - 80  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0,histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=81 && integers.get(i)<=90)
		{
			histogramCount++;
		}
		}
		System.out.print("81 - 90  | ");
		for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	    {
	        System.out.print("*");
	    }
		
		
		System.out.println("");
		
		
		for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
		{
		if (integers.get(i)>=91 && integers.get(i)<=100)
		{
			histogramCount++;
		}
		}
		System.out.print("91 - 100 | ");
        for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
        {
            System.out.print("*");
        }
		
        scan. close ();
		} 
		
		
		catch (FileNotFoundException e) 
		//if no file is found to read from, a filenotfoundexception is thrown
		{
		e. printStackTrace ();
		}	
	}
}
