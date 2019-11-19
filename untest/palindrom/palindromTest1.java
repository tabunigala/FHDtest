package palindrom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class palindromTest1 {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before PalindromTest.class1");
	}
	@AfterClass
	
	public static void AfterClass(){
		System.out.println("After PalindromTest.class1");
	}

	
	@Test
	public void testisnotPal()
	{
		palindrom test = new palindrom();
		for(int i=0;i<100;i++)
		assertFalse(test.isPal(i));
	}
}
