package 부품사용하기;

import 부품만들기.고양이;

public class 냐옹이가냐옹냐옹 {

	public static void main(String[] args) {
		고양이 c1 = new 고양이();
		c1.kg = 2.5;
		c1.sort = "러시안블루";
		c1.냥냥펀치();
		System.out.println("c1의 고양이 체중은 : " + c1.kg + "kg");
		System.out.println("c1의 고양이 종은 : " + c1.sort);

		고양이 c2 = new 고양이();
		c2.kg = 4.5;
		c2.sort = "노르웨이숲";
		c2.꾹꾹이();
		System.out.println("c2의 고양이 체중은 : " + c2.kg + "kg");
		System.out.println("c2의 고양이 종은 : " + c2.sort);
	}

}
