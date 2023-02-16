package 생성자;

public class 은행통장만들기 {

	public static void main(String[] args) {
		
		통장 여행통장 = new 통장("이호준", "96040", 10000);
		통장 주택청약 = new 통장("이호준", "96040", 100000);
		
		System.out.println(여행통장);
		System.out.println(주택청약);

	}

}
