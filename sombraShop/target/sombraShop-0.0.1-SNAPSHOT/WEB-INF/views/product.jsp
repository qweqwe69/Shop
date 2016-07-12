<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>product</title>
</head>
<body>
	<sf:form method="post" modelAttribute="product" action="?${_csrf.parameterName}=${_csrf.token}">
		<p>Add product<p/>
		<p>Manufacturer<p/>
		<sf:select path="manufacturer">
			<c:forEach var="manufacturer" items="${manufacturers}">
				<sf:option value="${manufacturer.id}">${manufacturer.manufacturerName}</sf:option>
			</c:forEach>
		</sf:select> 
	
		<p>SubCategory<p/>
		<sf:select path="subCategory">
			<c:forEach var="subCategory" items="${subCategories}">
				<sf:option value="${subCategory.id}">${subCategory.subCategoryName}</sf:option>
			</c:forEach>
		</sf:select>
	
		<p>Country manufacturer<p/>
		<sf:select path="country">
			<c:forEach var="country" items="${countries}">
				<sf:option value="${country.id}">${country.countryName}</sf:option>
			</c:forEach>
		</sf:select>
	
  		<p>Ціна</p>
		<sf:input path="price"/>
		<p>Колір</p>
		<sf:input path="color"/>
		<p>Габарити</p>
		<sf:input path="dimensions"/>
		<p>Вага</p>
		<sf:input path="weight"/>
		<p>Гарантійний термін</p>
		<sf:input path="warrantyPeriod"/>
		<p>Опис</p>
		<sf:input path="productDescription"/>
		<input type="submit" value="Enter" />
	</sf:form>
</body>
</html>