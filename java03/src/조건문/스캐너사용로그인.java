package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 스캐너사용로그인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		// 1.
//
//		System.out.println("아이디 : ");
//		String id = sc.next();
//		System.out.println("비밀번호 : ");
//		int pw = sc.nextInt();
//
//		if (id.equals("root") && pw == 1234) {
//			System.out.println("로그인 성공!");
//		} else {
//			System.out.println("로그인 실패!");
//		}
//
//		// 2.
//		System.out.println("사과 구매 갯수");
//		int ap = sc.nextInt();
//		System.out.println("사과 개당 가격");
//		int apprice = sc.nextInt();
//
//		System.out.println("딸기 구매 갯수");
//		int st = sc.nextInt();
//		System.out.println("딸기 개당 가격");
//		int stprice = sc.nextInt();
//
//		System.out.println("사과 구매 가격은 " + (ap * apprice) + "원 입니다.");
//		System.out.println("딸기 구매 가격은 " + (st * stprice) + "원 입니다.");
//		System.out.println("전체 구매 가격은 " + ((ap * apprice) + (st * stprice)) + "원 입니다.");

		// 3.
		System.out.println("시작값을 입력");
		int a = sc.nextInt();

		System.out.println("종료값을 입력");
		int b = sc.nextInt();

		for (int i = a + 1; i <= b; i++) {
			a = a + i;
		}
		System.out.println("시작값과 종료값까지 더한 값은 " + a + "입니다.");

		// 4.
		System.out.println("시작값을 입력");
		int c = sc.nextInt();

		System.out.println("종료값을 입력");
		int d = sc.nextInt();

		System.out.println("점프값을 입력");
		int e = sc.nextInt();

		for (int i = c + 1; i <= d; i++) {
			c = c + i +e;
		}
		System.out.println(a);

		sc.close();
	}
}
