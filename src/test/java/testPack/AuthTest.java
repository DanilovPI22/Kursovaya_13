package testPack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Kurs13.Authorization;


public class AuthTest {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
}

@Before
public void setUp() throws Exception {

}

@Test
public void test() {
Authorization auth = new Authorization();
int x = auth.checkUser("user", "12");
assertEquals(x,1);
}

}