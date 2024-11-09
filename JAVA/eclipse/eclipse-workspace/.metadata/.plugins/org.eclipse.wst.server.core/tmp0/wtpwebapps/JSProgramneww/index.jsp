<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int count=0; %>
<h1> welcome to hello world</h1>
<%---code to count the page --%>
page count is <% out.println(++count); %>
</body>
</html>
