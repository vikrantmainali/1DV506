package vm222cv_assign3;

public class Point {

	private int x;
	private int y;
	
	public Point(){ //Empty constructor for Point where x = 0 and y = 0
		x = 0;
		y = 0;
	}
	
	
	public Point(int x2, int y2) //Constructor for point with parameters for x and y
	{
		x = x2;
		y = y2;
	}


	public boolean isEqualTo(Point test) //method checking if two points are equal
	{
		if ((this.x == test.x) && (this.y == test.y)) //if initial x is equal to the given x, and if initial y is equal to the given y
		{
			return true; //if above conditions are met then return true
		}	
		else
			return false; //otherwise return false
	}
	
	
	public double distanceTo(Point test) //method to find the distance between two points using distance formula
	{
	double distance = Math.sqrt((Math.pow(test.x-x, 2))+(Math.pow(test.y-y, 2))); //distance formula being applied
	
	return distance;
	}
	
	
	public void move(int toX, int toY) //method to move one point to another
	{
		x += toX;
		y += toY;
	}
	
	
	public void moveToXY(int toX, int toY)//method to change one point to another
	{
		x = toX;
		y = toY;
	}
	
	
	public String toString() //method to print the point in form of (x,y)
	{
		return ("("+Integer.toString(x)+","+Integer.toString(y)+")");
	}
	
}