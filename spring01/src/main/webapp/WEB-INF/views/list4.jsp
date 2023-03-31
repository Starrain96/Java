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
<a href="airport.jsp"><button>메인으로</button></a><br>

	<c:forEach var="bag" items="${list}">
		<table id="customers">

			<th>CODE</th>
			<th>NAME</th>
			<th>LATITUDE</th>
			<th>LONGITUDE</th>
			<tr>
				<td>${bag.code}</td>
				<td><a href="one4.multi?code=${bag.code}">${bag.name}</a></td>
				<td>${bag.latitude}</td>
				<td>${bag.longitude}</td>
				
				<%-- <td><a href="${dto.url}">바로가기</a></td>
				<td><img alt="" src="resources/img/${dto.img}" width="100"
					height="100"></td> --%>
			</tr>
		</table>
		<br>
		<br>
	</c:forEach>
</body>
</html>