<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>      

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Manage your profile here...</h1>
<hr/>
<spring:form action="save" method="post" modelAttribute="student">
	<spring:label path="uname">Enter name</spring:label>
	<spring:input path="uname"/>
	<br/>
	<br/>
	<spring:label path="email">Enter email</spring:label>
	<spring:input path="email"/>
	<br/>
	<br/>
	
	<spring:label path="country">Select Country</spring:label>
	<spring:select path="country">
	<spring:options items="${student.countries}"></spring:options>
	</spring:select>
	
	
	<br/>
	<br/>
	<spring:label path="favouriteLanguage">Select favourite Language</spring:label>
	<br/><spring:radiobutton path="favouriteLanguage" value="python"/>Python
	<br/><spring:radiobutton path="favouriteLanguage" value="Java"/>Java
	<br/><spring:radiobutton path="favouriteLanguage" value="cpp"/>cpp
	<br/><spring:radiobutton path="favouriteLanguage" value="bootstrap"/>Bootstrap
	
	
	<br/>
		<spring:label path="OperatingSystems">Operating System</spring:label>
	<br/><spring:checkbox path="operatingSystems" value="Windows"/>Windows
	<br/><spring:checkbox path="operatingSystems" value="Linux"/>Linux
	<br/><spring:checkbox path="operatingSystems" value="Mac"/>Mac
	
	
	
	<br/>
	
	<input type="submit" value="Submit">
	
</spring:form>


</body>
</html>