package 배열문제;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] array1 = {5, 9, 7, 10};
		int[] array2 = {2, 36, 1, 3};
		int[] array3 = {3,2,6};
		Solution4 sol = new Solution4();
		int[] answer1 = sol.solution(array1);
		int[] answer2 = sol.solution(array2);
		int[] answer3 = sol.solution(array3);
		System.out.println(Arrays.toString(answer1));
		System.out.println(Arrays.toString(answer2));
		System.out.println(Arrays.toString(answer3));

	}
}
class Solution4 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        for(int i = 0, j = num_list.length-1; j<=0; i++, j--) {
            answer[j] = num_list[i];
           
        }
        return answer;
    }
}