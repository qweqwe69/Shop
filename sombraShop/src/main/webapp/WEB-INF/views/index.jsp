<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome</title>
</head>
<body class="body">
	<div class="container">
		<div id="containerProduct">
			<c:forEach var="product" items="${products}" varStatus="status">
				<div id="fonProduct">
        			<p>${product.productName}</p>
        			<div id="imgProd">
        				<c:url value="/${product.id}" var="productPage"/>
        				<a href="${productPage}"><img src="<c:url value="static/productPic/${product.orgNamePic}"/>" 
						alt="альтернативный текст" width=200px></a>
					</div>
					<security:authorize access="isAuthenticated()">
						<button id="comparison" value="/addToComparison/${product.id}">Add to compare</button>
						
 						<c:url value="/addToCart/${product.id}" var="addToCart"/>
						<a href="${addToCart}"><button id="basket">Add to cart</button></a>	 
       				</security:authorize>
				</div>		
			</c:forEach>
		</div> 
	</div>
</body>
</html>
<!-- http://liminspace.com/author/liminspace, engineX, spring boot, sololearn -->