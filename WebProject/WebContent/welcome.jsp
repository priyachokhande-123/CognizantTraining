<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Congratulations ,Successfully logged in</h1>
<h2>Hello</h2>

<%

String uname=request.getParameter("uname");
%>
<%= uname %>

<%
for(int i=1;i<=5;i++){
%>

<br/>
<input type="text">
<%
}
%>
</body>
</html>