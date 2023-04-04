<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">

	$(function() {
		$('#result').empty()
		$.ajax({
			url: "list5",
			success: function(x) {
				$('#result').append(x)
			} //success
		})//ajax
	})//$fun
	
</script>
</head>
<body>
<h1>게시판 리스트</h1>
수정.삭제.댓글쓰기를 할 게시글 제목을 클릭하세요.<br>
<hr color=red>
<a href="weather.jsp"><button>날씨 정보</button></a>
<hr color = red>
<div id = "result" ></div>
</body>
</html>