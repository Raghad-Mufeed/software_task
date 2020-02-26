package software_Task;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.ArithmeticException;

public class TestCalculatorTest {
	Calculator obj=new Calculator();
	@Before
	public void setUp() throws Exception {
	    obj=new Calculator();
	}
	@After
	public void tearDown() throws Exception {
	    obj =null;
	}
	@Test
	public void testAdd() {
		assertEquals(5,obj.add(3,2));
	}
	@Test
	public void testMultiplication() {
		assertEquals(6,obj.multiplication(3,2));	
	}
	@Test
	public void testDivision() {
		int i=1;
		assertTrue(i==obj.division(3,2));	
	}
	@Test(timeout=10)
	public void test() {
		int i=10000;
		int x=1;
		while (i!=0) {
			x=obj.multiplication(x, i);
			i--;
		}
	}
	@Test(expected=ArithmeticException.class)
	public void testt() {
		int y=obj.division(5,0);
	}


}
