package 메서드연습;

public class 계산기2 {
	
	// 메서드 이름을 입력값이 다르면, 다 동일하게 써도 괜찮다.
	// 하나의 이름으로 다양한 형태로 구현 가능한다.
	// .....다향성 (overloading)
	
	public int add(int x, int y) {
		return x + y;
	}

	public double add(int x, Double y) {
		return x + y;
	}

	public double add(Double x, Double y) {
		return x + y;
	}

	public String add(String x, int y) {
		return x + y;
	}
}
