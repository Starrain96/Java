package 배열;

import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		
		//1번
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int min = array[0];
		for (int x : array) {
			if (x<min) {
				x=min;
			}
		}
		System.out.println("최소값은 : " + min + "입니다.");
		
		//2번
		
		Random r = new Random();
		int array2[] = new int[900];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = r.nextInt(100);
		}
		int max = 0;
		for (int j : array2) {
			if (j > max) {
				max = j;
			}
		}
		System.out.println("최댓값은 : " + max + "입니다.");
		
		//3번
		String s1 = "찹좋다";
		String s2 = "진짜좋다";
		s1.equals(s2);
		if (s1.length()>s2.length()) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
		
		//4번
		
		String s3 = "나는 진짜 java progrmmer가 되었어";
		s3= s3.toUpperCase();
		System.out.println(s3.substring(6,20));
		
		//5번
		String s4 = "2056521";
		
		char gender = s4.charAt(0);
		System.out.println(gender);
		
		if (gender =='2') {
			System.out.println("여자입니다.");
		}	else {
			System.out.println("남자입니다.");
		}
		
		//6, 7번
		String s5 =  "[10, 20, 30, 40, 50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5 = s5.trim();
		System.out.println(s5);
		String[] s6 = s5.split(",");
		
		int result1 = Integer.parseInt(s6[0].trim());
		int result2 = Integer.parseInt(s6[1].trim());
		System.out.println(result1);
		System.out.println(result2);
		
		int[] nameint = new int[5];
		int sum = 0;
		for (int i = 0; i < s6.length; i++) {
			nameint[i] = Integer.parseInt(s6[i].trim());
		}
		
		for (int i = 0; i < nameint.length; i++) {
			sum = sum + nameint[i];
		}
		
		System.out.println("모든 수의 합은 " + sum + "입니다.");
		
		for (int i = 0; i < nameint.length; i++) {
			System.out.print(nameint[i]+ " ");
		}
		
	}//main
}//class
