package 배열응용;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("정수를 입력하시오 => ");
			int data = sc.nextInt();
			jumsu[i] = data;
		}

		// 1. 첫 번째 값과 두 번째 값의 합을 더해서 프린트
		System.out.println("두 수의 합은 : "+(jumsu[0] + jumsu[2]));

		// 2.

		String[] a = new String[3];
		for (int i = 0; i < a.length; i++) {
			System.out.print("과목 입력하시오 => ");
			String data = sc.next();
			a[i] = data;
		}
		
		System.out.println(a[0]+"보다는 "+a[2]+" 이지롱");

		sc.close();
	}

}
