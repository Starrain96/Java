package 상속응용;

public class 별이름증가감소스레드사용 {

	public static void main(String[] args) {
		별증가스레드 star = new 별증가스레드();
		이름증가스레드 name = new 이름증가스레드();
		감소스레드 감소 = new 감소스레드();
		증가스레드 증가 = new 증가스레드();
		
		star.start();
		name.start();
		감소.start();
		증가.start();
	}

}
