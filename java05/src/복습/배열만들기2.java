package 복습;

public class 배열만들기2 {

	public static void main(String[] args) {
		// 배열 만들기 - 이미 값을 알고 있는 경우
		
		String[] hobby = {"run", "book", "swim", "walk"};
		System.out.println(hobby);
		for (int i = 0; i < hobby.length; i++) {
			System.out.println( i+ ": " + hobby[i]);
		}
		
		//for-each 문
		// 출력용!!!
		for (String x : hobby) {
			System.out.println(x);
		}
		
		
		
		
		// 배열 만들기 - 값을 모르고 있는 경우, 공간부터 만들어주자.
		
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		
		for (String x : jobs) {
			System.out.println(x);
		}
		
	}

}
