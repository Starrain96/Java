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
a {
  text-decoration-line: none;
}
</style>
</head>
<body>
<h3>게시판 검색 화면입니다. </h3>
<hr color="red">
<form action="one2.multi" method="get">
	no : <input name="no" value="01"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>게시판 목록보기</h3>
<a href="list2.multi">목록</a>

</body>
</html>