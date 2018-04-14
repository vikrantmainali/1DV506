package vm222cv_assign3;

import java.util.ArrayList;
import java.util.Collections;

import vm222cv_assign3.Card.Rank;
import vm222cv_assign3.Card.Suite;

public class Deck
{
	
	public ArrayList<Card>deck; //creating an ArrayList of type card and name deck

	public Deck()	 //constructor for deck
	{	
		this.deck = new ArrayList<Card>();
		
		for (Suite suite : Suite.values()) //for each suite and values of suite
		{
			for (Rank rank : Rank.values()) //for each rank and values of rank
			{
				Card card = new Card(rank,suite); //card is made with rank and suite
			    
			    this.deck.add(card); //card gets added to deck
			}			    
		}	
	}

	
	public void shuffle() //method for shuffling the deck
	{
		Collections.shuffle(deck); //since we created an ArrayList, we can use Collections.shuffle
		
		
		if (deck.size()<52) //printing an error if deck is not full
		{
			System.out.println("Cannot shuffle, not a full deck");
		}
	}
	
	
	public ArrayList<Card> dealt; //an ArrayList for dealt cards
	public ArrayList<Card> storeDeck; //an ArrayList to store the cards in deck
	
	
	public void deal(int hands) //creating a method to deal the cards
	{
		this.dealt = new ArrayList<Card>(); 
		
		for (int i = 0; i <= hands-1; i++) //the amount of hands dealt
			 
			 this.dealt.add(deck.get(i)); //dealt cards are added to dealt
			 
			storeDeck = this.deck; //stores the rest of the cards in storeDeck ArrayList
			deck = this.dealt;	
			 
	}
	
	
	public int remainingCards() //method to find out the amount of remaining cards
	{
		
		return storeDeck.size()-dealt.size(); //storeDeck is the new deck therefore the size of this minus the size of the dealt list
	}
	

	public ArrayList<Card> print() //method to print the content of ArrayList type Card
	{
		return deck;
	}
	
	
	public boolean play123() //method to play123 game
	{
		int count = 1;
		
		for(int i = 0; i <= deck.size()-1; i++) //i going from index 0 to last index
		{
			if (deck.get(i).getRank() == Rank.Ace && count == 1) //if the card you get is an ace while count is 1
			{	
				return false; //then you loose
			}
			
			else if (deck.get(i).getRank() == Rank.Two && count == 2) //if the card you get is a two while count is 2
			{
				return false; //then you loose
			}
			
			else if (deck.get(i).getRank() == Rank.Three && count == 3) //if the card you get is a three while count is 3
			{
				return false; //then you loose
			}
			
			if (count == 3) //if the count goes to 3
			{
				count = 1; //reset it back to 1 again
			}
			
			else
			{
				count++; //otherwise, the count goes up
			}
			}
	
		return true; //if none of the conditions above are met then you win
	}
}