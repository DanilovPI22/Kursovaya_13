package testPack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Kurs13.Abstract;
import Kurs13.Extender;
import Kurs13.MathRgr;
import Kurs13.PDFGenerator;

public class ExtenderTest {
Abstract lolo = new Extender();
@BeforeClass
public static void setUpBeforeClass() throws Exception {


}

@Before
public void setUp() throws Exception {

}

@Test
public void test() {
int x = lolo.Parseint("1");
assertTrue(x==1);
}

}