package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/haha2")
public class Hi2 extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String data = request.getParameter("data");
	System.out.println("데이터는 "+data+"입니다.");
	PrintWriter out = response.getWriter();
	//PrintWriter는 브라우저에 응답할 때 문자를 줄 수 있는 부품.
	out.print("<!DOCTYPE html>\n" + 
			"<html>\n" + 
			"<head>\n" + 
			"<meta charset=\"UTF-8\">\n" + 
			"<title>Insert title here</title></head>\n" + 
			"<body>");
	out.print("<h3>");
	out.print("i am a web programmer");
	out.print("</h3></body></html>");
	out.close();
	}

}
