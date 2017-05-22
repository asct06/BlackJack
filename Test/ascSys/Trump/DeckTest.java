package ascSys.Trump;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void createTrumpメソッドを使用してtrumpを作りgetSizeメソッドで52枚あることを確認() {
		
		Deck trump = Deck.createTrump();
	
		
		int actual  = trump.getSize();
		int expected = 52;
		assertThat(actual,is(expected));
		
	}

}
