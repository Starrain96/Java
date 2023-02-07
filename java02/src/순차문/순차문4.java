package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {
	public static void main(String[] args) {

		// 1.

		String pw = JOptionPane.showInputDialog("암호를 대시오.");

		if (pw.equals("pass")) {
			String result = "들어오세요.";
			System.out.println(result);
		} else {
			String result = "나가세요.";
			System.out.println(result);
		}

		// 2.
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?");

		if (food.equals("자장면")) {
			String result = "중국집으로 가요.";
			System.out.println(result);
		} else if (food.equals("라면")) {
			String result = "분식집으로 가요.";
			System.out.println(result);
		} else if (food.equals("회")) {
			String result = "횟으로 가요.";
			System.out.println(result);
		} else {
			String result = "그냥 안먹어요.";
			System.out.println(result);
		}
		
		//3.
		String a = JOptionPane.showInputDialog("첫 번째 정수를 입력하세요.");
		String b = JOptionPane.showInputDialog("두 번쨰 정수를 입력하세요.");
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		if (aa>bb) {
			System.out.println(aa + "첫 번쨰 정수가 더 큽니다.");
		} else if (aa<bb){
			System.out.println(bb + "두 번쨰 정수가 더 큽니다.");
		} else {
			System.out.println("같은 수 입니다.");
			
		}
		
		//4. 사원번호 
		String no = "A100EX";
		char c = no.charAt(0);
		
		switch (c) {
		case 'A':
			System.out.println("기획팀");
			break;
		case 'B':
			System.out.println("총무팀");
			break;
		case 'C':
			System.out.println("사업팀");
			break;
		default:
			System.out.println("영업팀");
			break;
		}
	}
	
}