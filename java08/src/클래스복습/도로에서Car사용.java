package 클래스복습;

public class 도로에서Car사용 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color="검정색";
		System.out.println(c1.color);
		c1.run();
		
		Car c2 = new Car();
		c2.color="하얀색";
		System.out.println(c2.color);
		c2.up();
	}

}
