<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="P1.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edits Products</title>
 <link rel="stylesheet" href="styles6.css">
</head>
 
<body>
<header>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
out.println("Page handle to Admin:"+ab.getfName()+"<br>");
%>
</header>
    <div class="main">
        <h1>Edit Product Only Admin</h1>
        <form action="update" method="get">
        <input type="hidden" name="pcode" value=<%=pb.getPcode() %>>
            <label for="first">
                  Product-Price:
              </label>
            <input type="text" id="first" name="price" value=<%=pb.getPrice() %> required>
 
            <label for="second">
                  Product-Quty
              </label>
            <input type="text" id="second" name="quty" value=<%=pb.getQut() %> required>
 
            <div class="wrap">
                <button type="submit"
                        onclick="solve()">
                    Update
                </button>
            </div>
        </form>
    </div>
</body>
 
</html>