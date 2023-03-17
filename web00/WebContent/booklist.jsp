<%@page import="multi.BookDAO"%>
<%@page import="multi.BookVO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	BookDAO dao = new BookDAO();
    ArrayList<BookVO> list = dao.list();
    
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%
		if (list.size() == 0) {
	%>
	<hr3>등록된 책이 없습니다. </hr3>

	<%
		} else {
	%>
	<table class="table table-dark table-striped">
		<tr>
			<td>TITLE</td>
			<td>WRITER</td>
			<td>IMG</td>
		</tr>
		<%
			for (BookVO bag2 : list) {
		%>
		<tr>
			<td><a href="bookone.jsp?no=<%=bag2.getNo()%>"> 
			<%=bag2.getTitle()%>
			</a></td>
			<td><%=bag2.getWriter()%></td>
			<td><img src="img/<%= bag2.getImg() %>" width ="150" height="150"></td>
		</tr>

		<%
			}
		%>
	</table>
	<%
		}
	%>
</body>
</html>