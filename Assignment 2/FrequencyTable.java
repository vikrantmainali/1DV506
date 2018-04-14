package vm222cv_assign2;

import java.util.Random;

public class FrequencyTable {
	
	public static void main(String[] args){
	
		   Random rand = new Random(); 
		   
		   int[] array = new int[6]; //size of the int array is 6
		   		  
		   for (int roll = 1; roll <= 10; roll++) //looping for the rolls starting from 1 up to 6000
		   {
			   array[rand.nextInt(6)]++; //the random integers are added after each roll in array index 0-5
		   }
		   
		  System.out.println("Frequencies when rolling a dice 6000 times.\n"); 		  
		  
		   for (int face = 0; face < array.length; face++){ //loops the frequency of each face from 0-5 and prints out the value stored for each face
			   System.out.println((face+1)+": "+array[face]);	  
		   }
	} 	
}
