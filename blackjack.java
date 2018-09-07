package blackjack;


public class blackjack {

	public static void main(String[] args) {
		System.out.println("welcome to blackjack!");
		
		deck playingDeck= new deck();
		playingDeck.createFullDeck();
		
		//System.out.println(playingDeck);
	}
}
