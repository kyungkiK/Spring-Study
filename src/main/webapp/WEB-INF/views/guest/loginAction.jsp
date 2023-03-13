<%@ page import="com.study.model.MemberTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  MemberTO member = (MemberTO) request.getAttribute("member");

    out.print("<script>");

  if (member != null) {
    out.print("alert('로그인 성공하셨습니다.');");
    out.print("location.href = '/';");
  } else {
    out.print("alert('로그인 실패하셨습니다.');");
    out.print("location.href = '/login';");
  }
    out.print("</script>");

%>