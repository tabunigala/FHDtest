package palindrom;

import static org.junit.Assert.*;

import org.junit.Test;

public class palindromTestTest {


	@Test
	public void testAfterClass() {
		System.out.println("Before PalindromTestTest.class");
	}

	@Test
	public void testInitTest() {
		System.out.println("Before PalindromTestTest.class");
	}

	@Test
	public void testTestIsPal() {
		palindrom test = new palindrom();
			for(int i=0;i<100;i++)
			assertFalse(test.isPal(i));
	}

}
