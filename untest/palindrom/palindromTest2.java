package palindrom;

import static org.junit.Assert.*;

import org.junit.Test;

public class palindromTest2 extends palindromTest {

	@Test
	public void test2() {
		palindrom test = new palindrom();
		for(int i=0;i<100;i++)
		assertFalse(test.isPal(i));
	}
}
