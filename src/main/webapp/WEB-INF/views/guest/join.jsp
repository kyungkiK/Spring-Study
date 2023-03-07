<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-03-07
  Time: 오후 4:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h2> 회원 가입 </h2>
<form action="/guest/join" method="post">
    이름 : <input type="text" name="name" placeholder="이름을 입력해주세요" required /> <br>
    이메일 : <input type="email" name="email" placeholder="이메일을 입력해주세요" required /> <br>
    비밀번호 : <input type="password" name="password" placeholder="비밀번호를 입력해주세요" required /> <br>
    <input type="submit" value="가입하기"/>
</form>
</body>
</html>
