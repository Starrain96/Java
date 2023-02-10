package 배열기본;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용해라~앙기모띠!

		int[] jumsu = new int[5];

//		for (int i = 0; i < jumsu.length; i++) {
//			String data = JOptionPane.showInputDialog("숫자입력");
//			jumsu[i] = Integer.parseInt(data);
//		}
//		for (int i : jumsu) {
//			System.out.print(i + " ");
//		}

		System.out.println("");

		// 합계구하고 평균구하기
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			jumsu[i] = Integer.parseInt(data);
			sum = sum + jumsu[i];

			if (jumsu[i] >= 300) {
				sum1 = sum1 + jumsu[i];
			}
			
			if (jumsu[i] >= 300) {
				System.out.println("인덱스 위치는"+ i );
			}
		}
		int result = sum / jumsu.length;
		System.out.println("평균값은" + result);
		System.out.println("300이상 합계는" + sum1 );
		
		
	}

}
