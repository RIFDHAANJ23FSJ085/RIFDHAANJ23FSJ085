package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Addition add=new Addition();
		int a=add.addition(10, 20);
		assertEquals(30,a );
	}

}
