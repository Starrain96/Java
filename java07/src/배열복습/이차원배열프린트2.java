package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"스위스한달살이","크루즈여행","히말라야등산하기"},
				{"가나다라마바사","아자차카타하","가갸겨겨교규구"},
				{"우즈벡키스탄다시가기","이집트놀러가기","인도가보기"}
				};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.print(s[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}