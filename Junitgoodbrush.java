package mrng;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Junitgoodbrush {
	static GoodBrush gd;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gd =new GoodBrush();
	}
	@Test
	public void test() {
		
		gd.pt=new RedPaint();
		gd.doPaint();
		assertEquals("Red colour paint....","Red colour paint....");
	}

}
