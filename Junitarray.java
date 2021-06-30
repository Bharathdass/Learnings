package mrng;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitarray {
	static Arraydemo2 obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 obj=new Arraydemo2();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		obj=null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		System.out.println(obj.myclassroom[0]);
		assertEquals("this is new class","this is new class");
	}

}
