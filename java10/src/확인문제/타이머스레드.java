package 확인문제;

import java.util.Date;

//동시에 실행 시키고 싶은 부품인 Thread로 만들어주세요..!
//Thread클래스 상속하면 바로 만들어짐.
public class 타이머스레드 extends Thread { // run() : 동시에 실행될 내용을 run에 넣자
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머>> " + date);
			
			//CPU에게 스레드 쉬는 시간 텀을 알려줍시다..!
			//thread 잠깐 재울 수 있따.
			//cpu는 외부 자원입니다.
			//자바가 외부자원을 연결할 때는 엄청! 위험해!!라는 상황으로 인식
			//만약에 문제가 생기면 어떻게 할지를 코드를 반드시 해줘야 함.
			
			try {
				Thread.sleep(1000); //1초재워라
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
