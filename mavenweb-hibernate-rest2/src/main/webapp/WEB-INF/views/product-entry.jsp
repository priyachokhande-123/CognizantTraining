<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring-form:form action="${pageContext.request.contextPath}/product/save"   method="POST" modelAttribute="product">
	<br/>
	<br/>
	<spring-form:label path="name">Enter Name of product : </spring-form:label>
	<spring-form:input path="name"/>
	<br/>
	<br/>
	<spring-form:label path="category">Enter Category of product: </spring-form:label>
	<spring-form:input path="category"/>
	<br/>
	<br/>
	<spring-form:label path="category">Enter cost of product: </spring-form:label>
	<spring-form:input path="category"/>
	<br/>
	<br/>
	<input  type="submit" value="Save">
	
</spring-form:form>
</body>
</html>