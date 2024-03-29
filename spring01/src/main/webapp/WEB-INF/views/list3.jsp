<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>

	<c:forEach var="dto" items="${list}">
		<table id="customers">

			<th>ID</th>
			<th>NAME</th>
			<th>URL</th>
			<th>IMG</th>
			<tr>
				<td>${dto.id}</td>
				<td>${dto.name}</td>
				<td><a href="${dto.url}">바로가기</a></td>
				<td><img alt="" src="resources/img/${dto.img}" width="100"
					height="100"></td>
			</tr>
		</table>
		<br>
		<br>
	</c:forEach>
</body>
</html>