package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기3 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		print(num);
		int temp = num[5];
		num[5] = num[0];
		num[0] = temp;
		print(num);
		
		
		swap(num , 5, 1);
	}
	
	public static void swap(int[] num , int x, int y) {
		System.out.println(x + ", " + y);
		int temp = num[y];
		num[y] = num[x];
		num[x] = temp;
		System.out.println(x + ", " + y);
	}
	
	
	
	
	
	
	
	
	
	public static void print(int[] s) {
		System.out.println(Arrays.toString(s));
	}
	
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
}
