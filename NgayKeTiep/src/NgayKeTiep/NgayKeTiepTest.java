package NgayKeTiep;

import static org.junit.Assert.*;

import org.junit.Test;
public class NgayKeTiepTest {


	@Test
	public void Test1() {
		NgayKeTiep date = new NgayKeTiep();
		String s = date.nextday(2, 4, 2014);
		assertEquals("3 - 4 - 2014", s);		
	}


	@Test
	public void Test2() {
		NgayKeTiep date = new NgayKeTiep();
		String s = date.nextday(31, 4, 2014);
		assertEquals("32 - 4 - 2014", s);		
	}
	
	
	@Test
	public void Test3() {
		NgayKeTiep date = new NgayKeTiep();
		String s = date.nextday(31, 4, 2014);
		assertEquals("1 - 5 - 2014", s);		
	}
	
	@Test
	public void Test4() {
		NgayKeTiep date = new NgayKeTiep();
		String s = date.nextday(-4, 4, 2014);
		assertEquals("-3 - 4 - 2014", s);		
	}
	
	@Test
	public void Test5() {
		NgayKeTiep date = new NgayKeTiep();
		String s = date.nextday(1, 13, 2014);
		assertEquals("2 - 13 - 2014", s);		
	}

}
