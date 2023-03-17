<%@page import="multi.BookDAO"%>
<%@page import="multi.BookVO"%>
<%@page import="multi.BbsDao"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="bag" class="multi.BookVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%
	//자바코드 넣는 부분!!
//HttpServletRequest request = new HttpServletRequest();
// tomcat 은 미리 reqeust 를 만들어서 내장시켜놨어요..!

String no = request.getParameter("no");
String content = request.getParameter("content");

BookDAO dao = new BookDAO();
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
<body>게시판 수정 요청되었음.
<hr color = "red">
수정할 책 번호 : <%= no %> <br>
수정할 내용 : <%= content %> 
</body>
</html>