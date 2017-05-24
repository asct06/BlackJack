package ascSys.Trump;

import static ascSys.Trump.Num.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumTest {



	@Test
	public void NumクラスのN2からgetScorebooleancahgeAメソッドで2が返ってくる(){

		Num num = N2;

		int actual	 = num.getScore(true);
		int expected = 2;
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスのJからgetScorebooleancahgeAメソッドで10が返ってくる(){

		Num num = J;

		int actual	 = num.getScore(false);
		int expected = 10;
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスのAからgetScorebooleancahgeAメソッドでtrueのとき11が返ってくる(){

		Num num = A;

		int actual	 = num.getScore(true);
		int expected = 11;
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスのAからgetScorebooleancahgeAメソッドfalseのとき1が返ってくる(){

		Num num = A;

		int actual	 = num.getScore(false);
		int expected = 1;
		assertThat(actual, is(expected));
	}
}
