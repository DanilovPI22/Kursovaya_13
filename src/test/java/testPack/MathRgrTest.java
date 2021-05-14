package testPack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Kurs13.MathRgr;

public class MathRgrTest {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
}

@Before
public void setUp() throws Exception {

}

@Test
public void test() {
MathRgr math = new MathRgr();
assertEquals(math.typrek,"You will see the selected ad type after the calculations");
}

}