<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/29/2022
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<h1>Search product</h1>
<form action="/products?action=find" method="post">
    <p><input type="text" name="name" placeholder="Enter name of product your want find"></p>
    <p><button type="submit">Confirm</button></p>
    <p><button><a href="/products">Back to home</a></button></p>
<%--    <p>--%>
<%--        <c:if test='${requestScope["message"] != null }'>--%>
<%--            <span class="message">${requestScope["message"]}</span>--%>
<%--        </c:if>--%>
<%--    </p>--%>
</form>
</body>
</html>
