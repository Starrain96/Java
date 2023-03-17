<%@page import="multi.BookDAO"%>
<%@page import="multi.BookVO"%>
<%@page import="multi.BbsDao"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%
	//자바코드 넣는 부분!!
//HttpServletRequest request = new HttpServletRequest();
// tomcat 은 미리 reqeust 를 만들어서 내장시켜놨어요..!

String no = request.getParameter("no");
// JSP 안에 만들어진 변수는 서버의 RAM에 저장한다.

BookDAO dao = new BookDAO();
dao.delete(no);

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
<hr color = "red">
당신이 삭제를 원하는 책 번호는 <%= no %>

</body>
</html>