<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="P1.*" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Insert title here</title>

</head>
<body>
<header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato"/>
                </header>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Page belong to Admin :"+ab.getfName());
out.println(msg);
%><br>
    <h1>
	<a href="Product1.html" class="btn btn-info" role="button">AddProduct</a>
	</h1>
	<br>
	<h2>
	<a href="ViewAllProduct" class="btn btn-info" role="button">ViewAllProduct</a>
	</h2>
	<br>
	<h3>
	<a href="LogOut" class="btn btn-info" role="button">LogOut</a>
	</h3>
	<br>
</body>
</html>