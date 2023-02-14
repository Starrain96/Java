package 부품만들기;

public class 고양이 {
	// 성질 : 멤버변수 (종, 체중)
	public double kg;		// 자동초기화 !!! 0
	public String sort; 	// 멤버변수는 자동초기화!! null
	
	// 동작 : 멤버메서드(함수와 동일), 동적인 기능을 수행
	// 		
	public void 꾹꾹이() {
		System.out.println("누워 있는 집사의 위로 올라온다.");
		System.out.println("푸근한 뱃살을 꾹꾹이 한다.");
	}
	
	public void 냥냥펀치() {
		System.out.println("하악질을 하며 손을 올린다.");
		System.out.println("준내 냥냥펀치 풕풕퐉퐉똭톾.");
	}
}
