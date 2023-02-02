<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="converter.jsp">Currency Converter</a>
<a href="vndictionary.jsp" >Vietnamese Dictionary</a>
<form action="character.jsp" method="post">
    <input type="text" name="name">
    <button type="submit">Click</button>
</form>
</body>
</html>