<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <style>
        h1 {
            margin-left: 450px;
        }

        a {
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="container">
    <h1><a href="/products">List product</a></h1>
    <button class="btn btn-primary">
        <a style="color: white; font-weight: bold"
           href="create-product.jsp">Add new product</a>
    </button>
    <button class="btn btn-primary">
        <a style="color: white; font-weight: bold"
           href="delete-product.jsp">Delete product</a>
    </button>
    <button class="btn btn-primary">
        <a style="color: white; font-weight: bold"
           href="search-product.jsp">Search product</a>
    </button>
    <table class="table table-striped">
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>
        <c:forEach items="${products}" var="p">
            <tr>
                <td><c:out value="${p.getId()}"></c:out></td>
                <td><a href="/products?action=detail&id=${p.getId()}"><c:out value="${p.getName()}"></c:out></a></td>
                <td><c:out value="${p.getPrice()}"></c:out></td>
                <td><c:out value="${p.getQuantity()}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>