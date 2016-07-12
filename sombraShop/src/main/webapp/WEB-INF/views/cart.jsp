<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
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
        			<th></th> 
        			<th>Назва</th>
					<th>Ціна</th>			
        		</tr>
        		<c:forEach var="product" items="${products}" varStatus="status">
        		<tr>
        			<td><img src="<c:url value="static/productPic/${product.orgNamePic}"/>" 
					alt="альтернативный текст" 
					width=150px></td>
        			<td>${product.productName}</td>
        			<td>${product.price}</td>
					<td><c:url value="deleteWithCart/${product.id}" var="url"/>
					<a href="${url}">Видалити з кошика</a></td>
        		</tr>
				</c:forEach>        		
        	</table>			
	</div>
</body>
</html>