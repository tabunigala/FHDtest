package palindrom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class palindromTest1 extends TestCase {

		@BeforeClass
		public static void beforeClass(){
			System.out.println("Before PalindromTest.class");
		}
		@AfterClass
		
		public static void AfterClass(){
			System.out.println("After PalindromTest.class");
		}
		@Before
		public  void initTest(){
		
		}	

		public void testIsPal() {
			
			palindrom test = new palindrom();
			assertTrue(test.isPal(1221));
			for(int i=0;i<100;i++)
			assertFalse(test.isPal(i));
		}

}
