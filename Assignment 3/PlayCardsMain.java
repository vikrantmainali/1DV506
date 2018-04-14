package vm222cv_assign3;

public class PlayCardsMain {

	public static void main (String[] args)
	{
		Deck deck = new Deck(); //making a new deck
		
	//	System.out.println("Original deck: " + deck.print() + "\n");
		
		deck.shuffle();		
		
	//	System.out.println("Shuffled deck: " + deck.print() + "\n");
		
		deck.deal(7);
		
		System.out.println("Dealt cards: " + deck.print() + "\n"); //prints out the dealt cards
		
		
		System.out.println("Remaining cards: " + deck.remainingCards()); //prints out the remaining amount of cards
	}
}
