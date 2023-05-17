<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page 1</title>
</head>
<body>
<%! int i=10;
public int add()
{
	i=i+10;
	return i;
}
%>
<%
out.println("<h1> value of i= " +i  +"</h1>");
out.println("<h1> Result After Add= " +add()  +"</h1>");
%>
<a href="jspform.html">Go Back</a>
</body>
</html>