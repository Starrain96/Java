package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}

		// 자바프로그램과 콘솔(키보드)를 스트림(강물) open!
		sc.close();
		for (double x : numbers) {
			System.out.println(x);
		}
		int count = 0; //33이 몇 개 인지 프린트! 해보자
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]==22.2) {
				count++;
			}
		}
		System.out.println("22.2 의 개수는 " + count);
	}

}
