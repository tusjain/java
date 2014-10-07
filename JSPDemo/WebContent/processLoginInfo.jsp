<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process Login Info</title>
</head>
<body>
 I am processing
 <br>

 <form action="processSeesionInfo.jsp">
 
  <%
 

 out.println(request.getAttribute("t1"));
 
 out.println(request.getParameter("t1"));
 
 
 out.println(request.getAttribute("t11"));
 
 
 String s1 = request.getParameter("t11");
 out.println(s1);
 
 session.setAttribute("myFirstAttribute", s1);
 
 //out.println(session.getAttribute("myFirstAttribute"));
 
// out.println(session.getAttribute(s1));
/*
*/
/**
*/
  
 %>
 
 <!--   Client side comments  -->
 <input type="submit" value="Submit"  name="b1" id="b11"></input>
 

  <jsp:forward page="processSeesionInfo.jsp"></jsp:forward>
  
  
  <%--<jsp:forward page="http://google.com"></jsp:forward>  --%>
 
 </form>
</body>
</html>