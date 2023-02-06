package 변수;

public class Test {

	public static void main(String[] args) {
		// 1. 기본 데이터 4가지 + String
		int a = 1; //정수
		double b = 1.1;  //실수
		char c = '가';   //한 글자
		boolean d = true;   //논리
		String e = "가나다라";   //여러 글자
		
		// 2. 산술연산자 +-*/%
		int x = 10;
		int y = 20;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		// 3. 비교 연산자 && ||
		
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x != y && x == y);
		System.out.println(x != y || x == y);
	}

}
