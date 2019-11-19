package palindrom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class palindromecase2 {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Palindromcase2.class");
	}
	@AfterClass
	
	public static void AfterClass(){
		System.out.println("After PalindromCase2.class");
	}
	
	@Test
	public void testispal2()
	{
	palindrom test = new palindrom();
	assertTrue(test.isPal(1331));
	}

}
