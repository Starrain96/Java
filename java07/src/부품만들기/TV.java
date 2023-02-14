package 부품만들기;

public class TV {
	// 멤버 변수, 선언이 클래스 바로 아래
	// 클래스 전체 영역에서 사용가능
	// 전역변수 = global 변수
	// 멘버변수는 자동초기화, 전역변수는 자동초기화
	public int ch;
	public int vol;
	public boolean onOff; // false

	public void 채널을바꾸다() {
		int change = 1;
		System.out.println(ch + "에서" + change + "로 바꾸다.");
	}

	public void 유투브보다() { // 메서드를 정의한다..!
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
