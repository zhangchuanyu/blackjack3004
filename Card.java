package blackjack;

public class Card {
	private color colors;
	private values value;
	public Card(color colors, values value){
		this.value= value;
		this.colors=colors;
	}
	public String toString(){
		return this.colors.toString() + "-" + this.value.toString();
		}
	public values getvalue(){
		return this.value;
	}
}
