<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%
	//자바코드 넣는 부분!!
//HttpServletRequest request = new HttpServletRequest();
// tomcat 은 미리 reqeust 를 만들어서 내장시켜놨어요..!

String id = request.getParameter("id");

MemberDAO3 dao = new MemberDAO3();
dao.delete(id);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>회원삭제 요청되었음.
<hr color = "red">
가입한 id : <%= id %> <br>
</body>
</html>