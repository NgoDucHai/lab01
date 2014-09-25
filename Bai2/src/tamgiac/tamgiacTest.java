package tamgiac;

import static org.junit.Assert.*;

import org.junit.*;

public class tamgiacTest {

	@Test
	public void test() throws Exception {
		tamgiac t = new tamgiac(1,2,3);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}
	
	@Test
	public void test1() throws Exception {
		tamgiac t = new tamgiac(-1,2,3);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}
	
	
	@Test
	public void test2() throws Exception {
		tamgiac t = new tamgiac(2,2,3);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}
	
	
	@Test
	public void test3() throws Exception {
		tamgiac t = new tamgiac(5,2,3);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}
	
	@Test
	public void test4() throws Exception {
		tamgiac t = new tamgiac(2,2,2);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}

	@Test
	public void test5() throws Exception {
		tamgiac t = new tamgiac(5,1,1);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}
	
	
	@Test
	public void test6() throws Exception {
		tamgiac t = new tamgiac(0,2,3);
		int a = 1;
		int b = t.Test();
		assertEquals(b,a);
	}
}
