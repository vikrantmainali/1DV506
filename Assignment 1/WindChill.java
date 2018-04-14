package vm222cv_assign1;

import java.lang.Math; //this allows us to use Math.sqrt
import java.text.DecimalFormat; //used to limit decimal places
import java.util.Scanner;

public class WindChill {
	
	public static void main(String[] args) {	

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give temperature in °C: ");
		double temperature = scan.nextDouble();		//temperature value can have decimal places therefore it is a double
		
		System.out.print("Give wind speed in m/s: ");
		double windSpeed = scan.nextDouble();		//wind speed value can also have decimal places hence it is a double as well
		
		scan.close();
		
		double windChillTemp = 33+((temperature-33)*(0.474+0.454*Math.sqrt(windSpeed)-0.0454*windSpeed)); //formula to solving wind chill temperature
		DecimalFormat dc = new DecimalFormat("#.#");	//limiting decimal places
		dc.format(windChillTemp);
				 	
		System.out.print("Wind Chill Temperature: " +dc.format(windChillTemp));
	}
}

//Vikrant Mainali