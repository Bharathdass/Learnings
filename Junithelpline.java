package mrng;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Junithelpline {
	static Dogs pinky;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pinky=new Dogs();
	}

	@Test
	public void test() {
		
		new Operator().connect(pinky);
		assertEquals("I will handle dog problems...","I will handle dog problems...");
	}

}
