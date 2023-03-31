<%@page import="com.multi.mvc01.BbsVO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #4287f5;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<%
	//세션에서 꺼내기
	String id = (String)session.getAttribute("id");
	//모델에서 꺼내기
	BbsVO bag = (BbsVO)request.getAttribute("bag");
	String writer=bag.getWriter();
	if(id.equals(writer)) {
%>
<a href="update2.jsp">
<button style="background: pink">수정</button>
</a>
<a href="delete2.mulit?no=${bag.no}">
<button style="background: pink">삭제</button>
</a>
<% } %>
<a href="list2.jsp">게시물 전체 목록페이지</a>
	게시판검색 처리 요청이 완료되었습니다.
	<hr color="red">
	번호 : ${bag.no}; <br>
	제목 : ${bag.title}; <br>
	내용 : ${bag.content}; <br>
	작성자 : ${bag.writer}; <br>
	
</body>
</html>