<%@page import="multi.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	<!-- VO 불러오고 모든 변수 bag로 넣어버리기~ -->
<jsp:useBean id="bag" class="multi.BookVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%

BookDAO dao = new BookDAO();
dao.insert(bag);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
	상품 등록 성공!
	<hr color="red">
	 등록한 ID : <%=bag.getNo() %><br>
	 등록한 제목 : <%=bag.getTitle() %><br>
	 등록한 내용 : <%=bag.getContent() %><br>
	 등록한 저자 : <%=bag.getWriter() %><br>
	 등록한 이미지 : <%= bag.getImg() %>

</body>
</html>