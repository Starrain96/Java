package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		// 입력해보자.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("no/title/content/writer 순으로 입력하시오.");
		String no = sc.next();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		BbsDao dao = new BbsDao();
		dao.insert(no,title,content,writer);
	}

}
