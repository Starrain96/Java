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
  <p>회원 정보 리스트입니다.</p>            
  <table class="table table-dark">
    <thead>
      <tr>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>전화 번호</th>
      </tr>
    </thead>
	<c:forEach items="${list}" var="list">
		<hr color="red">
	<tbody>
      <tr>
        <td>${list.id}</td>
        <td>${list.pw}</td>
        <td>${list.name}</td>
        <td>${list.tel}</td>
      </tr>
    </tbody>
	</c:forEach>
	</table>
</div>

</body>
</html>