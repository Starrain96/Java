<%@page import="com.multi.mvc200.BbsVO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function () {
		$('#b1').click(function () {
			content = $('#reply').val()
			writer = "apple"
			$.ajax({
				url: "insert4",
				data:{
					bbsno: ${bag.no},
					content : content,
					writer : writer
				},
				success: function () {
					$('#result').append(
					"<table border=1><tr><td>내용</td><td>작성자</td></tr><tr><td>"
					+ content +
					"</td><td>"
					+ writer +
					"</td></tr></table><br>")
					$('#reply').val('')
				}
			})
		})
	})
	
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
	<a href="ajax_test2.jsp"><button>메인으로</button></a><br>
<input type="button" value="이전 페이지로" onclick="history_back()">
	<hr color="red">
	번호 : ${bag.no}
	<br> 제목 : ${bag.title}
	<br> 내용 : ${bag.content}
	<br> 작성자 : ${bag.writer}
	<br> 댓글 달기 : <input id="reply">
	<button id="b1">댓글달기</button><br>
	<a href="update41.jsp?no=${bag.no}&content=${bag.content}"><button>수정하기</button></a>
	<a href="delete41.jsp?no=${bag.no}"><button>삭제하기</button></a>
	<hr color = red>
	<div id="result">
	<c:forEach items="${list}" var="bag">
	<table border=1>
	<tr>
	<td>내용</td>
	<td>작성자</td>
	</tr>
	<tr>
	<td>${bag.content}</td>
	<td>${bag.writer}</td>
	</tr>
	</table>
	<br>
	</c:forEach>
	</div>

</body>
</html>