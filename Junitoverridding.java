package mrng;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Junitoverridding {
static	parent p;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	p=new child();
	}

	@Test
	public void test() {	
			p.test();
			assertEquals("parent child" ,"parent child");
	}

}
