package Kurs13;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.clipper.Paths;

public class PDFGenerator extends HttpServlet {
	protected static BaseFont bf;
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		File file = new File("Data.pdf");
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(file));
		} catch (FileNotFoundException | DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		document.open();
		BaseFont times = null;
		try {
			times = BaseFont.createFont("times.ttf", "cp1251", BaseFont.EMBEDDED);
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}		
		
		
		Paragraph paragraph = new Paragraph();
	    paragraph.add(new Paragraph("Привет", new Font(times,14)));
	    
	    
	  
	    try {
			document.add(paragraph);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		
		
		document.close();
		
	
		
	    ServletOutputStream outputStream = null;
	    BufferedInputStream inputStream = null;
	    
	    try {
	        outputStream = response.getOutputStream();
	        response.setContentType("application/vnd.ms-excel");
	        response.setHeader("Content-Disposition", "attachment; filename=\"" + file + "\"");
	        response.setContentLength((int) file.length());
	        FileInputStream fileInputStream = new FileInputStream(file);
	        inputStream = new BufferedInputStream(fileInputStream);
	        int readBytes = 0;
	        while ((readBytes = inputStream.read()) != -1)
	            outputStream.write(readBytes);
	    }catch (NullPointerException e){
	        e.printStackTrace();
	    }finally {
	        outputStream.flush();
	        outputStream.close();
	        inputStream.close();
	    }
	}
}