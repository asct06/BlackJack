package ascSys.Trump;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> cards = new ArrayList<>();

	public void addCard(Card cards){
		this.cards.add(cards);
	}

	public Card pickUpCard(){
		return this.cards.remove(0);
	}
}
