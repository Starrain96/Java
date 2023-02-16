package 확인문제;

public class Car extends Object{
	String 회사;
	String 차종;
	int 가격;
	
	public void 시동걸다() {
		System.out.println("부릉부릉 시동걸림");
	}
	
	@Override
	public String toString() {
		return "Car [회사=" + 회사 + ", 차종=" + 차종 + ", 가격=" + 가격 + "]";
	}
}
