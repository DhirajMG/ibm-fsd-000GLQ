<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Enter the email address");
%>
<form action="employee_add" method="post">
email:<input type="text" name="email">
<br>
<input type="submit">
</form>

</body>
</html>