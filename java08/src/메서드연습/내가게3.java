package 메서드연습;

public class 내가게3 {
	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 6900;
		int count1 = 5; // 오전에 온 손님의 수
		int count2 = 4; // 오후에 온 손님의 수

		// 1.
		int result = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + result + "명입니다.");
		
		//2.
		int result2 = cal3.minus(count1, count2);
		System.out.println("오전 오후 손님수 차이는 " + Math.abs(result2) + "명입니다.");
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.334));
		System.out.println(Math.floor(3.334));
		System.out.println(Math.round(3.334));
		System.out.println(Math.round(3.534));
		System.out.println(Math.sqrt(100)); //루트
		System.out.println(Math.max(100, 200)); 
		System.out.println(Math.min(100, 200)); 
		System.out.println(Math.pow(2, 3)); //2의 3승
		
		//3.
		int result3 = cal3.mul(count1, price);
		System.out.println("오전 결제금액은 " + result3 + "원입니다.");
		
		//4.
		int result4 = cal3.mul(count2, price);
		System.out.println("오후 결제금액은 " + result4 + "원입니다.");
		
		//5.
		int result5 = cal3.add(result3, result4);
		System.out.println("오늘 하루 총 결제금액은 " + result5 + "원입니다.");
		
		//6.
		int result6 = cal3.div(result5, result);
		System.out.println("1인당 평균 결제금액은 " + result6 + "원입니다.");
	}

}
