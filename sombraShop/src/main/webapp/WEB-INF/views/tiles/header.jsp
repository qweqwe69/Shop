<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>header</title>
</head>
<body>
	<div id="header">
		
		<div id="sombra">
			<a href="<c:url value="/"/>">Sombra shop</a>
		</div>
		
		<security:authorize access="hasRole('ROLE_ADMIN')">
        	<p>Hello Admin</p>
        	
			<a href="admin">Administration</a>	
   		</security:authorize>

		<security:authorize access="!isAuthenticated()">
				<a href="registration">Registration</a>
				
				<a href="login">Sign in</a>			
    	</security:authorize>

    	<security:authorize access="isAuthenticated()">
    		<a href="<c:url value="/logout"/>">Logout</a>
    		<security:authorize access="hasRole('ROLE_USER')">
        		<a href="cart">Cart</a>
       		</security:authorize>
   		</security:authorize>

	</div>
</body>
</html>