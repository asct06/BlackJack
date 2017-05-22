package ascSys.Trump;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CardSetTest {

	private Suit cards;

	@Test
	public void addCardメソッドで一枚カードを加えてpickupCardメソッドを使用して抜いたカードが同じか確認する() {

		CardSet sut = new CardSet();

		Card expected = new Card(this.cards, null);
		sut.addCard(expected);
		Card actual = sut.pickUpCard();

		assertThat(actual,is(expected) );

	}

}
