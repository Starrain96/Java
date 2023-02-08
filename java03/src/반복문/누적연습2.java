package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// 1. 숫자 누적
		// 5~300까지 5의 배수만 모두 더하기

		 int five = 0;
		 
		 for (int i = 1; i <= 300; i++) {
			 if (i%5==0) {
				five = five + i;
			}
		}
		 System.out.println("1부터 300까지 5의 배수 합은 : " + five);
		 
		// 2. 문자 누적
		// 먹고 싶은 음식 4가지 입력 받아서
		// 감자랑 고구마랑 딸기랑 커피랑
		String food = "";
		
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고 싶은 음식은? ");
			food = food + data + "랑 ";
		}
		System.out.println(food);
	}
}
