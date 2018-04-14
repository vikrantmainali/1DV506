package vm222cv_assign3;

public class MultiDisplay {

	  	private int displayCount; //the counter is an integer
	  	
	    private String displayMessage; //the message to be displayed is a string
	   
	    
	    public MultiDisplay() //creating constructor where display message is empty and display count is 0
	    {
	    	displayMessage = ""; displayCount = 0;
	    }
	    
	     
	    public void setDisplayMessage(String message) //method to set the display message of the MultiDisplay to a given string
	    {
	        displayMessage = message;
	    }
	   
	    
	    public void setDisplayCount(int newDisplayCount) //method to set the display count of the MultiDisplay to a given integer
	    {
	        displayCount = newDisplayCount;
	    }
	   
	    
	    public void display() 
	    //method to display the message, this one needs to be followed by a setDisplayMessage and setDisplayCount since it is initially and empty
	    {
	    	for (int i = 1; i <= displayCount; i++) //for loop to print the message at a given displayCount amount of times
	    	{
	    	System.out.println(displayMessage); //printing the displayMessage
	    	}
	    }
	    
	    
	    public void display(String newMessage, int newDisplayCount)
	    //method to display the message, you can insert the message and the displayAmount in here
	  
	    {
	        for(int i = 0; i < newDisplayCount; i++) //for loop to print the message at a given displayCount amount of times
	        {
	        System.out.println(newMessage); //prints the given message
	        }
	        displayMessage = newMessage; //sets the displayMessage as the new message (used for getDisplayMessage method)
	    }
	    
	 
		public String getDisplayMessage()//shows us which message is currently being displayed
		{
		return displayMessage; //since we said newMessage = displayMessage, it will always take the newMessage to getDisplayMessage
		}

}
