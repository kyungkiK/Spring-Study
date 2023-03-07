
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>마이페이지</title>
</head>
<body>
    <h2> 내 정보 </h2>

    <form action="/mypage" method="post">

        <input type="hidden" name="id" value="${to.id}" />

        <b> 이름 : </b> <input type="text" name="name" value="${to.name}" required /> <br>
        <b> 이메일 : </b> <input type="email" name="email" value="${to.email}" required /> <br>
        <b> 비밀번호 : </b> <input type="password" name="password" required /> <br>
        <input type="submit" value="수정하기" />
    </form>

</body>
</html>
