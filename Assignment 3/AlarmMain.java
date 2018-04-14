package vm222cv_assign3;

public class AlarmMain 
{
	public static void main (String[] args)
	{
		AlarmClock alarm = new AlarmClock(23,48); 
		/*the constructor AlarmClock has parameters for (int hours, int minutes), 
		  here i'm making a new alarm clock and setting the hours to 23 and minutes to 48*/
		
		alarm.displayTime(); //displaying the time on the alarm clock
		
		alarm.setAlarm(6, 15); //setting and alarm to wake at 6:15 (parameters in AlarmClock class is (int hours, int minutes)

		for (int i = 1; i <= 500; i++) //for loop going from 1 minute to 500
		{
		alarm.timeTick(); //making the clock tick for 500 minutes using the for loop
		}
		
		alarm.displayTime(); //displaying the time again
		
	}
}
