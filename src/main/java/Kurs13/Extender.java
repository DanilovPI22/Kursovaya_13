package Kurs13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Extender extends Abstract{
	protected static double  w = 1, k  , f = 1, j = 1, c = 1, a = 1, p, j1;
	protected static int h, n;
	protected static double T;
	protected static String s;
	protected static int res; protected static double res1,res2,res3,res4;
	
	protected String getKoef() throws IOException {
		File file = new File("AdmSettings.txt");
		if (file.exists()){
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				 s = scanner.nextLine();
				
			}
			scanner.close();
		}
		else {
			File file1 = new File("AdmSettings.txt");
			file1.createNewFile();
			PrintWriter pw = new PrintWriter(file1);
	        
	        pw.println("1");
	        
	        pw.flush();
	        pw.close();
	        Scanner scanner1 = new Scanner(file1);
			while (scanner1.hasNextLine()) {
				 s = scanner1.nextLine();
				
			}
			scanner1.close();
		}
		return s;
	}
	
	@Override
	
	protected int Math1(String slovo, String vysota) {
		n = slovo.length();
		h = Parseint(vysota);
		res = n * h;
		return res;
		
	}
	
	@Override
	
	protected double Math2(String shrif) {
		int i = Parseint(shrif);
		f = 1;
		switch (i){
		case 1: f = f +0.15; break;
		case 2: f = f +0.2; break;
		case 3: f = f +0.25; break;
		}
		res1 = f;
		return res1;
		
	}
	
	@Override

	protected double Math3(String svet) throws IOException {
		String sv = getKoef();
		
		j = Parse(sv);
		int i = Parseint(svet);
		switch (i){
		case 1: j = j +0.25; break;
		case 2: j = j +0.2; break;
		
		}
		res2 = j;
		return res2;
		
	}
	
	@Override
	protected double Math4(String diod) {
		c = 1;
		int i = Parseint(diod);
		switch (i){
		case 1: c = c +0.15; break;
		case 2: c = c +0.2; break;
		
		}
		res3 = c;
		return res3;
		
	}
	
	@Override
	
	protected int Math5(String vys,String shir) {
		
		int wh = Parseint(shir)*Parseint(vys);
		return wh;
		
	}

	@Override

	protected double Math6(String koef1) {
		k = 1;
		int i = Parseint(koef1);
		switch (i) {
		case 1: k = k + 0.1; break;
		case 2: k = k + 0.15; break;
		case 3: k = k + 0.15; break;
		case 4: k = k + 0.2; break;
		case 5: k = k + 0.2; break;
		case 6: k = k + 0.25; break;
		}
		res4 = k;
		return res4;
		
	}

	@Override
	
	protected double Math7(String koef2) {
		j1=1;
		int i = Parseint(koef2);
		switch (i) {
		case 1: j1 = j1 + 0.1; break;
		case 2: j1 = j1 + 0.15; break;
		
		}
		return j1;
		
	}
	
	@Override
	
	protected double Math8(String koef3) {
		j=1;
		int i = Parseint(koef3);
		switch (i) {
		case 1: j = j + 0.1; break;
		case 2: j = j + 0.15; break;
		
		}
		return j;
		}

	@Override
	protected double Math9(String koefv1) {
		k=1;
		int i = Parseint(koefv1);
		switch (i) {
		case 1: k = k + 0.15; break;
		case 2: k = k + 0.2; break;
		case 3: k = k + 0.25; break;
		}
		return k;
		}

	@Override
	public void Abs() {
		// TODO Auto-generated method stub
		
	}


}
class Lightboxes extends Abstract {
	
	@Override
	public void Abs() {
		// TODO Auto-generated method stub
		
	}
	@Override 
	protected double Math4(String diod) {
		Extender.j1=1;
		int i = Parseint(diod);
		switch (i) {
		case 1: Extender.j1 = Extender.j1 + 0.15; break;
		case 2: Extender.j1 = Extender.j1 + 0.2; break;
		
		}
		return Extender.j1;
		
		
	}

}
class Vyvesky extends Abstract {

	@Override
	public void Abs() {
		// TODO Auto-generated method stub
		
	}
	
@Override
	
	protected double Math9(String koefv1) {
	Extender.p=1;
		int i = Parseint(koefv1);
		switch (i) {
		case 1: Extender.p = Extender.p + 0.15; break;
		case 2: Extender.p = Extender.p + 0.2; break;
		case 3: Extender.p = Extender.p + 0.25; break;
		}
		return Extender.p;
		}
}
