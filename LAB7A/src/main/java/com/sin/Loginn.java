package com.sin;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Loginn extends HttpServlet {
	
	String uname,pass;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		uname = request.getParameter("uname");
		pass = request.getParameter("pass");
	
	    if (uname.equals("sistec") && pass.equals("Test")) 
	    {
			RequestDispatcher rd = request.getRequestDispatcher("Wel");
			rd.forward(request, response);
		}
	
	else if (!uname.equals("sistec") && !pass.equals("Test")) 
	  {
		out.print("<h1>**Invalid both username & Password**</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("Uii.html");
		rd.include(request, response);
	  }
		
		else if (pass.equals("Test")&& !uname.equals("sistec"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Uii.html");
			rd.include(request,response);
			
			out.print("<h1>**Invalid Username**</h1>");
		}
	
		else if (uname.equals("sistec") && !pass.equals("Test")) 
		{
			RequestDispatcher rd = request.getRequestDispatcher("Uii.html");
			rd.include(request,response);
			out.print("<h1>**Invalid Password**</h1>");
		}
	
			
		}
		
}
