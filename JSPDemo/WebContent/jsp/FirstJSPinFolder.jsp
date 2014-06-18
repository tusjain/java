<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP title</title>
</head>
<body>
<%!
int a = 100;
  
%>

<% 
String myVar = "Today is Wednesday";
  for (int i=0; i < 1; i++){ 
	  out.println("<h1>Hello World!</h1>");
} 
%>

<%= a %> 

<%-- Comment string... --%>
<% /** a Java comment **/ %>
<!-- comments -->
 <!-- Comment for the page:  <%= a %> -->

<%out.println("<h2>Value of  myVar: " + myVar + "</h2>" );%> 

<p>
<% double actBalance =1.00; %>
Current Balance:<%=actBalance %><br>
<% if(actBalance < 1.00) { %>
  <b> Get a Job. </b> <br>
<% } %>

<% System.out.println("I am in System.out.print"); %>




<% 

String firstName = (String) session.getAttribute("firstname");
String lastName = (String)session.getAttribute("lastname");
out.println("Welcome " + firstName +"   " + lastName);
%>








</body>
</html>