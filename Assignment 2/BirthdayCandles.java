package vm222cv_assign2;

public class BirthdayCandles {
	
	public static void main(String[] args) {


	int years = 0;
	int candles = 0;
	int boxes = 0;
	int totalBoxes = 0;	
	
	
	for (years = 1, boxes = 0; years <= 100; years++) //loop which increases the amount of years from 1-100 and the boxes from 0
	{
		if (candles >= years) //if the amount of candles is greater than the years then the candles is candles-year 1st birthday 24-1 candle, 2nd birthday 23-2 candles etc
		{
		candles = candles-years;
		}
		
		else{
			
		while (candles <= years) 
		{
		/*if the amount of candles is less than or equal to the years then the total boxes increases, 
		* you add 24 more candles and box number increases */
				
		totalBoxes++;
		candles = candles+24;
		boxes++;
		
		}
			
		candles = candles-years; 
			
		System.out.println("Before birthday "+years+", buy "+boxes+" box(es)\n");
		boxes = 0; //resets the boxes to 0 
		}
		}
		System.out.println("Candles remaining: "+candles+", Remaining candles: "+totalBoxes); 
		/*remaining candles after 100th birthday and then
		all the amount of all boxes summed together*/
}
}

