<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>메인</title>
</head>
<body>

    <c:if test="${memberInfo != null}">
        ${memberName} 님 안녕하세요 ! <br>
        <a href="/logout"> 로그아웃 </a> <br>

        <c:if test="${memberRole eq 'ROLE_ADMIN'}">
            <a href="#"> 관리자 페이지 이동 </a> <br>
        </c:if>
    </c:if>

    <c:if test="${memberInfo == null}">
        <a href="/login"> 로그인 하기 </a>
    </c:if>

</body>
</html>
