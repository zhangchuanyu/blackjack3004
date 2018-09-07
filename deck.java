package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class deck {
	private ArrayList<Card> cards;
	
	public deck(){
		this.cards = new ArrayList<Card>();
	}
	public void createFullDeck(){
		for(color cardcolors:color.values()){
			for(values cardvalue:values.values()){
			this.cards.add(new Card(cardcolors,cardvalue));	
			}
		}
	}
	public void shuffle(){
		   //random.nextInt((max-min)+1)+min
		 }
	}
	public void removeCard(int i){
		this.cards.remove(i);
	}
	public Card getCard(int i){
		return this.cards.get(i);
	}
	public void addCard(Card addCard){
		this.cards.add(addCard);
	}
	public void draw(deck comingFrom){
		
	}
	public String toString(){
		String cardListOutput="";
		int i =0;
		for (Card aCard:this.cards){
			cardListOutput +="\n"+i+"-"+aCard.toString();
			i++;
		}
		return cardListOutput;
	}
}
