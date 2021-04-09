import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Mathematicspromo_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		MathRgr mat = new MathRgr();
		MathRgr.text5.setText("промо3");
		
	}

	@Test
	public void test() {
		double exp = 0.4;
		Abstract lolo = new Extender();
		assertEquals(exp,lolo.abs(),0);
			
		}
		
	}


