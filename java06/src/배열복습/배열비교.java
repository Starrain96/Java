package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력
		// 배열 하나당 990개..!
		// 랜덤으로 데이터를 입력(Random)
		// 반복문으로 배열의 위치(인덱스)를 옮기면서 데이터를 넣자..!!!

		int[] paper = new int[4000];
		int[] myans = new int[4000];

//		System.out.println(paper.length);
//		System.out.println(myans.length);
//		System.out.println(paper);
//		System.out.println(myans);

		// 처리

		Random r = new Random();

		for (int i = 0; i < myans.length; i++) {
			paper[i] = r.nextInt(4) + 1;
			myans[i] = r.nextInt(4) + 1;

		}
		System.out.println("번호\t:\t답안\t\t내답");
		for (int i = 0; i < myans.length; i++) {
			System.out.println(i + "\t\t" + paper[i] + "\t<->\t" + myans[i]);
		}
		int jumsu = 0;
		for (int i = 0; i < myans.length; i++) {
			if (paper[i] == myans[i]) {
				jumsu++;
			}
		}
		System.out.println("토익 점수는" + jumsu + "입니다.");
	}

}
