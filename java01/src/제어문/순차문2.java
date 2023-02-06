package 제어문;

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 프로그램을 어떤 순서대로 짜야할까?
		// 입력 : 데이터를 가지고 와라~
		// 처리 : 특정한 작업을 수행
		// 출력 : 처리한 내용을 보여주기~
		
		//입력
		String exercise = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		//처리
		String result = day+ "에 저는 " + exercise + "를 합니다.";
		
		//출력
		System.out.println(result);
	}

}
