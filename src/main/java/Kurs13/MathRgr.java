package Kurs13;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

public class MathRgr extends  HttpServlet   {
	protected static String typrek = "После рассчёта стоимости здесь появятся выбранные вами параметры";
	protected static String slov,vysslova,shrift,typslov,typsvet;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		response.setContentType("text/html;charset=UTF-8");
		if (Authorization.prov == 2) {
		request.getRequestDispatcher("/AdminForm.jsp").forward(request, response);
		}
		else if (Authorization.prov == 1) {
			request.getRequestDispatcher("/UserForm.jsp").forward(request, response);
		}
	}
	
	private static class RequestCalc {
	    private final String slovo;
		private final String vys;
		private final String  sh;
		private final String  vid;
		private final String  svet;
		private final String  diod;
		private final String divid;
		private final String x1;
		private final String x2;
		private final String x3;
		private final String vyslb,shirlb,tiplb,svetlb,diodlb,lamplb,vysvyv,shirvyv,tipvyv,mmvyv,opt1,opt2,promo;
		int sl ;
		double shrf ,sv,dd;
		private double result = 0;
		public static double prom;
						
		private RequestCalc (String login, String password, String shrift, String vidb, String osvecheniye, String diodm, String id,String vid1, String vid2, String vid3,String vys1, String shir1,String typlb,String svetlb,String didlb,String lplb,String vys2,String shir2,String tipv,String mmv,String opt1,String opt2,String promo) {
			this.slovo = login;
			this.vys = password;
			this.sh = shrift;
			this.vid = vidb;
			this.svet = osvecheniye;
			this.diod = diodm;
			this.divid = id;
			this.x1 = vid1;
			this.x2 = vid2;
			this.x3 = vid3;
			this.vyslb = vys1;
			this.shirlb = shir1;
			this.tiplb = typlb;
			this.svetlb = svetlb;
			this.diodlb = didlb;
			this.lamplb = lplb;
			this.vysvyv = vys2;
			this.shirvyv = shir2;
			this.tipvyv = tipv;
			this.mmvyv = mmv;
			this.opt1 = opt1;
			this.opt2 = opt2;
			this.promo = promo;
			
		}
		public static RequestCalc fromRequestParameters (HttpServletRequest request) {
			return new RequestCalc(
				request.getParameter("first"),
				request.getParameter("second"),
				request.getParameter("shrift"),
				request.getParameter("svet"),
				request.getParameter("osv"),
				request.getParameter("diod"),
				request.getParameter("one"),
				request.getParameter("tab"),
				request.getParameter("animal1"),
				request.getParameter("animal2"),
				request.getParameter("first1"),
				request.getParameter("second1"),
				request.getParameter("typelb"),
				request.getParameter("svet1"),
				request.getParameter("diod1"),
				request.getParameter("lamp"),
				request.getParameter("first2"),
				request.getParameter("second2"),
				request.getParameter("typevyv"),
				request.getParameter("mm"),
				request.getParameter("option1"),
				request.getParameter("option2"),
				request.getParameter("promo")
				);
			}
		
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) throws IOException  {
			Abstract lolo = new Extender();
			Abstract lolo1 = new Lightboxes();
			Abstract lolo2 = new Vyvesky();
			result = 0;sl = 0;shrf = 0; sv = 0; dd = 0;
			
			try {
			if (promo.equals("promo1") & !promo.isEmpty()) {
				prom = 0.2;
			}
			else  {
				prom = 0;
			}
			}
			catch (NullPointerException e){
				prom = 0;
			}
			System.out.println(prom);
			System.out.println(promo);
		  
			switch (x1){
			case "ObBukvy":
				result = 0;
				typrek = "Выбранный тип рекламы: Объёмные буквы";
				 try {
				if (vid.equals("1") & !slovo.isEmpty() & !vys.isEmpty()) {
					 sl = lolo.Math1(slovo, vys);
					 shrf = lolo.Math2(sh);
					 sv = lolo.Math3(svet);
					 dd = lolo.Math4(diod);
					 result = (sl * shrf * sv * dd)-(sl * shrf * sv * dd * prom) ;
					 System.out.println(result);
					 request.setAttribute("itog", result);
					 slov = "Введённое вами слово: " + slovo;
				}
				else if (vid.equals("2") & !slovo.isEmpty() & !vys.isEmpty()) {
					 sl = lolo.Math1(slovo, vys);
					 shrf = lolo.Math2(sh);
					 result = (sl * shrf) - (sl * shrf * prom) ;
					 System.out.println(result);
					 request.setAttribute("itog", result);
					
				}
				else  {
					String er = ("Error11!");
					request.setAttribute("itog", er);
				}
				 }
				 catch (NullPointerException e) {
					 
					 String er = ("Error11!");
						request.setAttribute("itog", er);
				 }
				break;
			case "Lightbox": 
				result = 0;
				typrek = "Выбранный тип рекламы: Лайтбоксы";
				try {
				if (svetlb.equals("1") & !vyslb.isEmpty() & !shirlb.isEmpty()) {
					double koefsvet = 1.5;
					int x1 = lolo.Math5(vyslb, shirlb);
					System.out.println(x1);
					double x2 = lolo.Math6(tiplb);
					System.out.println(x2);
					double x3 = lolo.Math7(diodlb);
					System.out.println(x3);
					result = (x1 * x2 * x3 * koefsvet) - (x1 * x2 * x3 * koefsvet * prom);
					System.out.println(result);
					request.setAttribute("itog", result);
					
				}
				else if (svetlb.equals("2") & !vyslb.isEmpty() & !shirlb.isEmpty()) {
                	double koefsvet = 1.25;
                	int x1 = lolo.Math5(vyslb, shirlb);
                	System.out.println(x1);
					double x2 = lolo.Math6(tiplb);
					System.out.println(x2);
					double x3 = lolo1.Math4(lamplb);
					System.out.println(x3);
					result = (x1 * x2 * x3 * koefsvet) - (x1 * x2 * x3 * koefsvet * prom);
					System.out.println(result);
					request.setAttribute("itog", result);
					
				}
                else {String er = "Error!";
				request.setAttribute("itog", er);
				System.out.println("Zdec` eror");}
				}
				catch (NullPointerException e) {
					System.out.println("Net, zdec` eror");
					 String er = "Error!";
						request.setAttribute("itog", er);
				 }
				break;
			case "Vyvesky": 
				result = 0;
				typrek = "Выбранный тип рекламы: Вывески";
				if(!vysvyv.isEmpty() & !shirvyv.isEmpty()) {
			    int x1v = lolo.Math5(vysvyv, shirvyv);
				double x2v = lolo.Math9(tipvyv);
				double x3v = lolo2.Math9(mmvyv);
				double dop = 1;
				double dop2 = 1;
				try {
				if ( opt1.equals("a1")) {
					dop = dop + 0.1;
				}
				if ( opt2.equals("a2")) {
					dop2 = dop2 + 0.15;
				}
				}
				
			    catch (NullPointerException e) {
			    	 String er = "Error";
						request.setAttribute("itog", er);
			    }
				
			    result = (x1v * x2v * x3v * dop* dop2) - (x1v * x2v * x3v * dop* dop2 * prom);
			    System.out.println(result);
			    request.setAttribute("tab", "Vyvesky");
			    
			    request.setAttribute("itog", result);
				}
				else {
					String er = "Error";
					request.setAttribute("itog", er);
				}
				break;
			}
		   if (result !=0) {
			   request.setAttribute("result", result);
		   }
		  
			
			
			
			
			
			
		}
		
	}}