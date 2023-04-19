<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
body {
	background: #636163;
}
</style>
</head>
<body>
<div class="container mt-3">
  <h2>회원 정보</h2>
  <p>회원 정보와 선호음식 리스트입니다.</p>            
  <table class="table table-dark">
    <thead>
      <tr>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>선호 음식</th>
      </tr>
    </thead>
	<c:forEach items="${ list}" var="bag">
		<hr color="red">
	<tbody>
      <tr>
        <td>${bag.id}</td>
        <td>${bag.pw}</td>
        <td>${bag.name}</td>
        <td>${bag.favorite}</td>
      </tr>
    </tbody>
	</c:forEach>
	</table>
</div>

</body>
</html>