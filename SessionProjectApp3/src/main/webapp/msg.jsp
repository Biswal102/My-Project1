<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles9.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<center>
<%
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<br>
<a href="Home.html" class="cmn-btn btn-bg-1">Go to Home Page</a>
</center>
<div class="container">
        <div class="container-1"></div>
        
 </div>

</body>
</html>