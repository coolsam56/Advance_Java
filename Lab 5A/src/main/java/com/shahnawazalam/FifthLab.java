package com.shahnawazalam;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FifthLab extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
  
    	res.setContentType("text/html");
    	PrintWriter out=res.getWriter();

    	int num = Integer.parseInt(req.getParameter("num"));

    	out.print("<html><body>");
    	out.print("<h1><b> Your Table is Follows  : </b></h1>");

    	for(int i=1;i<=10;i++) 
    	{
    		out.print("<h3><b>" +num+"</b></h3>");
    		out.print(num);
	
    		out.print("<h3><b>" +num+"*"+i+"="+num*i+"</b></h3>");
    	}
	
	   	out.print("</body></html>");
    }
    
}
