<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add product</title>
</head>
<body>
	<sf:form method="post" enctype="multipart/form-data"  modelAttribute="product" action="?${_csrf.parameterName}=${_csrf.token}">
		<div class="qwe">
		Назва товару: <sf:input path="productName"/><br>
		
		Виберіть виробника:
		<sf:select path="manufacturer">
			<c:forEach var="manufacturer" items="${manufacturers}">
				<sf:option value="${manufacturer.id}">${manufacturer.manufacturerName}</sf:option>
			</c:forEach>
		</sf:select> 
		<br>
		
		Виберіть підкатегорію:
		<sf:select path="subCategory">
			<c:forEach var="subCategory" items="${subCategories}">
				<sf:option value="${subCategory.id}">${subCategory.subCategoryName}</sf:option>
			</c:forEach>
		</sf:select>
		<br>
		
		Виберіть країну виробника:
		<sf:select path="country">
			<c:forEach var="country" items="${countries}">
				<sf:option value="${country.id}">${country.countryName}</sf:option>
			</c:forEach>
		</sf:select>
		<br>
  		
		Ціна: <sf:input path="price"/><br>
		Колір: <sf:input path="color"/><br>
		Габарити:<sf:input path="dimensions"/><br>
		Вага: <sf:input path="weight"/><br>
		Гарантійний термін: <sf:input path="warrantyPeriod"/><br>
		Опис:<sf:input path="productDescription"/><br>
        Виберіть фото товару:<input type="file" name="file"><br>
        <input type="submit" value="Enter" />
        </div>
        <div class="table">
        	<table border="1px">
        		<tr>
        			<th>№</th>
        			<th>Назва</th>
					<th>Ціна</th>
    				<th>Колір</th>
    				<th>Габарити</th>
    				<th>Вага</th>
    				<th>Гарантійний термін</th>
    				<th>Зображення</th>    				
    				<th>Видалити</th>  
    				<th>Редагувати</th>   				
        		</tr>
        		<c:forEach var="product" items="${products}" varStatus="status">
        		<tr>
        			<td>${product.id}</td>
        			<td>${product.productName}</td>
        			<td>${product.price}</td>
        			<td>${product.color}</td>
        			<td>${product.dimensions}</td>
        			<td>${product.weight}</td>
        			<td>${product.warrantyPeriod}</td>
        			<td><img src="<c:url value="static/productPic/${product.orgNamePic}"/>" 
					alt="альтернативный текст" 
					width=150px></td>
					<td><c:url value="/product/${product.id}" var="url"/>
					<a href="${url}">delete</a></td>
					<td><c:url value="editProduct/${product.id}" var="url"/>
					<a href="${url}">Редактировать</a></td>
        		</tr>
				</c:forEach>        		
        	</table>			
		</div>		
	</sf:form>
</body>
</html>