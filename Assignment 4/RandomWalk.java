package vm222cv_assign4;

import java.util.Random;

public class RandomWalk 
{
	private int x = 0; //starting position is set to (0,0)
	private int y = 0; //starting position is set to (0,0)
	private int maxSteps;
	private int stepsTaken;
	private int platformSize;
	private int steps;

	
	public RandomWalk(int max, int size) 
	//making a constructor for RandomWalk with the maximum steps and size of platform
	{ 
		maxSteps = max;
		platformSize = size;
	}
	

	public String toString()  //printing to string the total steps taken and position
	{ 
		return "Total steps: " + stepsTaken + " Position: " + "(" + x + "," + y + ")"; 
	}

	
	private void takeStep() 
	/*this is a helper method,
	 0 corresponds to one step right, one corresponds to one step left, two corresponds to one step up
	 and 3 corresponds to one step down*/
	{
		Random rand = new Random(); 
		
		steps = rand.nextInt(4);

		if (steps == 0) 
		{
			x++;
		}

		else if (steps == 1) 
		{
			x--;
		} 
		
		
		else if (steps == 2) 
		{
			y++;
		}
		

		else if (steps == 3)
		{
			y--;
		}
		
		stepsTaken++;
	}

	
	private boolean moreSteps() // method to check if the walker can take more steps
	{ 
		if (stepsTaken < maxSteps) 
		{
			return true;
		}
		else
		return false;
	}

	
	public boolean inBounds() // method to check if walker is inbounds (not out of platform)
	{
		if (x > platformSize || x < platformSize * - 1 || y > platformSize  || y < platformSize * -1)
		{
			return false;
		}
		else
			
		return true;
	}
	

	public void walk() //if there are more steps that can be taken, then the walker takes steps
	{ 
		while (moreSteps())
		{
			takeStep();
		}
	}
}
