import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	Student jack;
	Student jill;
	
	@Before
	public void setUp() {
		jack = new Student(3123456, "Grumpy","Jack");
	}

	@Test
	public void test1() {
		//System.out.println("fail");
		fail();
	}
	@Test
	public void test2() {
		//System.out.println("fail");
		
		fail("Not Implemented Yet.");
	}
	
	@Test
	public void test3() {
		 
		assertNull(jill);
	}
	
	@Test
	public void test4() {
		assertNotNull(jack);
	}
	@Test
	public void test5() {
		// System.out.println(jack.getFamilyName());
		
		assertEquals("Grumpy", jack.getFamilyName());
 
	}
	
	@Test
	public void test6() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(42);
		list.add(-3);
		list.add(17);
		list.add(99);

		assertEquals(4, list.size());
		assertEquals(17, (int) list.get(2));
		assertTrue(list.contains(-3));
		assertFalse(list.isEmpty());
	}
	
}
