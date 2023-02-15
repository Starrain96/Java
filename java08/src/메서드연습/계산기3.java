package 메서드연습;

public class 계산기3 {

	// 메서드 이름을 입력값이 다르면, 다 동일하게 써도 괜찮다.
	// 하나의 이름으로 다양한 형태로 구현 가능한다.
	// .....다향성 (overloading)

	public int add(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}
}
