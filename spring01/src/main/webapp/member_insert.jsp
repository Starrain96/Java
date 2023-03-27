<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript"></script>
</head>
<body>
회원가입 화면입니다.
<hr color="red">
<form action="insert.jsp" method="get">
아이디 : <input name="id" value="apple"><br>
비밀번호 : <input name="pw" value="1234"><br> 
이름 : <input name="name" value="LEE"><br>
전화번호 : <input name="tel" value="011"><br>
<button type="submit">서버로전송</button> <!-- 폼 안에서 버튼을 만들면 기본으로 type="submit" 임 -->
</form>
<button type = "button">먹통버튼(아무기능 없음)</button>
</body>
</html>