<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is my title</title>
</head>
<body>
<%!
  private String foo = "This is foo defined in declarion";
String myVar1 = " my First variable" ;
String myVar2 = " my Second variable" ;
  public String getFoo() 
	{
		 return this.foo; 
	}
%>


This is a jsp page.


<% 
  for (int i=0; i < 7; i++){
	  out.println("<h1>Hello World!</h1>");
	  System.out.println("value of foo is  : "+ foo);
} 
%>

<% double actBalance =1.00; %>
Current Balance:<%=actBalance %><br>
<% if(actBalance <= 1.00) { %>
  <b> Get a Job. </b> <br>
<% } %>




<table>
<tr>
<td> <%= myVar1 %> </td>
<td> <%= myVar2 %> </td>

</tr>
</table>

<% 

session.setAttribute("firstname", "Vidur");
session.setAttribute("lastname", "Ravi");
String firstname1 = (String) session.getAttribute("firstname");
String lastname1 = (String)session.getAttribute("lastname");
out.println("Welcome " + firstname1 +" " + lastname1);
%>




</body>
</html>