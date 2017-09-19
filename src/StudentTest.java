import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	Student jack;
	Student jill;
	Student jim;
	
	@Before
	public void setUp() {
		jack = new Student(3123456, "Grumpy","Jack");
	}

	@Test
	public void test1() {
		fail();
	}
	@Test
	public void test2() {		
		fail("Not Implemented Yet.");
	}
	
	@Test
	public void test3() {
		assertNull(jim);
	}
	
	@Test
	public void test4() {
		assertNotNull(jack);
	}
	@Test
	public void test5() {
		assertEquals("Jack", jack.getFamilyName());
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
