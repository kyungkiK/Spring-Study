<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  int flag = (int)request.getAttribute("flag");

    out.print("<script>");

  if (flag == 0) {
    out.print("alert('회원가입 성공하셨습니다.');");
    out.print("location.href = '/';");
  } else {
    out.print("alert('회원가입 실패하셨습니다.');");
    out.print("location.href = '/guest/join';");
  }
    out.print("</script>");

%>