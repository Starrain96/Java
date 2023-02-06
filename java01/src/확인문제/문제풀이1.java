package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("수업 끝나고 무엇을 할 예정인가요?");
		String b = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		// 처리
		String result = "오늘은 " + b +"이고 수업 후에 나는 " + a + "를 할거야!";

		// 출력
		System.out.println(result);

	}

}
