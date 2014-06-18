<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is jsp</title>
</head>
<body>
This jsp has useBean <br>

<jsp:useBean id="myBean" class = "com.kashit.bean.Student" />
<jsp:useBean id="myBean1" class = "com.kashit.bean.Student" />

<jsp:setProperty name="myBean" property="name" value="Micheal Jackson" />


<jsp:getProperty  name="myBean" property="name"/><br>

<jsp:setProperty name="myBean1" property="name" value="John"  />
<jsp:getProperty  name="myBean1" property="name"/>
</body>
</html>