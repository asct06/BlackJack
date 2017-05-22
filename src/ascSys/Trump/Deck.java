package ascSys.Trump;

import java.util.Collections;

public class Deck extends CardSet {
	private Deck(){
	}
	private static Deck trump = new Deck();
	public static Deck createTrump() {
		trump = new Deck();
		for(Num num:Num.values()){
			for(Suit suit:Suit.values()){
				Card card = new Card(suit, num);
				trump.addCard(card);
			}
		}
		return trump;
	}

	public void shuffle(){
		Collections.shuffle(trump.getCards());
	}


}
