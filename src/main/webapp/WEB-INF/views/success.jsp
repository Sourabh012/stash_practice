<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${Header }</h1>
<p>${des }</p>


<h1 style="color: green">${msg }</h1>


<h1>Welcome , ${user.userName}</h1>
<h1>your email address is ${user.email }</h1>
<h1>your password is ${user.password }</h1>





</body>
</html>