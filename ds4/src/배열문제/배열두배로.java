package 배열문제;

public class 배열두배로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution1 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}