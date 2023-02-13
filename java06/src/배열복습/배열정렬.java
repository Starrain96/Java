package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}

		// 알아서 위치값을 옮겨주면서 하나식 꺼내옵니다~쿠쿠루삥뽕
//		for (int x : jumsu) {
//			System.out.println(x);
//		}
		// 오름차순 or 내림차순
		Arrays.sort(jumsu);
		for (int x : jumsu) {
			System.out.println(x);
		}

		System.out.println(jumsu[0]);
		System.out.println(jumsu[jumsu.length - 1]);

		// 상위 30%, 인원 3000명
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i]; // sum += i;
		}
		System.out.println(sum30 / 3000.0);

		// 하위 30%의 평균
		int sum70 = 0;
		for (int i = 0; i < 3000; i++) {
			sum70 = sum70 + jumsu[i]; // sum += i;
		}
		System.out.println(sum70 / 3000.0);

		String result = Arrays.toString(jumsu); // 비파괴
		System.out.println(result);

	}

}
