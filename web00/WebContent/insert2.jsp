<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%
	//자바코드 넣는 부분!!
//HttpServletRequest request = newHttpServletRequest();
// tomcat 은 미리 reqeust 를 만들어서 내장시켜놨어요..!

String no = request.getParameter("no");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");
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
<body>회원가입 요청되었음.
<hr color = "red">
가입한 no : <%= no %> <br>
가입한 title : <%= title %> <br>
가입한 content : <%= content %> <br>
가입한 writer : <%= writer %>
</body>
</html>