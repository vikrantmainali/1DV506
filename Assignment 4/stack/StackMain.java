package vm222cv_assign4.stack;

import java.util.Iterator;

public class StackMain 
{
	
	public static void main (String[] args)
	{
		
		Stack stack = new StackMethods();
		Iterator<Object> itr = stack.iterator();
		
		System.out.println("Checking if stack is empty before filling it with elements: " + stack.isEmpty());
		System.out.println("\nChecking size of stack before adding elements: " + stack.size());
		
	//	System.out.println("\nTaking the look at the first element of empty stack: " + stack.peek());
	//  The above method is used to check the exception when stack is empty
			
	//	System.out.println("\nRemoving the first element and returning it (of empty stack): " + stack.pop());
	//  The above method is used to check the exception when stack is empty	
		
	//	The operations below is to add elements to the stack

		stack.push("A"); 
		stack.push(1);
		stack.push("B");
		stack.push(2);
		stack.push("C");
		stack.push(3);
		
	// Iterator traverses all the elements of the stack starting from the top
	
		if (itr.hasNext())
		{
		Object n = itr.next();
		
		System.out.println("\nChecking iterator for the stack: " + n);
		}
		
		// The explanation for the sysout's below are printed within the sysout
		
		System.out.println("\nChecking if stack is empty after filling it with elements: " + stack.isEmpty());		
		System.out.println("\nChecking size of stack after adding elements: " + stack.size());
		System.out.println("\nTaking a look at the first element (of filled stack): " + stack.peek());
		System.out.println("\nRemoving the first element and returning it (of filled stack): " + stack.pop());
		System.out.println("\nTaking a look at the new first element after removing the previous one: " + stack.peek());
		
	}

}
