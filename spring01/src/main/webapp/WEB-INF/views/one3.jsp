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
    book 검색 성공!
	<hr color="red">
	검색한 id : ${dto.id} <br>
	검색한 name : ${dto.name} <br>
	검색한 url : ${dto.url} <br>
	검색한 img : <img alt="" src="resources/img/${dto.img}" width="100" height="100"> <br>
</body>
</html>