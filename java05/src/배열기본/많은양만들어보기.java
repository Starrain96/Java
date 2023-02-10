package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int[] jumsu = new int[999];
		for (int i : jumsu) {
			System.out.print(i);
		}

		System.out.println("=================");

		Random r = new Random();
//		int data = r.nextInt(4) + 1;
//		System.out.println(data);

		for (int i = 0; i < jumsu.length; i++) { //인덱스에 랜덤숫자 넣기!!!
			jumsu[i] = r.nextInt(4) + 1;
		}
		
		for (int i : jumsu) {
			System.out.println(i);
		}
	}

}
