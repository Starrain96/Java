package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		// 자바프로그램과 콘솔(키보드)를 스트림(강물) open!
		sc.close();
		for (int x : numbers) {
			System.out.println(x);
		}
		int count = 0; //33이 몇 개 인지 프린트! 해보자
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]==33) {
				count++;
			}
		}
		System.out.println("33의 개수는 " + count);
	}

}
