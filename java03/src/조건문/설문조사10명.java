package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		// 10명에게 배부른가를 물어보자~잇!
		// 배부른 사람 : - 명 , 안 배부른 사람 : - 명

		int full = 0;
		int nofull = 0;

		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1.배부름 2.안 배부름");
			if (data.equals("1")) {
				// full = full + 1;
				full++;
			} else if (data.equals("2")) {
				nofull++;
			} 
		}
		System.out.println("배 부른 사람 : " + full);
		System.out.println("배 부른 사람 : " + nofull);

	}

}
