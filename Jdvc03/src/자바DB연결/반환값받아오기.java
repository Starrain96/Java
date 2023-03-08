package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2(); //불꺼!
		
		int result1 = re.add(100, 200);
		System.out.println(result1);
		
		//String data = JOptionPane.showInputDialog("입력"); // "aaa"
		
		double result2 = re.add(22.1, 10);
		System.out.println(result2);
		
		String result3 = re.add("가","나"	);
		System.out.println(result3);
		
		String result4 = re.add(6,"나"	);
		System.out.println(result4);
		
		int [] result5 = re.add();
		result5[0]=100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 = re.getData();
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		System.out.println(result6.getDay());
		
		int result8 = re.getRandom2();
		System.out.println(result8);
		
		ArrayList result9 = re.getList();
		System.out.println(result9.get(0) + " " + result9.get(1));
		result9.set(0,"양파");
		System.out.println(result9);
	}
	

}
