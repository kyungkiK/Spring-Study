<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-03-06
  Time: 오후 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>전체 멤버 반환</title>
</head>
<body>
<h2>전체 멤버</h2>


<table>
    <tr>
        <th>id</th>
        <th>이름</th>
    </tr>
    <c:forEach var="to" items="${memberList}">
        <tr>
            <td>${to.id}</td>
            <td>${to.name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
