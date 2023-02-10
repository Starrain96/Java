package 배열기본;

import javax.security.auth.x500.X500Principal;
import javax.swing.JOptionPane;

public class 입력받아평균2 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용해라~앙기모띠!

		int[] jumsu = new int[5];

		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			jumsu[i] = Integer.parseInt(data);
		}

		// 1. 합계
		int sum = 0;
		for (int x : jumsu) {
			sum += x;
		}
		System.out.println("전체합계 : " + sum);

		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균 : " + avg);

		// 2. 300이상 숫자만 찾아서 합계
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300 이상 숫자의 합계는 " + sum2);
		
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300이상 값이 저장된 인덱스 : " + i);
			}
		}
	}

}
