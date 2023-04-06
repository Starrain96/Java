<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}

a {
  text-decoration-line: none;
}
A:link {text-decoration:none; color:646464;}
A:visited {text-decoration:none; color:646464;}
A:active {text-decoration:none; color:646464;}
A:hover {text-decoration:none; color:646464;}
</style>
</head>
<body>
<TABLE id="customers">
<tr>
<td>검색한 번호</td>
<td>검색한 제목</td>
<td>검색한 내용</td>
<td>검색한 작성자</td>
</tr>

<c:forEach items="${list}" var="bag" >
<tr>
<td>  ${bag.no} </td>
<td>  <a href="one2.multi?no=${bag.no}">${bag.title}</a></td>
<td>  ${bag.content} </td>
<td>  ${bag.writer} </td>
</tr>
</c:forEach>
</TABLE>
</body>
</html>