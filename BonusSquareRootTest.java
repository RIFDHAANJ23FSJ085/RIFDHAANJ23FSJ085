package assignment1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BonusSquareRootTest {

	@Test
	public void test() {
		BonusSquareRoot bs=new BonusSquareRoot();
		double s=bs.square(4);
		assertEquals(2.0, s);
	}
	@Test
	public void SquareRoottest() {
		BonusSquareRoot bs=new BonusSquareRoot();
		double ss=bs.square(16);
		assertEquals(4.0, ss);
	}

}
