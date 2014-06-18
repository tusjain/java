<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is a jsp</title>
</head>
<body>
This jsp has one include directive <br>
<%request.setAttribute("title", "Greeting"); %>

<% out.println("Java code in main"); %><br>

<%@ include file="myFooter.jsp"%>

</body>
</html>