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
	<div id="productContainer">
		<div id="productPic">
			<img src="<c:url value="static/productPic/${product.orgNamePic}"/>" 
			alt="альтернативный текст" width=300px>
		</div>
		<div id="productDimensions">	
        		<p>Product name: ${product.productName}</p>
        		<hr>
        		<p>Color: ${product.color}</p>
        		<hr>
        		<p>Dimensions: ${product.dimensions}</p>
        		<hr>
        		<p>Weight: ${product.weight}</p>
        		<hr>
        		<p>Warranty period: ${product.warrantyPeriod}</p>
        		<hr>
        		<p>Price: ${product.price}₴</p>
        		<security:authorize access="isAuthenticated()">
						<button id="productPageComparisonButton" value="/addToComparison/${product.id}">Add to compare</button>
						
 						<c:url value="/addToCart/${product.id}" var="addToCart"/>
						<a href="${addToCart}"><button id="productPageBasketButton">Add to cart</button></a>	 
       			</security:authorize>
		</div>			
	</div>
</body>
</html>