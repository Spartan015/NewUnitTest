import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class arithmeticsTest {

	@Test
	void testSum() {
		//fail("Not yet implemented");
		arithmetics obj1=new arithmetics();
		int expected=7;
		int actual= obj1.sum(4, 3);
		assertEquals(expected, actual);
	}

	@Test
	void testMul() {
		//fail("Not yet implemented");
		arithmetics obj1=new arithmetics();
		int expected=12;
		int actual= obj1.mul(4, 3);
		assertEquals(expected, actual);
	}

	@Test
	void testDiv() {
		//fail("Not yet implemented");
		arithmetics obj1=new arithmetics();
		int expected=2;
		int actual= obj1.div(4, 2);
		assertEquals(expected, actual);
	}

}
