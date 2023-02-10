package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열 만들기 - 이미 값을 알고 있는 경우

		String tour[] = { "대만 ", "일본 ", "스위스 ", "보스턴 ", "캐나다 " };
		for (String x : tour) {
			System.out.print(x);
		}
		
		System.out.println("");
		
		char color[] = { 'a', 'b', 'c', 'd', 'e' };
		for (char c : color) {
			System.out.print(c);
		}
		
		System.out.println("");
		
		double height[] = { 161.1, 151.2, 124.2, 123.12, 1231.1 };
		for (double d : height) {
			System.out.println(d);
		}
	}
}
