package ascSys.Trump;

public class Deck extends CardSet {

	
	public static Deck createTrump() {
		
		Card card = new Card(null, null);
		Deck trump = new Deck();
		for(int i = 0 ; i < 52; i++){
			trump.addCard(card);
		}
		return trump;
	}

}
