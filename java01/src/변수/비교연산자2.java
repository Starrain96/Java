package 변수;

public class 비교연산자2 {

	public static void main(String[] args) {
		// 비교연산자 ==   != > >=
		// 논리형이기에 True False 로만 나옴
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println(id==id2);
		System.out.println(pw==pw2);
		
		//두 조건이 모두 맞아야 함 and 조건
		System.out.println(id==id2 && pw==pw2);
		
		int mem1 = 111;
		int mem2 = 223;
		// || or조건 조건 중 1개만 맞아도 True 
		System.out.println(mem1 == 111 || mem2 ==222);
		
	}

}
