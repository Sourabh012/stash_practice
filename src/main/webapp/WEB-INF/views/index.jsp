<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
</head>
<body>

<h1>this is home page</h1>
<h1>called by home controller</h1>
<h1>url /home</h1>
<%
    
	String name = (String) request.getAttribute("name");
	
//	List<String> friends=(List<String>) request.getAttribute("f");

%>


 <h1>Name is <%=name%></h1> 

</body>
</html>