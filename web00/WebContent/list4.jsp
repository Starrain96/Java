<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="multi.BbsDao"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MovieDAO dao = new MovieDAO();
    ArrayList<MovieVO> list = dao.list();
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
<% if(list.size()==0) { %>
<hr3>등록된 영화가 없습니다. </hr3>

<% }else { %>
	<table class="table table-dark table-striped">
		<tr>
			<td>ID</td>
			<td>TITLE</td>
			<td>LOCATION</td>
			<td>DIRECTOR</td>
		</tr>
		<%
			for (MovieVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId() %></td>
			<td><a href="one3.jsp?id=<%=bag2.getId() %>"> <%=bag2.getTitle() %>
			</a></td>
			<td><%=bag2.getLocation() %></td>
			<td><%=bag2.getDirector() %></td>
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