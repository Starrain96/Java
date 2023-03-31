<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String code = request.getParameter("code");
	String name = request.getParameter("name");
	%>
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
<a href="airport.jsp"><button>메인으로</button></a><br>
<input type="button" value="이전 페이지로" onclick="history_back()">

	<h3>공항 수정 화면입니다.</h3>
	<hr color="red">
	<form action="update4.multi" method="get">
		code : <input name="code" value="<%=code%>"><br>
		name : <input name="name" value="<%=name%>"><br>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>