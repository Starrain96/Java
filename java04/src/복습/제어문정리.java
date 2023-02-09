package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

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
//		   - 시작값, 종료값 입력
//		   시작값부터 종료값까지 모두 더해서 출력
//		System.out.print("시작값>> "); // 1, 1000
//		int start = sc.nextInt();
//		System.out.print("종료값>> "); // 10, 2000
//		int end = sc.nextInt();
//
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum = sum + i;
//		}
//		System.out.println("최종 더한 값은 " + sum);

		// 4.
		System.out.println("시작값을 입력");
		int start1 = sc.nextInt();

		System.out.println("종료값을 입력");
		int end1 = sc.nextInt();

		System.out.println("점프값을 입력");
		int jump = sc.nextInt();
		int sum = 0;
		
		for (int i = start1; i <= end1; i = i + jump) {
			sum = sum + i;
			if (sum>=100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 " + sum);

		sc.close();
	}
}
