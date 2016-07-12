<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<div class="table">
        <table border="1px">
        	<tr>
        		<th>№</th>
        		<th>id</th>
        		<th>Ім'я</th>
				<th>Прізвище</th>
				<th>Стать</th>				
    			<th>Email</th>
    			<th>Телефон</th>
    			<th>Статус бану</th>  				
    			<th>Забанити</th>  				
    			<th>Видалити</th>    				
    			<th>Редагувати</th>    				
        	</tr>
        	<c:forEach var="user" items="${users}" varStatus="status">
        		<tr>
        			<td>${status.index}</td>
        			<td>${user.id}</td>
        			<td>${user.firstName}</td>
        			<td>${user.lastName}</td>
        			<td>${user.sex}</td>
        			<td>${user.email}</td>
        			<td>${user.phone}</td>
        			<td>${user.ban}</td>
         			<td><c:url value="ban/${user.id}" var="url"/>
					<a href="${url}">Забанити</a>
					<br>
					<c:url value="unban/${user.id}" var="url"/>
					<a href="${url}">Розбанити</a>
					</td>
					<td><c:url value="user/${user.id}" var="url"/>
					<a href="${url}">delete</a></td>
					<td><c:url value="editUser/${user.id}" var="url"/>
					<a href="${url}">Редактировать</a></td>
        		</tr>
			</c:forEach>        		
        </table>			
	</div>
</body>
</html>