<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table Print</title>
</head>
<body>
 
	<%
	   int i=Integer.parseInt(request.getParameter("no1"));
	   out.println("<h2> Table of Given Number "+i +" is</h2>");
       for (int j=1;j<=10;j++)
       out.println("<h2>"+i+"*"+j+"="+i*j+"</h2>");
    %>
<a href="Tableprint.html">Go Back</a>
</body>
</html>