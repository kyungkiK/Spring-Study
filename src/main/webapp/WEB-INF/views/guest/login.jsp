<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> 로그인 페이지 </title>
</head>
<body>
    <h2> 로그인 </h2>
    <form action="/login" method="post">
        <input type="text" name="name" placeholder="아이디 입력" />
        <input type="password" name="password" placeholder="비밀번호 입력" />
        <input type="submit" value="로그인" />
    </form>
</body>
</html>
