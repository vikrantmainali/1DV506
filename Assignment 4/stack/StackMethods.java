package vm222cv_assign4.stack;

import java.util.*;

public class StackMethods implements Stack
{
	private int size;
	private Object[] stack = new Object[6]; 
	//Object array called stack with size 6 since that's how many objects i'm pushing in StackMain
	
	
	public int size() //returns the size of the stack
	{	
		return size;
	}
	
	
	public boolean isEmpty() //check if stack is empty
	{
		if (size() == 0) //it is empty when the size is 0
		{
			return true;
		}
		else 
			
		return false;
	}

	
	public void push(Object element)  //adding elements to the top of the stack
	{
		for (int i = size; i <= stack.length-1; i++) //for loop going from first index to last index
		{
			stack[size] = element; 
		}
		size++;	// size increments each time you push an element
	}
	
	
 	public Object pop() //removing and returning the top element
	{
 		if (size() == 0) //if stack is empty then it throws an exception
		{
			throw new EmptyStackException();
		}
 		Object top = stack[size-1]; 
 		
 		size--; //size decrements each time you remove an element
 		
 		return top;
	}
 	
 	
 	public Object peek() //taking a look at the first element witout returning it
 	{
 		if (size() == 0) //throws exception when size is 0
		{
			throw new EmptyStackException();
		}
 		
 		else
 			
 		return stack[size-1];	
 	}
 	
 	
	public Iterator<Object> iterator() //iterator for the stack to traverse all the elements
	{				
		return new StackIterator(stack, stack.length-1); //returning a StackIterator as implemented below
	}
	

	public class StackIterator implements Iterator<Object> 
	{
		private int nextElements = 0;    // first element at start
		private final Object[] elementsArray; //Object array named 
		private final int lastElement;             // final element in array
			
		
		public StackIterator(Object[] objectArray, int maxIndex) //constructor for the StackIterator
		{
			elementsArray = objectArray;
			lastElement = maxIndex;
		}


		public boolean hasNext() //if there are elements to return
		{				
			return nextElements < lastElement;
		}

		
		public Object next() //traverses the elements of the stack (top being the first element)
		{	
			Object[] store = new Object[elementsArray.length]; 
			//array to store the values since we want it in reverse
			
			for (int i = 0; i <= elementsArray.length - 1; i++)
			{
			store[i] = elementsArray[elementsArray.length-i-1];
			}	
		
		return Arrays.toString(store); //returns the store array as a string
		}
	}

}