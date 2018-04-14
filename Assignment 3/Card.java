package vm222cv_assign3;

public class Card 
{

	public enum Suite  //making an enum for suites in a card deck
	{
		Clubs, 
		Diamonds, 
		Hearts, 
		Spades;
	}
	
	public enum Rank //making an enum for ranks in a card deck
	{
		Ace(1),
		Two(2),
		Three(3),
		Four(4),
		Five(5),
		Six(6),
		Seven(7),
		Eight(8),
		Nine(9),
		Ten(10),
		Jack(11),
		Queen(12),
		King(13);
		
		public int rank; 

		Rank (int r) //creating a constructor for Rank
		{
			this.rank = r;
		}
	}

	
	private Rank rank;
	private Suite suite;
		
		
	public Card (Rank rank, Suite suite) //creating a constructor for card with rank and suite parameters
	{
		this.rank = rank;
		this.suite = suite;
	}
		
	
	public Rank getRank() //creating a method to get rank value
	{
		return this.rank;
	}
		
	public String toString() //creating a method to return rank and suite
	{
		return rank+" of "+suite;
	}
}





