package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 숫자찾기 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution(12345, 3);
		System.out.println(sol.solution(12345, 3));
		System.out.println(sol.solution(121231, 4));
		System.out.println(sol.solution(15551, 5));
		
		
	}

}

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String nums = Integer.toString(num);
        String a = Integer.toString(k);
        String[] array = nums.split("");
        ArrayList<String> list = new ArrayList(Arrays.asList(array));
        if(list.contains(a)) {
            answer = list.indexOf(a)+1;
            return answer;
        } else {
            return -1 ;
        }
    }
}