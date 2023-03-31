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
	<a href="airport.jsp"><button>메인으로</button></a><br>
	<input type="button" value="이전 페이지로" onclick="history_back()">
	 
	<hr color="red">
	검색한 code : ${bag.code}
	<br> 검색한 name : ${bag.name}
	<br> 검색한 latitude : ${bag.latitude}
	<br> 검색한 longitude : ${bag.longitude}
	<br>
	<a href="update41.jsp?code=${bag.code}&name=${bag.name}"><button>수정하기</button></a>
	<a href="delete41.jsp?code=${bag.code}"><button>삭제하기</button></a>
</body>
</html>