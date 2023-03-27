<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. 브라우저에서 넘어오는 값 서버에서 받아주세요..
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    //2. dao에 데이터값을 주면서 Insert 요청..
    
    //3. 결과가 어떻게 되는지 html에 담아서 클라이언트로 전송해주세요.
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
처리 결과
<hr color="red">
가입 id : <%=id %>
가입 pw : <%=pw %>
가입 name : <%=name %>
가입 tel : <%=tel %>
</body>
</html>