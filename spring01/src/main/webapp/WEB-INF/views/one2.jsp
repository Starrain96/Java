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
	게시판검색 처리 요청이 완료되었습니다.
	<hr color="red">
	번호 : ${bag.no}; <br>
	제목 : ${bag.title}; <br>
	내용 : ${bag.content}; <br>
	작성자 : ${bag.writer}; <br>
</body>
</html>