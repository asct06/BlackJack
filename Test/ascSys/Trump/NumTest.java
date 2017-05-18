package ascSys.Trump;

import static ascSys.Trump.Num.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumTest {

	@Test
	public void NumクラスのN2からgetScoreメソッドで2が返ってくる(){

		Num num = N2;

		int actual	 = num.getScore();
		int expected = 2;
		assertThat(actual, is(expected));
	}
	
	@Test
	public void NumクラスのJからgetScoreメソッドで10が返ってくる(){

		Num num = J;

		int actual	 = num.getScore();
		int expected = 2;
		assertThat(actual, is(expected));
	}


}
