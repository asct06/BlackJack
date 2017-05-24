package ascSys.Trump;

public class Hand extends CardSet {

	Card card = new Card(null, null);

	public int getTotalScore() {
		int totalScore = 0;
		boolean changeA = true;

		for(Card card :super.getCards()){

			totalScore += card.getScore(changeA);
			if(card.getScore(changeA) == 11)changeA = false;
		}
		if(totalScore > 21){
			totalScore = 0;
			for(Card card :super.getCards()){

				totalScore += card.getScore(false);
			}

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
