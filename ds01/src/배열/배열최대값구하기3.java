package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최대값구하기3 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[10];
		int[] s2 = new int[10];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000);
			s2[i] = r.nextInt(1000);
		}
		
		//오름차순으로 정렬한 다음 맨앞(최소값)
						//  맨끝(최댓값)
		
		Arrays.sort(s); // 원본을 바꿔버림(파괴형 함수)
		
		System.out.println("최소값은 " + s[0]);
		System.out.println("최댓값은 " + s[9]);
		
		if (Arrays.equals(s, s2)) {
			System.out.println("2개의 배열이 같다.");
		} else {
			System.out.println("2개의 배열이 다르다.");
		}
		
		String r1 = Arrays.toString(s);
		String r2 = Arrays.toString(s2);
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("스트링의 글자수 : " + r1.length());
		System.out.println("배열의 개수:" + s.length);
		System.out.println(r1.concat(r2));
		System.out.println(r1.charAt(2));
		System.out.println(r1.endsWith("]"));
		System.out.println(r1.substring(10));
		System.out.println(r1.substring(5, 10));
		System.out.println(r1.contains(r2));
		System.out.println(r1.lastIndexOf("6"));
		System.out.println(r1.toUpperCase());
		System.out.println(r1.toLowerCase());
		System.out.println(r1.length());
		System.out.println(r1.replace("1", "2"));
	}
}
