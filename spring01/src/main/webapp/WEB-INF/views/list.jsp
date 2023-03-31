<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #4287f5;
}
</style>
</head>
<body>
	<c:forEach items="${ list}" var="bag">
		<hr color="red">
	검색한 id : ${bag.id} <br>
	검색한 pw : ${bag.pw} <br>
	검색한 name : ${bag.name} <br>
	검색한 tel : ${bag.tel} <br>
	</c:forEach>

</body>
</html>