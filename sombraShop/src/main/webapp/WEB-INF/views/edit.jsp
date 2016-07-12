<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>edit</title>
</head>
<body>
	<sf:form method="post" modelAttribute="user">
		<table>
			<tr>
				<th>First name*</th>
				<td><sf:input path="firstName"/></td>
			</tr>
			<tr>
				<th>Last name*</th>
				<td><sf:input path="lastName"/></td>
			</tr>
			<tr>
				<th>Email*</th>
				<td><sf:input path="email"/></td>
			</tr>
			<tr>
				<th>Phone*</th>
				<td><sf:input path="phone"/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Enter" /></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>