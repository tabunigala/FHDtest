package palindrom;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class palindromTestTest {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before PalindromTest1.class");
	}
	@AfterClass	
	public static void AfterClass(){
		System.out.println("After PalindromTest1.class");
	}
	@Before
	public  void initTest(){
	
	}	
	@Test
	public void test() {		
		palindrom test = new palindrom();
		assertTrue(test.isPal(1221));

	}

}
