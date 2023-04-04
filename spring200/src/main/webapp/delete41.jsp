<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<% 
	String no = request.getParameter("no");
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
				url: "delete2",
				data: {
					no: <%=no%>
				},
				success : function() {
					alert('삭제 성공!')
					location.href="ajax_test2.jsp"
				}
			})//ajax
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
<a href="ajax_test2.jsp"><button>메인으로</button></a><br>
<input type="button" value="이전 페이지로" onclick="history_back()">

    <h3>게시글 삭제 화면입니다. </h3>
<hr color="red">
	삭제할 번호 : <input name="no" value="<%=no%>"><br>
	<button id="b1" >서버로 전송</button>
</body>
</html>