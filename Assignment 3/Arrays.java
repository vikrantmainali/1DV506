package vm222cv_assign3;	

public class Arrays {
	
	public static void main (String[] args)
	{
	     int[] n = {3,4,5,6,7};
	     int[] s = {3,4,5};
	     int[] p = {3,5,7};
	     
	     System.out.println("Sum of the elements in the array: " + sum(n)); 
	     //printing the sum of the elements in the array using created method sum
	     System.out.println("Printing the elements inside the array: " + toString(n)); 
	     //printing elements of array using created method toString
	     System.out.println("Adding n integer to the elements inside the array: " + toString(addN(n,2))); 
	     //adding an integer to all elements using created method addN
	     System.out.println("Reverse order of elements inside array: " + toString(reverse(n))); 
	     //reverse of elements in array, toString is used because we made a new array
	     System.out.println("Check if array has an integer (a true example): " + hasN(n,5)); 
	     //checking if there  is integer 5 in array n using created method hasN
	     System.out.println("Check if array has an integer (a false example): " + hasN(n,1)); 
	     //checking if there is integer 1 in array n using created method hasN
	     System.out.println("Sorting in ascending order: " + toString(sort(n)));
	     //sorting in ascending order of elements in array n using created method sort, toString is used because we made a new array
	     System.out.println("Has subsequence (a true example): " + hasSubsequence(n,s));
	     //checking if subsequence s is a subsequence of array n
	     System.out.println("Has subsequence (a false example): " + hasSubsequence(n,p));
	     //checking if subsequence p is a subsequence of array n
	     replaceAll(n,5,2);    
	     //replacing all 5 in array n with 2, this method cannot be put into System.out.print because it is a void statement
	} 
	
	
	private static int sum(int[] arr) //method to sum elements of an array
	{
		int sum = 0; 
		int i;
		
		for(i = 0; i<=arr.length-1; i++) //for loop going from 0 (first index of array) to arr.length-1 (last index of array)
		{
		
		sum = sum + arr[i]; //goes through all indices of array arr and adds them up
		}
		
		return sum; //gives us the sum of the elements in the array
	}
	
	
	private static String toString(int[] arr) //method to print the elements of an array
	{
	StringBuffer toS = new StringBuffer(); //using StringBuffer class
	
		for (int i : arr)  //for each integer i in array
		{
			if (toS.length() > 0)  //if the length of the StringBuffer is greater than 0, then add a comma and a whitespace after it
				
				toS.append( ", " ); //this is just to make the printed elements look neat
			
			toS.append(i); //putting the elements of array
		}
	
		return toS.toString(); //returning StringBuffer as a string (this is a built in method for StringBuffer class)
	}
	
	
	private static int[] addN(int[] arr, int n) //adding n integer to array arr
	{
		int[] addedN = new int[arr.length]; //creating a new array since we don't want to change array arr
		
		for (int i = 0; i <= arr.length-1; i++) //for loop going through indices of array arr
		{
			addedN[i] = arr[i] + n; //each index of new array addedN is the same index of array arr plus n
		}
	
		return addedN; //returns the new array addedN
	}
	
	
	private static int[] reverse(int[] arr) //reversing the elements of array arr
	{
		int[] reversed = new int[arr.length]; //new array to store reversed elements since we don't want to change arrary arr
		
		int j = 0;
		
	    for (int i = arr.length-1; i >= 0; i--, j++) 
	    	/*for loop for indicies of initial array arr starting at the last index and going down to 0, 
	    	 while j is index of reversed array that increases*/
	    {
	        reversed[j] = arr[i];	 //reveversed[first index] = arr[last index], and so on
	        
	    }
	    return reversed; //returns the new reversed array
	}
	
	
	private static boolean hasN(int[] arr, int n) //method to check if array arr contains integer n
	{	
		
	    for(int i : arr) //for each integer i in array arr
	    
	    	if (i == n)    // if i is the same as the given integer to check
	    		return true;   //then return true
	        return false;  //otherwise return false
	}

	
	private static void replaceAll(int[] arr, int old, int nw) //method to replace an integer in arr with an a new integer
	{
		for(int i = 0; i <= arr.length - 1; i++) //for loop starting from 0 (first index) to arr.length-1 (last index)
		{
		
		while (arr[i] == old) //for any index of arr, if an "old" integer exists
		{	
			
			arr[i] = nw; //replace it with the new integer
			
			System.out.println("Replacement of an element in array with another: " + toString(arr)); 
			//this is just so that it gives a message since you cannot print a void statement on its own
		}
		}	
	}
	
	
	private static int[] sort(int[] arr)//method for sorting elements of array arr in ascending order
	{	
		int [] sortedArr = new int[arr.length];  //creating a new array to store the sorted elements since we don't want to change arr itself
		
			for(int j = 0; j < arr.length; j++)  //following bubble sorting where it checks through every element and then sorts it
	    	
	        for(int i = 0; i < arr.length-1; i++)
	        {    
	        
	        if(arr[i] >= arr[j]) 	            
	        {                     
	        sortedArr[0] = arr[i];
	        arr[i] = arr[j];                 
	        arr[j] = sortedArr[0];           
	        } 
	} 
	    
			
	    for(int p = 0; p < arr.length; p++) //another loop since the previous one only goes up to a certain amount for i and j
	    {        
	    	sortedArr[p] = arr[p];   
	    }
	    return sortedArr;         
	}
	


	private static boolean hasSubsequence(int[] arr, int[] sub) //method checking if an array has a subsequence
	{
	     
	for (int i=0;i<=arr.length-sub.length;i++)  //for loop starting from 0 to the difference in length of the array and subsequence array
	{
		for (int j=0; j<=i; j++) //getting the sequence of the array
		{
			if (arr[j]!=sub[j]) //if the sequence does not exist 
			{
				return false; //then return false

			}                         
		}     
	}     
		return true;     
	}
}



	
		
	
	    
	


	


