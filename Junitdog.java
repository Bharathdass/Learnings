package mrng;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitdog {
	static Dog d;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 d=new Dog();
	
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
	public void test() {
		
		d.ht=new stone();
	d.call();
	assertEquals("dog runs.............","dog runs.............");
	}

}
