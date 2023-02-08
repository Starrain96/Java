package 조건문;

import java.util.Scanner;

public class 확인문제2 {
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);// 컴퓨터.키보드
		System.out.println("이름 입력>>");
		String name = sc.next();
		System.out.println("나이 입력>>");
		int age = sc.nextInt();
		System.out.println("키 입력>>");
		double cm = sc.nextDouble();
		System.out.println("몸무게 입력>>");
		double kg = sc.nextDouble();
		System.out.println("오늘 저녁을 먹었나요? true or false");
		boolean food = sc.nextBoolean();
		System.out.println("나의 목표는>>");
		sc.nextLine();
		String a = sc.nextLine();

		System.out.println("===========================");
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는 " + age + "세 입니다.");
		System.out.println("나의 키는 " + cm + "입니다.");
		System.out.println("나의 몸무게는  " + kg + "입니다.");
		System.out.println("나는 저녁을  " + food + "했습니다.");
		System.out.println("나의 목표는 " + a + "입니다.");

		sc.close();
	}
}