<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-03-06
  Time: 오후 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>공부메인</title>
</head>
<body>
 첫번째 멤버는
    아이디는 ${to.id}
    이름은 ${to.name}

 <form action="/index" method="post">
     <input type="text" name="id" /> 번째
     <input type="submit" value="찾기" />
 </form>
</body>
</html>
