package 문자열;

public class 문자열긴단어출력 {

	public static void main(String[] args) {
		String s = "i am a boy";
		String[] s2 = s.split(" ");
		int max = s2[0].length();
		String maxString = s2[0];
		for (String x: s2) {
			if (max < x.length()) {
				max = x.length();
				maxString = x;
			}
		}
		System.out.println(maxString);
	}

}
