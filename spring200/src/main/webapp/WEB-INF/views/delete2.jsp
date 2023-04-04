<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function history_back() {
		history.back();
	}
</script>
<style>
body {
	background: #4287f5;
}
</style>
</head>
<body>
	<a href="ajax_test2.jsp"><button>메인으로</button></a>
	<br>
	<input type="button" value="이전 페이지로" onclick="history_back()">
	<hr color="red">
	게시판 삭제 처리 요청이 완료되었습니다.
	<hr color="red">
	
</body>
</html>