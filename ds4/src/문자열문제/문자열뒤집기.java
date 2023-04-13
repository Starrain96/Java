package 문자열문제;

import java.util.Arrays;

public class 문자열뒤집기 {

	public static void main(String[] args) {

	Solution one = new Solution();
	
	String a = one.solution("abcdef");
	
	System.out.println(a);
	}

}


class Solution {
    public String solution(String my_string) {
        String[] array = my_string.split("");
        String[] back = new String[array.length];
        for(int i=0, j=array.length-1; i<array.length; i++) {
            back[j] = array[i];
            j--;
        }
        String answer = Arrays.toString(back);
        answer = answer.replace("[", "");
        answer = answer.replace("]", "");
        answer = answer.replace(", ", "");
        return answer;
    }
}