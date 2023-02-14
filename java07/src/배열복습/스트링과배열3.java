package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "  011-245-1234  ";
		// 1.
		String s2 = s.trim();
		System.out.println(s2);

		// 2.
		String[] s3 = s2.split("-");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}

		// 3.

		if (s3[0].equals("011")) {
			System.out.println("SK");
		} else if (s3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}

		// 4.

		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("Oldphone");
		}

		// 5.
		if (s3.length>=10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
