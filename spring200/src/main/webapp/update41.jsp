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
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	function history_back() {
		history.back();
	}
	
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "update2",
				data: {
					no: $('#no').val(),
					content: $('#content').val()
				},
				success : function() {
					alert('수정 성공!')
				}//su
			})//aj
		})//b1
	})//fun
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
		번호 : <input id="no" value="<%=no%>"><br>
		내용 : <input id="content" value="<%=content%>"><br>
		<button id = "b1" >서버로 전송</button>
</body>
</html>