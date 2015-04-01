<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<br> This is footer without html headers<br> 

<% out.println("Java code in footerqqqqqqqqq"); %>

<%= request.getAttribute("title")%>

<% /**  jsp:forward page="subFolder/afterForwardJSP.jsp" **/ %> 

<jsp:forward page="http://google.com" /> 