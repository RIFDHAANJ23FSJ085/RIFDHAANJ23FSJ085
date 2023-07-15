package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BonusRemainderTest {

	@Test
	void test() {
		BonusRemainder br=new BonusRemainder();
		int r=br.remainder(10, 5);
		assertEquals(0, r);
	}

}
