
package 배열기본;

import java.util.Random;

public class 많은양마들어보기2 {

	public static void main(String[] args) {

		int[] jumsu2 = new int[1000];

		Random r = new Random(42);

		// 2부터 20까지 임의로 만들어서 배열에 넣기.
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;

			if (jumsu2[i] >= 15) {
				count++;
				sum = jumsu2[i] + sum;
			}
		}

		for (int i : jumsu2) {
			System.out.println(i);
		}

		System.out.println("15 이상의 숫자는 " + count + "개 입니다.");
		System.out.println("15 이상의 숫자의 합은 :  " + sum);
	}

}
