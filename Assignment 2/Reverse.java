package vm222cv_assign2;

public class Reverse {

	public static void main(String[] args) {
	
	char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };	//array consisting of these characters)
					
	System.out.println(text); //printing the content of the array itself
	System.out.println("");
	
	
	int i = 0; 
	int j = text.length - 1; //last index of the text array
	int k = 7; //this is the point where the array stays the same after elements are swapped
	char temp; //temp char to store elements of the text array
	
	
	while(j >= i) 
	{
		temp = text[j]; //storing the last index of the text array (T) as temp
		text[j] = text[i]; //the T now swaps places with the !, last index with the first index
		text[i] = temp; //storing the new last index ! as temp
		j--; //this keeps decreasing the j value 13,12,10,9,etc
		i++; //increases the i value, 0,1,2,3, etc

		System.out.print(temp);	 //printing out the temp char after its gone through the indices up to 7
			
		if(j<i) //now if the index is less than the i value (since i value isnt specified a range it can keep on going)
		{
		for (k = 7; k <= text.length-1; k++) // looping from 7 (mid point) is less than or equal to the last index (13), to print the remaining characters
		{	
			System.out.print(text[k]);

		}
		}
	}
}
}



