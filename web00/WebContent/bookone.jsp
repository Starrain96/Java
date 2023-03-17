<%@page import="multi.BookVO"%>
<%@page import="multi.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String no = request.getParameter("no"); 
    	
    	BookDAO dao = new BookDAO();
    	BookVO bag2 = dao.one(no);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 책번호는 <%= no %>
<hr color="red">
 <table class="table table-danger table-striped">
 	<tr>
 		<td>책 넘버</td>
 		<td><%= bag2.getNo() %></td>
 	</tr>
 	<tr>
 		<td>제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>저자</td>
 		<td><%= bag2.getWriter() %></td>
 	</tr>
 	<tr>
 		<td>책이미지</td>
 		<td>
 		<img src="img/<%= bag2.getImg() %>" width ="150" height="150">
 		</td>
 	</tr>
 </table>
</body>
</html>