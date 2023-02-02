<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/24/2022
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% class character {
    String name;
    String dateOfBirth;
    String address;
    String image;

    public character(String name, String dateOfBirth, String address, String image) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}%>
<%
    ArrayList<character> characters = new ArrayList<>();
    characters.add(new character("luffy", "1983-08-20", "brazil", "img.png"));
    characters.add(new character("zoro", "1983-08-21", "japan", "img_1.png"));
    characters.add(new character("sanji", "1983-08-22", "japan", "img_2.png"));
%>
<%--<table>--%>
<%--    <tr>--%>
<%--        <td>Name</td>--%>
<%--        <td>Date of birth</td>--%>
<%--        <td>Address</td>--%>
<%--        <td>Image</td>--%>
<%--            <% for (character c : characters){%>--%>
<%--    <tr>--%>
<%--    <td><%=c.getName()%></td>--%>
<%--    <td><%=c.getDateOfBirth()%></td>--%>
<%--    <td><%=c.getAddress()%></td>--%>
<%--    <td><img src="<%=c.getImage()%>"></td>--%>
<%--    </tr>--%>
<%--    <%}%>--%>
<%--</table>--%>
<table>
    <tr>
        <th>Name</th>
        <th>Date of birth</th>
        <th>Address</th>

    </tr>
    <c:forEach items="${characters}" var="p">
        <tr>
            <td><c:out value="${p.getName()}"/></td>
            <td><c:out value="${p.getDateOfBirth()}"/></td>
            <td><c:out value="${p.getAddress()}"/></td>
            <td></td>
        </tr>
    </c:forEach>
    <c:out value="${a}"/>
</table>
</body>
</html>
