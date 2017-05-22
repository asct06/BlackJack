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

	@Test
	public void addCardメソッドで2枚カードを加えてgetSizeメソッドを用いて２が返ってくるテスト() {

		CardSet sut = new CardSet();

		Card card = new Card(this.cards, null);
		sut.addCard(card);
		sut.addCard(card);
		int  actual = sut.getSize();
		int  expected = 2;

		assertThat(actual,is(expected) );
	}

	@Test
	public void addCardメソッドで5枚カードを加えてpickupCardメソッドを使用して2枚カードを抜いてgetCardメソッドを使用して３が返ってくる() {

		CardSet sut = new CardSet();

		Card card = new Card(this.cards, null);
		for(int i = 0 ; i < 5; i++){
			sut.addCard(card);
		}
		sut.pickUpCard();
		sut.pickUpCard();
		int  actual = sut.getSize();
		int  expected = 3;

		assertThat(actual,is(expected) );
	}
}