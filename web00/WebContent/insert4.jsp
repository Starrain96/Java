<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BbsDao"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	<!-- VO 불러오고 모든 변수 bag로 넣어버리기~ -->
<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<!-- 브라우저가 보낸 데이터를 받야아 함. ==> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
<%
	//자바코드 넣는 부분!!
//HttpServletRequest request = newHttpServletRequest();
// tomcat 은 미리 reqeust 를 만들어서 내장시켜놨어요..!

/* String id = request.getParameter("id");
String name = request.getParameter("name");
String content = request.getParameter("content");
int price = Integer.parseInt(request.getParameter("price"));
String company = request.getParameter("company");
String img = request.getParameter("img"); */

/* ProductVO bag = new ProductVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(price);
bag.setCompany(company);
bag.setImg(img); */

MovieDAO dao = new MovieDAO();
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
	 등록한 ID : <%=bag.getId()%><br>
	 등록한 제목 : <%=bag.getTitle()%><br>
	 등록한 내용 : <%=bag.getContent()%><br>
	 등록한 장소 : <%=bag.getLocation()%><br>
	 등록한 감독 : <%= bag.getDirector() %>

</body>
</html>