package com.second;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Expert extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException{
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
