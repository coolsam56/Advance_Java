<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial Print</title>
</head>
<body>
 
	<% 
	   int fac=1;
	   int i=Integer.parseInt(request.getParameter("no1"));
	   out.println("<h2> Factorial of Number: " +i +"</h2>");
       for (int j=i;j>0;j--)
    	   fac=fac*j;
       out.println("<h2>" +i +"!" +"=" +fac +"</h2>");
    %>
<a href="Lab6A.html">Go Back</a>
</body>
</html>