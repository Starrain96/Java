package 확인문제;

public class 내차들 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.가격=6000;
		c1.차종="SUV";
		c1.회사="현대";
		c1.시동걸다();
		
		Truck t1 = new Truck();
		t1.가격=6000;
		t1.차종="SUV";
		t1.회사="현대";
		t1.시동걸다();
		
		t1.트렁크크기=200;
		t1.짐();
		
		CoffeeTruck ct1 = new CoffeeTruck();
		
		ct1.가격=6000;
		ct1.차종="SUV";
		ct1.회사="현대";
		ct1.시동걸다();
		ct1.트렁크크기=200;
		ct1.짐();
		
		ct1.커피메뉴="아이스아메리카노";
		ct1.커피가격=5500;
		ct1.판매하다();

	}

}
