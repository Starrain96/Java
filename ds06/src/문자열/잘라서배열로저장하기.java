package 문자열;

import java.util.Arrays;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		String[] answer = new String[my_str.length()/n];
		String[] array = my_str.split("");
		System.out.println(Arrays.toString(array));
		
		
	}

}

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()/n];
        
        
        return answer;
    }
}