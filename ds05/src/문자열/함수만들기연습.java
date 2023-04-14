package 문자열;

public class 함수만들기연습 {

	public static void 세수하기(String wash) {
		System.out.println(wash + "세안하기.");
	}
	public static void 밥먹기(String food) {
		System.out.println(food + "밥을 먹는다");
	}
	public static void 운동하기(String exercise) {
		System.out.println(exercise + "에서 으쌰으쌰 운동한다");
	}
	public static void 잠자기(String sleep) {
		System.out.println(sleep + "쿨쿨 개꿀잠!");
	}
	
	public static void main(String[] args) {
		세수하기("가볍게");
		밥먹기("아침");
		운동하기("운동장");
		잠자기("낮잠");
		밥먹기("점심");
		세수하기("외출준비");
		밥먹기("저녁");
		운동하기("공원");
		잠자기("저녁");
	}
}