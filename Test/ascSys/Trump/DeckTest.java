package ascSys.Trump;

import static ascSys.Trump.Num.*;
import static ascSys.Trump.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	Deck sut;
	@Before
	public void setUp(){
	sut = Deck.createTrump();
	}
	@Test
	public void createTrumpメソッドを使用してtrumpを作りgetSizeメソッドで52枚あることを確認() {


		int actual  = sut.getSize();
		int expected = 52;
		assertThat(actual,is(expected));
	}

	@Test
	public void createTrumpメソッドを使用してtrumpを作りPickUpCardメソッドでスペードAを確認() {

		Card card = sut.pickUpCard();
		Suit actual = card.getSuit();
		Suit expected = SPADE;
		assertThat(actual,is(expected));

		Num actual2 = card.getNum();
		Num expected2 = A;
		assertThat(actual2,is(expected2));
	}

	@Test
	public void createTrumpメソッドを使用してtrumpを作りPickUpCardメソッドでハートAを確認() {

		sut.pickUpCard();
		Card card = sut.pickUpCard();

		Suit actual = card.getSuit();
		Suit expected = HEART;
		assertThat(actual,is(expected));

		Num actual2 = card.getNum();
		Num expected2 = A;
		assertThat(actual2,is(expected2));
	}
}
