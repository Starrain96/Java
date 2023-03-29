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
<h3>book 작성 화면입니다. </h3>
<hr color="red">
<form action="insert3.multi" method="get">
	name : <input name="name" value="i am king"><br>
	url : <input name="url" value="http://naver.com"><br>
	img : <input name="img" value="ok.jpg"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>book 삭제 화면입니다. </h3>
<hr color="red">
<form action="delete3.multi" method="get">
	id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>book 수정 화면입니다. </h3>
<hr color="red">
<form action="update3.multi" method="get">
	id : <input name="id" value="1"><br>
	name : <input name="name" value="i am 1"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>book 검색 화면입니다. </h3>
<hr color="red">
<form action="one3.multi" method="get">
	id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>

<h3>book 리스트 보기 </h3>
<hr color="red">
<form action="list3.multi" method="get">
	북마크 리스트 보기 >>> <button type="submit">꾸-욱</button>
</form>

</body>
</html>