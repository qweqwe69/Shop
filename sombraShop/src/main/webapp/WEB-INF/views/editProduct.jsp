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
	<sf:form method="post" enctype="multipart/form-data"  modelAttribute="product" action="?${_csrf.parameterName}=${_csrf.token}">
		<div class="qwe">
		Назва товару: <sf:input path="productName"/><br>		
		Ціна: <sf:input path="price"/><br>
		Колір: <sf:input path="color"/><br>
		Габарити:<sf:input path="dimensions"/><br>
		Вага: <sf:input path="weight"/><br>
		Гарантійний термін: <sf:input path="warrantyPeriod"/><br>
		Опис:<sf:input path="productDescription"/><br>
        Виберіть фото товару:<input type="file" name="file"><br>
        <input type="submit" value="Enter" />
        </div>		
	</sf:form>
</body>
</html>