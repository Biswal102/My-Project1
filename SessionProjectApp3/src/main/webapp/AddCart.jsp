<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="P1.*,P2.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<header>
<nav class="navbar navbar-expand-md navbar-dark" style="background-color: green">
</header>
<div class="container">
<center>
<h2>Avilable Product</h2>
</center>
		<table class="table table-striped">
			
				<tr>
					<th>PCODE</th>
					<th>PNAME</th>
					<th>PRICE</th>
					<th>QUTY</th>
					<th>DELETE</th>
					
					
				</tr>
<%
ArrayList<ProductBean> ali=(ArrayList<ProductBean>)session.getAttribute("alist");
for(ProductBean pb : ali)
{
%>
<tr>
						<td><%=pb.getPcode() %></td>
						<td><%=pb.getPname() %></td>
						<td><%=pb.getPrice() %></td>
						<td><%=pb.getQut() %></td>
						<td><a href="delet?pcode=<%=pb.getPcode() %>"
							class="btn btn-info" role="button">Remove</a></td>
						
						
</tr>
<%
}
%>
</table>
<a href="ViewProducts" class="btn btn-info" role="button">ViewAllProduct</a>
</div>

</body>
</html>