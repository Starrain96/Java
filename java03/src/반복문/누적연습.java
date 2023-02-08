package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		// iu = iu + 1
		// sum = sum + i
		// 숫자 누적

		int sum = 0;
		for (int i = 1; i <= 4231; i++) {
			sum = sum + i;
			System.out.println("현재의 합 : " + sum);
		}
		System.out.println("전체 합은 : " + sum);

		// 글자 누적

		String sum2 = "";
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}

}
