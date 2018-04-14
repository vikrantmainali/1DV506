package vm222cv_assign1;

import java.util.Scanner; 

public class Change {

public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
						
		System.out.print("Price of the product: ");
		double price = Math.round(scan.nextDouble()); //math.round allows rounding up, and scan.nextDouble allows for decimal place input scans
		
		System.out.print("Price paid: ");
		double payment = Math.round(scan.nextDouble()); 
		
		scan.close();
		
		if (payment < price){
			System.out.println("\nNot enough money"); /*using if to cover a situation where payment cannot be less than price since it would give
														negative value for change */
		}
		
		if (payment > price){ /*this is the situation we're interested in, if statement used because it wouldn't work without it since we used it 
								previously */
			
		double change = payment - price;
		System.out.println("\nChange :"+Math.round(change)); //defining the value for change 
			
		int thousand_Kr = (int) (Math.round(change)/1000);
		System.out.println("\n1000 kr bill(s): "+thousand_Kr); 
		
		int five_Hundred_Kr = (int) Math.round(change % 1000)/500;	/*using mod to work out the values, refer back to SumofThree for explanation
																		same principle applies here */
		System.out.println("500 kr bill(s): "+five_Hundred_Kr);
		
		int hundred_Kr = (int) Math.round(change % 500)/100;
		System.out.println("100 kr bill(s): "+hundred_Kr);
		
		int fifty_Kr = (int) Math.round(change % 100)/50;
		System.out.println("50 kr bill(s): "+fifty_Kr);
		
		int twenty_Kr = (int) Math.round(change % 50)/20;
		System.out.println("20 kr bill(s): "+twenty_Kr);
		
		int ten_Kr = (int) Math.round(change % 20)/10;
		System.out.println("10 kr coin(s): "+ten_Kr);
		
		int five_Kr = (int) Math.round(change % 10)/5;
		System.out.println("5 kr coin(s): "+five_Kr);
	
		int one_Kr = (int) Math.round(change % 5)/1;
		System.out.println("1 kr coin(s): "+one_Kr);
		}		
	}
}

//Vikrant Mainali