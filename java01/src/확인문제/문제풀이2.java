package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 40;
		
		// 정수 값을 문자열로 받아서 합쳐버리기~
		System.out.println(String.valueOf(num1)+String.valueOf(num2));
		
		System.out.println("두 수를 더한 값은 " + (num1+num2));
		System.out.println("num1에서 num2를 나눈 값은 " + (num1/num2));
		System.out.println("num1에서 num2를 나눈 값의 나머지는 " + (num1%num2));
		
	}

}
