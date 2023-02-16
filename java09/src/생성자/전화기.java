package 생성자;

public class 전화기 {
	public 전화기() {
		System.out.println("전화기 객체가 만들어졌음.");
	}

	// 성질 : 멤버변수 (가격, 모양)
	public int price;		// 자동초기화 !!! 0
	public String shape; 	// 멤버변수는 자동초기화!! null
	
	// 동작 : 멤버메서드(함수와 동일), 동적인 기능을 수행
	// 		 인터넷하다, 카톡하다.
	public void 인터넷하다() {
		System.out.println("와이파이연결하다.");
		System.out.println("데이터를 써서 연결하다.");
	}
	
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
}
