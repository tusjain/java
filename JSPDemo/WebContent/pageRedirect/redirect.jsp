<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<center>
<h1>Page Redirection</h1>
</center>
<%
   // New location to be redirected
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   //response.setHeader("Location", "http://www.google.com"); 
%>

<% response.sendRedirect("http://architecture-soa-bpm-eai.blogspot.com/"); %>

</body>
</html>