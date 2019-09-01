<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>process page...</title>
</head>
<body>
Hello<%=request.getParameter("name") %><br>
Hello<%=request.getParameter("address") %><br>
Hello<%=request.getParameter("salary") %>
</body>
</html>