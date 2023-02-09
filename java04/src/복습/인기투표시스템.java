package 복습;

import java.awt.Button;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0; //아이유
		int bt = 0; //방탄
		int ne = 0; //뉴진스

		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 ==>");
			String data = sc.next();
			
			if (data.equals("1")) {
				iu++;	//카운트 +1
			} else if (data.equals("2")) {
				bt++;	//카운트 +1
			} else if (data.equals("3")) {
				ne++;	//카운트 +1
			} else if (data.equals("4")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		sc.close();

		System.out.println("------------");
		System.out.println("아이유" + iu + "표");
		System.out.println("방탄" + bt + "표");
		System.out.println("뉴진스" + ne + "표");
		System.out.println("------------");
		
		
	}
}
