<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fibonacci Series Print</title>
</head>
<body>
	<%!
		int a=0,b=1,c=0;
	%>
 
	<% 
	   int i=Integer.parseInt(request.getParameter("no1"));
	   out.println("<h2> fibnocci series upto "+i +" terms is     </h2>");
	   out.println(+ a +"  "+ b);
       for (int j=0;j<i;j++)
       {
    	   c=a+b;
    	   out.println(+c + " ");
    	   a=b;
    	   b=c;
    	   
       }
    %>
    <br>
    <br>
<a href="fab.html">Go Back</a>
</body>
</html>