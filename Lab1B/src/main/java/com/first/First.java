package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class First implements Servlet {
	ServletConfig config ;
public void init(ServletConfig config) throws ServletException

{
	this.config =config;
System.out.println("Servlet is initialised");
}

public  ServletConfig getServletConfig()
{
	return config;
}

public String getServletInfo()
{
	return "my servlet 1.0";
	
}

public void service(ServletRequest req,ServletResponse res) throws ServletException , IOException
{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.print("<html><body>");
	out.print("<h1><b>Servlet by implementing Generic Servlet class </b></h1>");
	out.print("</body></html>");
}
public void destroy()
{
	System.out.println("Servlet is Destroyed");
			
}

}
