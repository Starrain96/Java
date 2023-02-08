package 조건문;

import java.util.Scanner;

public class 확인문제1 {
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);// 컴퓨터.키보드
		System.out.println("이름 입력>>");
		String name = sc.next();
		System.out.println("나이 입력>>");
		int age = sc.nextInt();
		System.out.println("취미 입력>>");
		String play = sc.next();

		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age + "세");
		System.out.println("나의 취미는 " + play + "입니다.!");
		
		sc.close();
	}
}