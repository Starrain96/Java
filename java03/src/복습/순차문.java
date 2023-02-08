package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 두 개의 숫자를 입력을 받아서 더하기 연산
		String a = JOptionPane.showInputDialog("첫 번 째 정수를 입력하시오");
		String b = JOptionPane.showInputDialog("첫 번 째 정수를 입력하시오");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		System.out.println(a1/b1);
		System.out.printf("%.3f", (double)a1/b1);
	}

}
