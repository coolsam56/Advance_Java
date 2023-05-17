<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result of JSP</title>
</head>
<body>

<% 
	int i=Integer.parseInt(request.getParameter("no1"));
   int j=Integer.parseInt(request.getParameter("no2"));
   int k=Integer.parseInt(request.getParameter("no3"));
   int summ=i+j+k;
   float avg=(float)summ/3;
out.println("<h2> Sum of the Above number is: "+summ +"</h2>");
out.println("<h2> Average of the Above number is: "+avg +"</h2>");
%>

</body>
</html>