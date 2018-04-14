package vm222cv_assign1;

import java.util.Random; //allows us to generate random values

public class TelephoneNumber {

	public static void main(String[] args) {
		
		Random rand = new Random(); //setting rand as new Random(); so we do not have to keep typing it over and over again
		
		int areaCode = rand.nextInt(1000-100)+100; /*rand.nextInt allows us to randomise the next integers, (1000-100)+100 sets the limit
													of the area code to be of 3 digits*/
		
		int localCodeMin = 1; //local code cannot be 0 so we set the min value to be 1
		
		int localCodeMax = 10; //and the max value to be 10
		
		int localCode = rand.nextInt(localCodeMax - localCodeMin) + localCodeMin; //we limit the area code to be between 1 and 9 since its one value
		
		int otherDigits = 10000 + rand.nextInt(90000); //this generates random 5 digit numbers 
		
		System.out.println("Random number: "+"0"+areaCode+"-"+localCode+otherDigits); /*the +"0" is because the area code starts with a 0 and is followed
																						by 3 random numbers */
	}

}

//Vikrant Mainali