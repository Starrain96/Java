package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		Computer com1 = new AppleComputer();
		BananaComputer com2 = new BananaComputer();
		
		com1.유투브하다();
		com2.인터넷하다();

	}

}
