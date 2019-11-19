package palindrom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Palin_test_1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before PalindromTest.class1");
	}
	@AfterClass
	
	public static void AfterClass(){
		System.out.println("After PalindromTest.class1");		
	}
	
	public void testIsPal() {
		
		palindrom test = new palindrom();
		assertTrue(test.isPal(1221));
		for(int i=0;i<10;i++)
		assertFalse(test.isPal(i));
	}

}
