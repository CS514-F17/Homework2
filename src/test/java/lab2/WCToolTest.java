package lab2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class WCToolTest {
	
	private static WCTool wct1;
	private static WCTool wct2;
	private static WCTool wct3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		wct1 = new WCTool("input/simple1.txt");
		wct2 = new WCTool("input/simple2.txt");
		wct3 = new WCTool("input/simple3.txt");
	}


	@Test
	public void testGetLinesSimple1() {
		assertEquals("getLines fails for simple1", 1, wct1.getLines());
	}

	@Test
	public void testGetLinesSimple2() {
		assertEquals("getLines fails for simple2", 3, wct2.getLines());
	}

	@Test
	public void testGetLinesSimple3() {
		assertEquals("getLines fails for simple3", 157, wct3.getLines());
	}

	@Test
	public void testGetWordsSimple1() {
		assertEquals("getWords fails for simple1", 15, wct1.getWords());
	}

	@Test
	public void testGetWordsSimple2() {
		assertEquals("getWords fails for simple2", 12, wct2.getWords());
	}

	@Test
	public void testGetWordsSimple3() {
		assertEquals("getWords fails for simple3", 1110, wct3.getWords());
	}
}
