<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/29/2022
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product Detail</h1>
<h2>Id: <c:out value="${product.getId()}"></c:out></h2>
<h2>Name: <c:out value="${product.getName()}"/></h2>
<h2>Price: <c:out value="${product.getPrice()}"/></h2>
<h2>Quantity: <c:out value="${product.getQuantity()}"/></h2>
<h3><a href="/products">Back to home</a></h3>
</body>
</html>
