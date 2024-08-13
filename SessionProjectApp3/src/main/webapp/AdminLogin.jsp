<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="P1.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("Welcome Admin : "+ab.getfName());
%>
<%-- 
<br>
	<a href="Product1.html">AddProduct</a>
	<br>
	<a href="ViewAllProduct">ViewAllProduct</a>
	<br>
	<a href="LogOut">LogOut</a>
	<br>
--%>
</body>
</html>