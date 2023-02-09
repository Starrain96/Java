package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random(); //씨앗값 <<<
		int target = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		while (true) {
			System.out.println("생각한 정답은?");
			count++;
			int data = sc.nextInt();
			if (data == target) {
				System.out.println("정답");
				System.out.println("당신의 시도 횟수는 " + count);
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				
				System.out.println("오답");
				System.out.println("다시 시도하세요 :> ");
				if (target<data) {
					System.out.println("값이 커요~");
				} else {
					System.out.println("값이 작아요~");
				}
			} 
		}
		sc.close();
	}
}
