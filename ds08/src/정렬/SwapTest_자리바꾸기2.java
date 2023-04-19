package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기2 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		print(num);
		//num[0] -- > 6, num[5] --> 9
		int temp = num[5];
		num[5] = num[0];
		num[0] = temp;
		print(num);
	}
	
	public static void print(int[] s) {
		System.out.println(Arrays.toString(s));
	}
	
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
}
