package 주식정보시스템;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1. 네트워크 연결 성공." + con);

		Document doc = null; // 로컬변수(지역변수) 초기화 수동으로 해줘야함!!!!!
		try {
			doc = con.get();
			Elements list = doc.select(".nav"); // <a class="nav"> 태그를 가져와라!!!!
			System.out.println(list.size());
//			System.out.println(list);
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i);
//				System.out.println(tag1);
				String text1 = tag1.text();
				System.out.println(text1);
			}

			// 클래스가 nav인 태그를 다 가지고 와서 ArrayList를 상속 받은 Elements에 자동으로 넣어준다.
			// [Element, Element, Element(tag)]
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);

	}

}
