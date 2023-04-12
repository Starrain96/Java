package 배열문제;

import java.util.Arrays;

public class 나누어떨어지는숫자배열정렬리턴 {

	public static void main(String[] args) {
		int[] array1 = {5, 9, 7, 10};
		int[] array2 = {2, 36, 1, 3};
		int[] array3 = {3,2,6};
		Solution11 sol = new Solution11();
		int[] answer1 = sol.solution(array1, 5);
		int[] answer2 = sol.solution(array2, 1);
		int[] answer3 = sol.solution(array3, 10);
		System.out.println(Arrays.toString(answer1));
		System.out.println(Arrays.toString(answer2));
		System.out.println(Arrays.toString(answer3));
		
	}
}

class Solution11 {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]%divisor == 0 ) {
                count++;
            }
        }
        
        if (count == 0) {
            int answer[] = {-1};
            return answer;
        }
        
         int[] answer = new int[count];
        
        for(int i = 0 , k = 0; i<arr.length; i++) {
            if(arr[i]%divisor ==0 ) {
                answer[k] = arr[i];
                k++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}