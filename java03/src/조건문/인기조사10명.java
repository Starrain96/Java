package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		//인기투표해봅시다..!
		// 1. 아이유 2. 유재석 3. 이유비
		
		int iu = 0;
		int yu = 0;
		int bi = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표? 1.아이유 2.유재석 3.이유비");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				yu++;
			} else if (data.equals("3")) {
				bi++;
			}
		}
		System.out.println("아이유 : " + iu + "명");
		System.out.println("유재석 : " + yu + "명");
		System.out.println("이유비 : " + bi + "명");
	}

}
