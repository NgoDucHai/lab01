package ptb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class mainTest {
	ptb2 pt = new ptb2();
	@Test
	public void test1() {
		String result1 = pt.BienLuan(1.0, 2.0, 3.0);
		assertEquals("PT bac 2 vo nghiem", result1);
		
	}
	
	@Test
	public void test2() {
		String result1 = pt.BienLuan(3.0, 6.0, 3.0);
		assertEquals("PT co nghiem kep: -1.0", result1);
		
	}
	@Test
	public void test3() {
		String result1 = pt.BienLuan(1.0, -3.0, 2.0);
		assertEquals("PT co 2 nghiem: 2.0 ; 1.0", result1);
		
	}
	
	@Test
	public void test4() {
		String result1 = pt.BienLuan(0.0, 0.0, 0.0);
		assertEquals("PT vo so nghiem", result1);
		
	}
	
	@Test
	public void test5() {
		String result1 = pt.BienLuan(0.0, 1.0, 2.0);
		assertEquals("PT co 1 nghiem: -2.0", result1);
		
	}
	
	@Test
	public void test6() {
		String result1 = pt.BienLuan(0.0, 0.0, 2.0);
		assertEquals("PT vo nghiem", result1);
		
	}

}
