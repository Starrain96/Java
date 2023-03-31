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
<h3>공항 목록보기</h3>
<a href="list4.multi">목록</a>
<hr color="red">
<h3>공항 작성 화면입니다. </h3>
<hr color="red">
<form action="insert4.multi" method="get">
	code : <input name="code" value="01"><br>
	name : <input name="name" value="Landivisiau Air Base"><br>
	latitude : <input name="latitude" value="37.012"><br>
	longitude : <input name="longitude" value="127.221"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>공항 수정 화면입니다. </h3>
<hr color="red">
<form action="update4.multi" method="get">
	code : <input name="code" value="01"><br>
	name : <input name="name" value="Landivisiau Air Base"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>공항 삭제 화면입니다. </h3>
<hr color="red">
<form action="delete4.multi" method="get">
	code : <input name="code" value="01"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>공항 검색 화면입니다. </h3>
<hr color="red">
<form action="one4.multi" method="get">
	code : <input name="code" value="01"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>