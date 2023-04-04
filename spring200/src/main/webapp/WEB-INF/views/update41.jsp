<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String no = request.getParameter("no");
	String content = request.getParameter("content");
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
<a href="ajax_test2"><button>메인으로</button></a><br>
<input type="button" value="이전 페이지로" onclick="history_back()">

	<h3>게시글 내용 수정 화면입니다.</h3>
	<hr color="red">
	<form action="update2.multi" method="get">
		번호 : <input name="no" value="<%=no%>"><br>
		내용 : <input name="content" value="<%=content%>"><br>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>