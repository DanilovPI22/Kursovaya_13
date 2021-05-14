package testPack;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Kurs13.AdminSettings;

public class AdmTest {
AdminSettings adm;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
}

@Before
public void setUp() throws Exception {
}

@Test
public void test() throws IOException {
String s = null;
AdminSettings.setAdm("2");
File file = new File("AdmSettings.txt");
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine()) {
s = scanner.nextLine();

}
scanner.close();

assertEquals(s,"2");
}

}
