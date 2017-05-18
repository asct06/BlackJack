package ascSys.Trump;

public class Card {
	private Suit suit;
	private Num  num;
	private boolean upside;

	public Card (Suit suit, Num num){
		super();
		this.suit	=suit;
		this.num	=num;
		this.upside =false;
	}


	public Suit getSuit() {
		return suit;
	}
	public Num getNum() {
		return num;
	}

	public boolean getUpSide() {
		return upside;
	}

	public void turnUpSide() {
		this.upside = !(this.upside);
	}
	@Override
	public String toString(){
		return this.suit.toString() +"_"+this.num.toString();
	}

}
