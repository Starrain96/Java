package 확인문제;

public class PC방 {

	public static void main(String[] args) {
		카운터스레드 c1 = new 카운터스레드();
		타이머스레드 t1 = new 타이머스레드();
		이미지스레드 i1 = new 이미지스레드();
		
		c1.start();
		t1.start();
		i1.start();
	}

}
