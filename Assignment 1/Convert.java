package vm222cv_assign1;


import java.util.Scanner;
import java.text.DecimalFormat;

public class Convert {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter temperature in Farhenheit: ");
		
		double temperature = scan.nextDouble(); //used double since temperature can be in decimal places
		
		scan.close();
		
		double celcius = ((temperature - 32)*5)/9;	//formula to convert Farhenheit to Celcius and this can also result in a double
		
		DecimalFormat dc = new DecimalFormat("#.#");	/*DecimalFormat makes it so that you can set the decimal values to the place you want it to
															in this case it is one decimal place, # denotes the int and .# denotes 1 decimal place */
		
		dc.format(celcius);								//this is telling the program to use the new decimal place for the defined celcius
		
		System.out.println("Temperature in Celcius: " + dc.format(celcius));

	}

}

//Vikrant Mainali