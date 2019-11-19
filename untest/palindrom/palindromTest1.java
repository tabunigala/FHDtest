package palindrom;

import static org.junit.Assert.*;

import org.junit.*;


public class palindromTest1 {

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
	public void testIsPal() {
		
		palindrom test = new palindrom();
		//assertTrue(test.isPal(1221));
		for(int i=0;i<59;i++)
		assertFalse(test.isPal(i));
	}
}
