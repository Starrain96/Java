package 배열응용;

import java.util.Scanner;


public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] lastyear = new String[3];
		String[] thisyear = new String[3];
		String data="";
		String data2="";
		int count=0;
		
		System.out.print("작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요 =>");
		for (int i = 0; i < thisyear.length; i++) {
			data = sc.next();
			lastyear[i] = data;
		}
		
		System.out.print("올해에 가고 싶었던 곳 세곳을 입력받아 넣으세요 =>");
		for (int i = 0; i < thisyear.length; i++) {
			data2 = sc.next();
			thisyear[i] = data2;
		}
		
		for (int i = 0; i < thisyear.length; i++) {
			
			if (thisyear[i].equals(lastyear[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 " + count + "곳 입니다.");
		sc.close();
	}

}
