package 생성자;

public class TV {
	// 멤버 변수, 선언이 클래스 바로 아래
	// 클래스 전체 영역에서 사용가능
	// 전역변수 = global 변수
	// 멘버변수는 자동초기화, 전역변수는 자동초기화
	public int ch;
	public int vol;
	public boolean onOff; // false
	
	public TV(){ //클래스 이름과 똑같이 만들어야한다. 무조건 보이드로써 보이드 생략.
		
		System.out.println("TV객체가 하나 생성");
	}
//	} //객체 생성할 때 마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게 다시 만들어주세요..!(명시적으로)
//	public  TV(int x, int y, boolean z) {
//		ch = x;
//		vol = y;
//		onOff = z;
//	}
	
	
	public TV(int ch, int vol, boolean onOff) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public void 채널을바꾸다() {
		int change = 1;
		System.out.println(ch + "에서" + change + "로 바꾸다.");
	}

	public void 유투브보다() { // 메서드를 정의한다..!
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
