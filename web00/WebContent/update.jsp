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
String tel = request.getParameter("tel");

MemberVO bag = new MemberVO();
bag.setId(id);
bag.setTel(tel);

MemberDAO3 dao = new MemberDAO3();
dao.update(bag);

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
<body>회원수정 요청되었음.
<hr color = "red">
수정할 id : <%= id %> <br>
수정된 tel : <%= tel %> 
</body>
</html>