<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table border=1>
	<tr>
		<td>영화제목</td>
		<td>영화가격</td>
	</tr>
	<tr>
		<td>${vo.title} </td>
		<td>${vo.price}</td>
	</tr>
	<tr>
		<td><a href="http://www.naver.com">문자인증받기</a></td>
	</tr>
</table>