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
String msg=(String)request.getAttribute("msgs");
out.println(msg);
%><br>
<a href="UserLogin.html">UserLogin</a>
</body>
</html>