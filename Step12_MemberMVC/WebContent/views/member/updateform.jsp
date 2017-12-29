<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/member/updateform.jsp</title>
</head>
<body>
<%
	MemberDto dto=(MemberDto)request.getAttribute("dto");
%>
<h3>회원정보 수정 폼 </h3>
<form action="update.do" method="post">
	<input type="hidden" name="num" value="<%=dto.getNum() %>" />
	번호 <input type="text" value="<%=dto.getNum() %>" disabled /><br/>
	이름 <input type="text" name="name" value="<%=dto.getName()%>"/><br/>
	주소 <input type="text" name="addr" value="<%=dto.getAddr()%>"/><br/>
	<button type="submit">수정확인</button>
</form>
</body>
</html>