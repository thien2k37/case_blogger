<%--
  Created by IntelliJ IDEA.
  User: chopp
  Date: 6/6/2022
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
</h1>

<%--<td>${requestScope["post"].getTitle()}</td>--%>
<%--<td>${requestScope["post"].getView_number()}</td>--%>
<%--<td>${requestScope["post"].getImage()}</td>--%>
<%--<td>${requestScope["post"].getContent()}</td>--%>





<c:forEach var="pos" items="${posts}">
    <tr>
        <td>${pos.title}</td>
        <td>${pos.image}</td>
    </tr>
</c:forEach>
</body>
</html>
