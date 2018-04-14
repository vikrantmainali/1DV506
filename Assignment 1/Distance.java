package vm222cv_assign1;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value of co-ordinate 1 in form of x,y: ");
		String coordinate1 = scan.next();	
		String[] c1 = coordinate1.split(","); // .split allows the string to be split after a given value, in this case comma

		System.out.print("\nEnter value of co-ordinate 2 in form of x,y: ");
		String coordinate2 = scan.next();		
		String[] c2 = coordinate2.split(",");
		
		scan.close();
		
		double x1 = Double.parseDouble(c1[0]);	// Double.parseDouble allows the string to be changed into a double which we need in order to calculate
		double y1 = Double.parseDouble(c1[1]);
		double x2 = Double.parseDouble(c2[0]);
		double y2 = Double.parseDouble(c2[1]);
		
		double distance = Math.sqrt((Math.pow((x1-x2),2) + Math.pow(y1-y2,2))); //distance formula, Math.pow(a,b) takes a to the power of b 
		
		DecimalFormat dc = new DecimalFormat("#.###"); //setting limit on decimal places to 3
		dc.format(distance);
		
		System.out.println("\nDistance :"+dc.format(distance));
	}
}

//Vikrant Mainali