package com.transfer;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Transfer extends HttpServlet {
       protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	   
   res.setContentType("text/html");
   
   PrintWriter out=res.getWriter();
   String sname= req.getParameter("uname");
   int age = Integer.parseInt(req.getParameter("age"));
   
   out.print("<html><body>");
   out.print("<h1><b>Your Name is :  " +sname+" </b></h1>");
   out.print("<h2><b>Your Age is  : "+age+" </b></h2>");
	
   out.print("</body></html>");
       }
       public void destroy() {
    	   System.out.println("Doget is Destroyed");
       }
}
