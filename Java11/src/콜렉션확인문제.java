import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 1. 한 번 갔던 여행지는 가지 않으려 고 합니다.
		// 가고 싶은 여행지 5곳을 컬렉션으로 만들어서 프린트.
		ArrayList tour = new ArrayList();
		tour.add("스위스");
		tour.add("몽골");
		tour.add("미국");
		tour.add("캐나다");
		tour.add("인도");
		System.out.println(tour);
		
		// 중복 제거 로 HashSet 으로 했어야 했음..! 중복 제거!!!
		
		HashSet tour1 = new HashSet();
		tour1.add("스위스");
		tour1.add("몽골");
		tour1.add("스위스");
		tour1.add("인도");
		tour1.add("인도");
		System.out.println(tour1);
		
		// 2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는 신발의 정보를
		// 컬렉션으로 만들어서 1)전체 프린트 2)현관 무엇이 있나요? 3) 거실에서 책상을 변경하여 전체프린트

		HashMap home = new HashMap();
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		// 1)
		System.out.println(home);

		// 2)
		System.out.println("현관에는 무엇이 있나요?" + home.get("현관"));

		// 3)
		home.replace("거실", "책상");
		System.out.println(home);

		// 3.
		LinkedList work = new LinkedList();
		work.add("공부");
		work.add("점심");
		work.add("저녁");
		work.add("운동");
		work.add("게임");

		// 1)
		System.out.println(work);
		// 2)
		System.out.println("첫번째 할 일과 마지막 할 일은 " + work.getFirst() + "와 " + work.getLast() + "입니다.");
		// 3)
		work.add(1, "청소");
		System.out.println(work);
		work.remove(2);
		System.out.println(work);
		
		// 순서가 있어서 어레이리스트로!
		ArrayList doList = new ArrayList();
		doList.add("자바공부");
		doList.add("점심");
		doList.add("자바복습");
		doList.add("자바스터디");
		doList.add("쉬기");
		System.out.println(doList);
		System.out.println(doList.get(0));
		System.out.println(doList.get(doList.size()-1));
		doList.set(1, "청소");
		System.out.println(doList);
	}

}
