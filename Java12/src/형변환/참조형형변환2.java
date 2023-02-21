package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환2 {

	public static void main(String[] args) {
		// 클래스형변환 == 참조형형변환
		// 상속일 때만 가능해!!!! 상속상속상속일때만!!!!!! 형젼환이 가능!!!

		// 자동형변환
		ArrayList list = new ArrayList();
		list.add("홍길동"); // Object (큰) <----- String(작)
		list.add(100);// Object (큰) <----- Integer(작)
		list.add(11.22);// Object (큰) <----- Double(작)
		list.add(new JButton("나는 버튼"));// Object (큰) <----- Jbutton(작)

		// 강제형변환
		String name = (String) list.get(0);
		// String이 가지는 메서드 기능을 쓰려면 반드시 String으로 강제 형변환 해주어야 한다.
		System.out.println(name.charAt(0));
		System.out.println(name.length());

		int age = (Integer) list.get(1);
		System.out.println(age + 1);
		
		double jumsu = (Double)list.get(2);
		System.out.println(jumsu+10);
		
		JButton b = (JButton)list.get(3);
		b.setText("나는 진짜 버튼이에오~");
	}

}
