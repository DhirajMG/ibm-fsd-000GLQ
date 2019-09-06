<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName"/><br>
Last Name:<form:input path="lastName"/><br>
Country:<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select><br>
Language:Java <form:radiobutton path="language" value="Java" />
		C# <form:radiobutton path="language" value="C#" />
		PHP <form:radiobutton path="language" value="PHP" />
		Ruby <form:radiobutton path="language" value="Ruby" />
<br>
	<%-- Operating Systems:Windows <form:checkbox path="operatingSystems" value="Windows" />
	Mac <form:checkbox path="operatingSystems" value="Mac" />
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	Fedora <form:checkbox path="operatingSystems" value="Fedora" />--%>
<br>
<input type="submit" value="submit">
</form:form>

</body>
</html>