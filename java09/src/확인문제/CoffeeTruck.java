package 확인문제;

public class CoffeeTruck extends Truck{
	String 커피메뉴;
	int 커피가격;
	
	public void 판매하다() {
		System.out.println(커피메뉴+"는 "+커피가격+"원 입니다.");
	}
}
