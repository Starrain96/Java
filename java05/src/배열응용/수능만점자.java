package 배열응용;

import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;

public class 수능만점자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(42);
		
		int jumsu[] = new int[10000];
		
		int man = 0;
		int zero = 0;
		int sum = 0;
		int count = 0;
		int percent = 0;
		double result = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
		}
		for (int x : jumsu) {
			if (x==450) {
				man++;
			}
		}
		System.out.println("만점자는 " + man + "명 입니다.");

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
			if (jumsu[i] == 0) {
				zero++;
			}
		}
		System.out.println("빵점은 " + zero + "명 입니다.");

		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
			result = (double)sum / jumsu.length;
			if (jumsu[i] <= result + 50 && jumsu[i] >= result - 50) {
				count++;
			}
			if (jumsu[i] <=result*1.3 && jumsu[i] >= result*0.7) {
				percent++;
			}
			
		}
		System.out.println("평균 점수는 : " + result + "입니다.");
		System.out.println("평균보다 +-50점인 학생은 " + count + "명 입니다.");
		System.out.println("평균값의 위 아래 각각 30% 범위 안에 있는 사람은 " + percent + "명 입니다.");

	}

}
