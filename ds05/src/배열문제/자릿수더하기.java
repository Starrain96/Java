package 배열문제;

import java.util.Arrays;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 12345;
		String result = Integer.toString(n);
		String[] a = result.split("");
		System.out.println(Arrays.toString(a));
		
		
	}

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = Integer.toString(n);
        String[] a = result.split("");
        return answer;
    }
}