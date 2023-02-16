package 확인문제;

public class 딸 {
	String 이름;
	char 성별;
	static int 아빠지갑 = 10000;
	static int count;

	public 딸(String 이름, char 성별) {
		super();
		this.이름 = 이름;
		this.성별 = 성별;
		count++;
		아빠지갑 = 아빠지갑 - 1000;
	}

	@Override
	public String toString() {
		return "딸 [이름=" + 이름 + ", 성별=" + 성별 + "]";
	}

	public void tv보다() {

	}
}
