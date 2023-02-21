package 형변환;

import java.awt.List;
import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		
		ArrayList me = new ArrayList();
		
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		//1
		System.out.println(me);
		
		//2
		int money = (Integer)me.get(0);
		System.out.println(money+2000);
		
		//3
		double tall = (double)me.get(1);
		System.out.println(tall+10);
		
		//4
		boolean food = (boolean)me.get(2);
		
		if (food) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		//5
		
		char gender = (char)me.get(3);
		
		if (gender=='남') {
			System.out.println("주민번호는 1,3입니다.");
		} else {
			System.out.println("주민번호는 2,4입니다.");
		}

		//6
		// int <----- Integer <----- Object
		//       오토언박싱              다운캐스팅
		// double <------ Double <------ Object
		//       오토언박싱                   다운캐스팅
	}

}
