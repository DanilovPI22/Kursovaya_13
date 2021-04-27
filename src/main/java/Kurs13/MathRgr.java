package Kurs13;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")
public class MathRgr extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		 
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
		
	}
	
	private static class RequestCalc {
	
						
		private RequestCalc (String first, String second) {
		
			}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
		
			}
				
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			
		}}
		
	}