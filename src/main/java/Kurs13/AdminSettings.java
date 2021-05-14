package Kurs13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminSettings extends HttpServlet {
    protected static String shriftadmin;
    protected static String newvalue;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rs = request.getRequestDispatcher("/AdminForm.jsp");
        rs.include(request, response);

         newvalue = request.getParameter("adminput");


         setAdm(newvalue);


    } 

    public static void setAdm(String usf) throws IOException {

        File file = new File("AdmSettings.txt");
        if (file.exists() == false) {
            file.createNewFile();
            System.out.println("Успешно");
        }

        PrintWriter pw = new PrintWriter(file);

        pw.println(usf);

        pw.flush();
        pw.close();

     System.out.println("Успешно");

}
}