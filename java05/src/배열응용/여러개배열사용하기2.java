package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 1학기성적이 오른 학생 몇 명?
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}

		System.out.println("1학기 성적보다 오른 학생은 " + count + "명 입니다.");

		// 2. 1학기, 2학기 성적이 동일한 학생 몇명?
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println("1학기, 2학기 성적이 같은 학생은 " + count2 + "명 입니다.");

		// 3. 2학기 학생 중 만점인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("만점자의 이름은 " + names[i] + "이고 " + i + "번 입니다.");
			}
		}

		// 4. 1학기,2학기 성적 각각의 평균 중 누가 더 높았나요???
		int sum = 0;
		int sum2 = 0;
		double avg = 0;
		double avg2 = 0;

		for (int i = 0; i < term2.length; i++) {
			sum = sum + term1[i];
			sum2 = sum2 + term2[i];
			avg = (double) sum / term1.length;
			avg2 = (double) sum2 / term2.length;
		}
		if (avg > avg2) {
			System.out.println("1학기 평균 점수가 더 높습니다.");
		} else if (avg < avg2) {
			System.out.println("2학기 평균 점수가 더 높습니다.");
		} else {
			System.out.println("1학기와 2학기 평균 점수는 같습니다.");
		}

		// 5. 뉴진스의 1학기 성적, 2학기 성적은?

		for (int i = 0; i < names.length; i++) {
			if (names[i] == "뉴진스") {
				System.out.println("뉴진스의 1학기 성적은 " + term1[i] + "입니다.");
				System.out.println("뉴진스의 2학기 성적은 " + term2[i] + "입니다.");
			}
		}

	}

}