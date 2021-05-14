package Kurs13;

import java.io.IOException;

public abstract class Abstract {
static double db1;
static double back;
static int backi;
public abstract void Abs();

public static double Parse (String u) {

if (!u.isEmpty()) {
back = Double.parseDouble(u);
}


return back;

}

public static int Parseint (String u) {

if (!u.isEmpty()) {
backi = Integer.parseInt(u);
}


return backi;

}
protected double Math4(String diod) {

return 0;
}

protected double Math9(String koefv1) {

return 0;
}

protected int Math1(String slovo, String vysota) {
// TODO Auto-generated method stub
return 0;
}

public String getKoef() throws IOException {
// TODO Auto-generated method stub
return null;
}

protected double Math2(String shrif) {
// TODO Auto-generated method stub
return 0;
}

protected double Math3(String svet) throws IOException {
// TODO Auto-generated method stub
return 0;
}

protected int Math5(String vys, String shir) {
// TODO Auto-generated method stub
return 0;
}

protected double Math6(String koef1) {
// TODO Auto-generated method stub
return 0;
}

protected double Math7(String koef2) {
// TODO Auto-generated method stub
return 0;
}

protected double Math8(String koef3) {
// TODO Auto-generated method stub
return 0;
}
}
