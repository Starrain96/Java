package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];
		x[0] = 10;
		x[1] = 20;

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		// 우리가족의 성별을 char로 저장.
		char[] gender = { '남', '여', '여', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		String[] name = { "이현병", "이정희", "이현주", "이호준" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		double[] eye = { 1.3, 1.0, 0.2, 0.6 };
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}
		boolean[] food = {true,true,true,true};
		for (int i = 0; i < food.length; i++) {
			System.out.println();
		}
	}

}
