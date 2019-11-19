package palindrom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest1 {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Test setup for test suite");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("test cleanup after all the tests have executed");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Test setup after each test case");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test clean up after each test");
    }

    @Test
    public void isPalindromPositive() {
        palindrom test = new palindrom();
        assertTrue(test.isPal(12321));
    }
    
    @Test
    public void isPalindromeNegative() {
        palindrom test = new palindrom();
        assertFalse(test.isPal(1234));
    }
    
    @Test
    public void runExistingTestCase()
    {
        palindromTest palindromTest = new palindromTest();
        palindromTest.testIsPal();
    }

}
