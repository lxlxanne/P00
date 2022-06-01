import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		Calculate cal = new Calculate();
	  
		int actual = cal.add (a, b);
		  
		int expected = 9999;
		  
		assertEquals(expected, actual);
		}
		
		@Test 
		public void testSubtract() {
			//arrange
			int a = 10;
			int b = 5;
			Calculate cal = new Calculate();
			
			//act
			int actual = cal.subtract(a, b);
			//assert
			int expected = 5;
			assertEquals (expected, actual);
		}
		@Test
		public void testMult() {
			//arrange 
			int a = 3;
			int b = 5;
			Calculate cal = new Calculate();
			//act
			int actual = cal.mult(a, b);
			//assert
			int expected = 15;
			assertEquals (expected, actual);
			
		}
		@Test
		public void testDiv() {
			//arrange 
			int a = 6;
			int b = 2;
			Calculate cal = new Calculate();
			//act
			int actual = cal.div(a, b);
			//assert
			int expected = 3;
			assertEquals (expected, actual);
		}
}
