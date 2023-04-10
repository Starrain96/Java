package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

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

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println((i + 1) + "번 째 인덱스에 있습니다.");
			}

			if (numbers[i] == 33.3) {
				System.out.println((i + 1) + "번 째 인덱스에 있습니다.");
			}
		}
	}
}
