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
		<p>Add manufacturer</p>
		<input name="manufacturerName" type="text" /> 
		<input type="submit" value="add" />
		<br>
		<c:forEach var="manufacturer" items="${manufacturers}">
			${manufacturer.manufacturerName}
			<c:url value="/manufacturer/${manufacturer.id}" var="url"/>
			<a href="${url}">delete</a>
			<br>	
		</c:forEach>
	</sf:form>
</body>
</html>