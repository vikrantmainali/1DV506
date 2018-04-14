package vm222cv_assign2;

import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Provide a line of text: ");
	
	String lineOfText = scan.nextLine();
	
	scan.close();
	
	String letter = "a";
	String letter2 = "A";
     
    int noOf_a = 0;
    int noOf_A= 0;
    
    char a;
    char A;
    char ch;


    for (int i = 0; i < lineOfText.length(); i++) //i loops from 0 to the length of the string
    {
    	
        a = letter.charAt(0); //since we have already said letter is "a", gives us a
        A = letter2.charAt(0);//since we have already said letter2 is "A", gives us A
        ch = lineOfText.charAt(i);//ch gives us the characters of input string at each index
        
        if (a == ch) //if a is the letter at a particular index then the noOf_a increases
        {
           noOf_a++;
        }  
    
       if (A == ch)//if A is the letter at a particular index then the noOf_A increases
       	{
    	   noOf_A++;
        }  
    }
    
    System.out.println("Number of a's: "+noOf_a);
    System.out.println("Number of A's: "+noOf_A);
    
    }
}
	


