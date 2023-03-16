<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%
	//자바코드 넣는 부분!!
//HttpServletRequest request = new HttpServletRequest();
// tomcat 은 미리 reqeust 를 만들어서 내장시켜놨어요..!

String id = request.getParameter("id");
// JSP 안에 만들어진 변수는 서버의 RAM에 저장한다.
MemberDAO3 dao = new MemberDAO3();
MemberVO bag2 =dao.one(id);
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
<body>
	회원 <%= bag2.getId() %> 정보 요청 받음!
	<hr color="red">
	당신이 검색을 원하는 번호는
	<%=id%>
	<hr color="red">
	검색한 아이디 : <%= bag2.getId() %>
	<br> 
	검색한 비밀번호 : <%= bag2.getPw() %>
	<br> 
	검색한 이름 :<%= bag2.getName() %>
	<br> 
	검색한 전화번호 :<%= bag2.getTel() %>

</body>
</html>