package ascSys.Trump;

public class Hand extends CardSet {

	Card card = new Card(null, null);

	public int getTotalScore() {
		int totalScore = 0;

		for(Card card :super.getCards()){
			totalScore += card.getScore(true);
		}

		return totalScore;
	}

	@Override
	public String toString(){
		StringBuilder cardsName = new StringBuilder();

		for(Card card :super.getCards()){
			cardsName.append( card.toString());
		}

		return cardsName.toString();
	}

}
