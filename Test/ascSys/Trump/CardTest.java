package ascSys.Trump;

import static ascSys.Trump.Num.*;
import static ascSys.Trump.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	Card sut = new Card(SPADE,N8);

	@Test
	public void getSuitメソッドでSPSDEが返ってくる() {

		Suit actual = sut.getSuit();
		Suit expected = SPADE;
		assertThat(actual, is(expected));
	}

	@Test
	public void getNumメソッドでN8が返ってくる() {

		Num actual = sut.getNum();
		Num expected = N8;
		assertThat(actual, is(expected));
	}

	@Test
	public void カードの初期値が裏であることを確認する() {

		boolean actual = sut.getUpSide();
		boolean expected = false;
		assertThat(actual, is(expected));
	}

	@Test
	public void turnUpSideメソッドでカードを表にしてgetUpSideメソッドでtrueが返ってくる() {

		sut.turnUpSide();
		boolean actual = sut.getUpSide();
		boolean expected = true;
		assertThat(actual, is(expected));
	}

	@Test
	public void CardクラスでupSideが裏の時にtoStringメソッドで米米が返ってくる(){

		String actual = sut.toString();
		String expected = "*_*";
		assertThat(actual,is(expected));

	}

	@Test
	public void getScoreメソッドで8が返ってくる() {

		int actual = sut.getScore();
		int expected = 8;
		assertThat(actual, is(expected));
	}


}
