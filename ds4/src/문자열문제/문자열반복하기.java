package 문자열문제;

public class 문자열반복하기 {

	public static void main(String[] args) {
		Solution2 repeat = new Solution2();
		String a = "abc";
		a = repeat.solution(a, 3);
		System.out.println(a);
		
	}
}

class Solution2 {
	public String solution(String my_string, int n) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < 3; j++) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}
}
