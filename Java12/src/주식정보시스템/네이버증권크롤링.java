package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codelist = doc.select(".code");
			
			//select("a") : tag <a>
			//select(".code") : <a class="code">
			//select("#userId") : <a id="userId">
			
			System.out.println(codelist.size());
			Element tag = codelist.get(0);
			String code =tag.text();
			System.out.println("코드는 "+code);
			
			Elements textlist = doc.select(".sptxt.sp_txt9");
			System.out.println(textlist.size());
			
			Element text1 = textlist.get(0);
			String text2 = text1.text();
			System.out.println(text2);
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}