package testPack;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Kurs13.Abstract;
import Kurs13.Extender;

public class KoefTest {
	Abstract lolo = new Extender();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		String x = lolo.getKoef();
		assertNotNull(x);
	}

}
