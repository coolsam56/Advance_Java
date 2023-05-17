package com.sin;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcomm extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		uname = request.getParameter("uname");
		
		out.println("<html><body>");
		out.println("<title>Welcome page</title>");
		out.println("<h1>Welcome :"+uname+"</h1>");
		out.println("<a href='Uii.html'>Go back</a>");
		out.println("</body></html>");
	}

}