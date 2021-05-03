package Kurs13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Authorization extends HttpServlet {
 protected static String email;
 protected static String pass;
 protected static int prov;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
         email = request.getParameter("email");
         pass = request.getParameter("pass");
        
        if(checkUser(email, pass) == 1)
        {
            RequestDispatcher rs = request.getRequestDispatcher("/UserForm.jsp");
            rs.forward(request, response);
            prov = 1;
        }
        if(checkUser(email, pass) == 2)
        {
            RequestDispatcher rs = request.getRequestDispatcher("/AdminForm.jsp");
            rs.forward(request, response);
            prov = 2;
        }
        else
        {
           out.println("Имя пользователя или пароль введны неверно!");
           RequestDispatcher rs = request.getRequestDispatcher("/Authorization.jsp");
           rs.include(request, response);
        }
        
    }  
    public static int checkUser(String email,String pass) 
    {
        int st =0;
        try {
            if (email.equals("user") & pass.equals("12")) {
            	st = 1;
            	
            }
            if (email.equals("admin") & pass.equals("1")) {
            	st = 2;
            }
          

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}
