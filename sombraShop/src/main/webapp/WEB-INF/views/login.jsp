<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body id="login">
	<div id="loginForm">
		<div id=loginTable>
		<form method="post" action="?${_csrf.parameterName}=${_csrf.token}">
			<table>
				<tr>
					<th>Email:</th>
					<td><input name="username" type="text" /></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input name="password" type="text" /></td>
				</tr>
				<tr>
					<th></th>
					<td><input id="submitLogin" type="submit" value="Enter" /></td>
				</tr>
			</table>
		</form>
		</div>
	</div>	
</body>
</html>