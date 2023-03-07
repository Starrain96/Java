package 자바DB연결;

import java.util.Scanner;

public class 게시판글삭제하기 {

	public static void main(String[] args) {
		// 입력해보자.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 게시물의 no를 입력하세요.");
		String no = sc.next();
		
		BbsDao dao = new BbsDao();
		dao.delete(no);
	}

}
