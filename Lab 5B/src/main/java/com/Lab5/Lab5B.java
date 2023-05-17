package com.Lab5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Lab5B extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
  
    	res.setContentType("text/html");
    	PrintWriter out=res.getWriter();

    	int num = Integer.parseInt(req.getParameter("num"));
         int fact=1;
    	out.print("<html><body>");
    	out.print("<h1><b> Factorial of"  +num    +"is  : </b></h1>");
    	for(int i=num;i>0;i--)
    	{
	
    		fact=fact*i;
    		out.print("<h3><b>" +"Factorial is Calculating :"  +fact  +"</b></h3>");
    	}
    	out.print("<br><br>");
    	out.print("<h1><b>" +"Factorial Final Answer is :"  +fact    +"</b></h1>");
    	
    	
	
	   	out.print("</body></html>");
    }
    
}
