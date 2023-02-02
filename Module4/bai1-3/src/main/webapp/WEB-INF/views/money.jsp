<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/15/2022
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transfer</title>
</head>
<body>
<form action="bai1" method="post">
<input type="text" name="money">
<select name="from"><option value="23000">VND</option>
  <option value="1">USD</option>
</select>
<select name="to">
<option value="1">USD</option>
  <option value="23000">VND</option></select>
<button>Submit</button>
</form>
<p>${result}</p>
</body>
</html>
