<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="P1.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<title>Insert title here</title>
<link rel="stylesheet" href="styles8.css" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <!-- FontAwesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<center>
<header>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Page belong to Admin :"+ab.getfName()+"<br>");
%>
</header>
</center>
<div class="congratulation-area text-center mt-5">
        <div class="container">
        
            <div class="congratulation-wrapper">
                <div class="congratulation-contents center-text">
                    <div class="congratulation-contents-icon">
                        <i class="fas fa-check"></i>
                    </div>
                    <h4 class="congratulation-contents-title">Product Delete Successfully!</h4>
                    <p class="congratulation-contents-para"> Go to Another Page </p>
                    <div class="btn-wrapper mt-4">
                       
                        <a href="Product1.html" class="cmn-btn btn-bg-1">AddProduct</a>
                    </div>
                    <div class="btn-wrapper mt-4">
                       
                        <a href="ViewAllProduct" class="cmn-btn btn-bg-1">ViewAllProduct</a>
                    </div>
                    <div class="btn-wrapper mt-4">
                       
                        <a href="LogOut" class="cmn-btn btn-bg-1">LogOut</a>
                    </div>
                    
                </div>
            </div>
        </div>
    </div>

 
</body>
</html>