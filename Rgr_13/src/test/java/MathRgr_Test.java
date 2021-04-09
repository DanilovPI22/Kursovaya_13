import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathRgr_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		MathRgr test = new MathRgr();
	}

	
	@Test
	public void test() {
			
		int prov = -1;
		boolean f = false;
		if (prov==MathRgr.reklama.getSelectedIndex()) {
			f = true;
		}
		
		assertTrue(f);
		
	}

}
