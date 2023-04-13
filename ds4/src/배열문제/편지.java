package 배열문제;

import java.util.Arrays;

public class 편지 {

	public static void main(String[] args) {
		String message = "abcd efg";
		String[] array = message.split("");
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
	}

}
class Solution {
    public int solution(String message) {
        String[] array = message.split("");
        return array.length*2;
    }
}