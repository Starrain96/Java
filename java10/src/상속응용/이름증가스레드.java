package 상속응용;
//동시에 실행 시키고 싶은 부품인 Thread로 만들어주세요..!
//Thread클래스 상속하면 바로 만들어짐.
public class 이름증가스레드 extends Thread { // run() : 동시에 실행될 내용을 run에 넣자
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.print("이호준");
		}
	}
}
