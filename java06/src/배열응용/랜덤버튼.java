package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼 {

	public static void main(String[] args) {
		// 배열에는 기본형만 들어가는 게 아니다..! 참조형도 가능하다!!
		// 정수 실수 문자1 논리 + String Jbutton 기타등등!
		// 기본형은 변수에 값이 저장
		// 참조형은 무조건 주소가 저장

		JFrame f = new JFrame();
		f.setSize(1000, 800);
		// 버튼 200개 들어갈 배열 만들기
		JButton[] buttons = new JButton[200];
		// 버튼 200개를 만들어 배열에 저장
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}

		// 위치를 정해서 넣어주자.
		f.setLayout(null);
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			//위치만 지정
			int x =r.nextInt(800);
			int y =r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}

}
