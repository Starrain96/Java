package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name="홍길동";
		p.age=25;
		System.out.println(p);
		
		맨 man = new 맨();
		man.run();
		
		수퍼맨 s = new 수퍼맨();
		s.name = "클라크";
		s.age = 24123;
		s.power =212312312;
		s.fly = true;
		s.eat();
		
		원더우먼 w = new 원더우먼();
		w.능력="날기";
		w.height=166;
		w.razer();
		w.cut();
	
	}

}
