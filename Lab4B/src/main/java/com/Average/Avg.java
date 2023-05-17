package com.Average;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Avg extends HttpServlet {
       protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
   System.out.println("doPost is Initialised");	   
   res.setContentType("text/html");
   
   PrintWriter out=res.getWriter();
   int a = Integer.parseInt(req.getParameter("1num"));
   int b = Integer.parseInt(req.getParameter("2num"));
   int c= Integer.parseInt(req.getParameter("3num"));
   float avg=(a+b+c)/3;
   
   out.print("<html><body>");
   out.print("<h1><b>Average of three number is :  " +avg+" </b></h1>");
  
	
   out.print("</body></html>");
       }
       public void destroy() {
    	   System.out.println("Doget is Destroyed");
       }
}