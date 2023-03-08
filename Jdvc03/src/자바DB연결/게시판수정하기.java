package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		// 입력해보자.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 게시물의 no를 입력하고 수정할 내용을 적으세요.");
		String no = sc.next();
		String content = sc.next();
		
		BbsDao dao = new BbsDao();
		dao.update(no, content);
	}
}
