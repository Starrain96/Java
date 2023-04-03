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
			$.ajax({
				data:{
					reply: ${'#reply'}.val()
				},
				sucess: function (x) {
					$('#result').append(x)
				}
			})
		})
	})
</script>
<style>
body {
	background: #4287f5;
}
</style>
</head>
<body>
	<a href="bbs.jsp">처음페이지로</a>
	<a href="list2.jsp">게시물 전체 목록페이지</a>
	<hr color="red">
	번호 : ${bag.no};
	<br> 제목 : ${bag.title};
	<br> 내용 : ${bag.content};
	<br> 작성자 : ${bag.writer};
	<br> 댓글 달기 :
	<input id="reply">
	<button id="b1">댓글달기</button>
	<div id="result">
	<c:forEach items="${list}" var="bag">
	<table border=1>
	<tr>
	<td>번호</td>
	<td>게시글번호</td>
	<td>내용</td>
	<td>작성자</td>
	</tr>
	<tr>
	<td>${bag.no}</td>
	<td>${bag.bbsno}</td>
	<td>${bag.content}</td>
	<td>${bag.writer}</td>
	</tr>
	</table>
	<br>
	</c:forEach>
	</div>

</body>
</html>