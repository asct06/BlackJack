package ascSys.Trump;

import static ascSys.Trump.Num.*;
import static ascSys.Trump.Suit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

	Hand sut = new Hand();


	@Test
	public void Handクラスに3と7を加えてgetTotalScoreメソッドで10が返ってくるテスト() {

		sut.addCard(new Card(DIA,N3));
		sut.addCard(new Card(DIA,N7));

		int actual = sut.getTotalScore();
		int expected = 10;
		assertThat(actual,is(expected));
	}

	@Test
	public void Handクラスに裏向きのカードを加えてtoStringメソッドで米米が返ってくるテスト() {

		sut.addCard(new Card(DIA,N3));
		sut.addCard(new Card(DIA,N7));

		String actual = sut.toString();
		String expected = "*_**_*";
		assertThat(actual,is(expected));
	}

	@Test
	public void HandクラスにJとKを加えてgetTotalScoreメソッドで20が返ってくるテスト() {

		sut.addCard(new Card(DIA,J));
		sut.addCard(new Card(DIA,K));

		int actual = sut.getTotalScore();
		int expected = 20;
		assertThat(actual,is(expected));
	}

	@Test
	public void HandクラスにAとKを加えてgetTotalScoreメソッドで21が返ってくるテスト() {

		sut.addCard(new Card(DIA,A));
		sut.addCard(new Card(DIA,K));

		int actual = sut.getTotalScore();
		int expected = 21;
		assertThat(actual,is(expected));
	}

	@Test
	public void HandクラスにJとKとAを加えてgetTotalScoreメソッドで21が返ってくるテスト() {

		sut.addCard(new Card(DIA,J));
		sut.addCard(new Card(DIA,K));
		sut.addCard(new Card(DIA,A));

		int actual = sut.getTotalScore();
		int expected = 21;
		assertThat(actual,is(expected));
	}

	@Test
	public void HandクラスにAとAを加えてgetTotalScoreメソッドで12が返ってくるテスト() {

		sut.addCard(new Card(DIA,A));
		sut.addCard(new Card(DIA,A));

		int actual = sut.getTotalScore();
		int expected = 12;
		assertThat(actual,is(expected));
	}


}
