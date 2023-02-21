package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128 ~ 127
		int i1 = 200; // 4바이트 , -21억 ~ 21억

		i1 = b1; // 자동형변환 큰 < ---- 작

		b1 = (byte) i1; // 강제형변환 작 <----- 큰
		
		//double(큰) <- int(작)
		double d1 = i1;
		i1 = (int) d1;
		int i2 = 2000;
		byte b2 = (byte) i2;      // 범위를 벗어나는 값을 강제 형변환 하면 X
		System.out.println(b2);
	}

}
