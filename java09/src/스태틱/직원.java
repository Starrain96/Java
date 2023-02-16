package 스태틱;

public class 직원 {
	String 이름;
	int 나이;
	char 성별;
	static int count;
	static int sum;
	static double avg;

	public static void getAvg() {
	
		// static 메서드에서 전역변수를 접근할 때는
		// 같은 성격을 가진 static 변수만 접근이 가능하다..!
		System.out.println(sum/count);
	}
	
	public 직원(String 이름, int 나이, char 성별) {
		count++;
		sum = sum + 나이;
		avg = sum / count;
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
	}

	@Override
	public String toString() {
		return "직원 [이름=" + 이름 + ", 나이=" + 나이 + ", 성별=" + 성별 + "]";
	}
}
