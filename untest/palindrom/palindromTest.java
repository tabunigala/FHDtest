package palindrom;

import static org.junit.Assert.*;

import org.junit.*;


public class palindromTest {
//Done
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before PalindromTestclass");
	}
	@AfterClass
	
	public static void AfterClass(){
		System.out.println("After PalindromTest.class");
	}
	@Before
	public  void initTest(){
	
	}	
	@Test
	public void testIsPal() {
		
		palindrom test = new palindrom();
		assertTrue(test.isPal(1221));
	}
	
        public void testNotPal() {
       palindrom test = new palindrom();
		for(int i=0;i<100;i++)
		assertFalse(test.isPal(i));
	}
}
