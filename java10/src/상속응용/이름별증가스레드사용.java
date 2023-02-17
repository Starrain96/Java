package 상속응용;

public class 이름별증가스레드사용 {

	public static void main(String[] args) {
		별증가스레드 star = new 별증가스레드();
		이름증가스레드 name = new 이름증가스레드();
		
		star.start();
		name.start();

	}

}
