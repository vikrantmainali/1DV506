package vm222cv_assign2;

import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder backwards = new StringBuilder();  //this allows us to use append or insert methods for strings

		
		System.out.print("Provide a line of text: ");
		String text = scan.nextLine();
				
		for (int i = text.length() - 1; i >= 0;i--) 
			/*loop for reading string backwards using the string indices
			text.length - 1 gives us the last index, i-- since we want it to be from last index to 0 */
		{
			
			backwards.append(text.charAt(i)); //appends the characters at indices of String text to StringBuilder backwards
		}
				
		System.out.println("Backwards: "+ backwards); 
		
		scan.close();
	}
}
