<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sf:form method="post" modelAttribute="user" action="?${_csrf.parameterName}=${_csrf.token}">
		<a href="manufacturer">Add manufacturer</a>
		<br>
		<a href="country">Add country</a>
		<br>
		<a href="city">Add city</a>
		<br>
		<a href="#">Add admin</a>
		<br>
		<a href="category">Add category</a> 
		<br>
		<a href="subCategory">Add subCategory</a> 
		<br>
		<a href="product">Add product</a>     
	</sf:form>
</body>
</html>