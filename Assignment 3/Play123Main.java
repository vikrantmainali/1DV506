package vm222cv_assign3;

public class Play123Main {
	
	public static void main (String[] args)
	{

	Deck deck = new Deck();
		
	double winCount = 0;
	
	for (int i = 0; i<10000;i++) //looping from 0 to 10000 to get 10000 games 
	{		
		deck.shuffle(); //shuffling the deck 
		
		deck.play123(); //playing 123 game
				
		if(deck.play123() ==  true) //if you have won (explanation in the Deck class)
		{
			winCount++; //increase win count
		}
	}	
	double probability = (winCount/10000)*100; //calculating the probability of winning in percentage
	
	System.out.println("Probability when played 10000 times is " + probability + "%");
	}
}

