package 자바DB연결;

import java.awt.List;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import javax.security.auth.x500.X500Principal;

public class 반환값연습 {

	public void add2() {
		// 이 부품은 기능을 처리하기 위해서 만든 부품.
		System.out.println("더하기 기능을 수행합니다.");
	}

	public int add(int x, int y ) {
		return x+y;
	}
	
	public double add(Double x, int y ) {
		return x+y;
	}
	
	public String add(String x, String y ) {
		return x+y;
	}
	
	public String add(int x, String y ) {
		return x+y;
	}
	
	public int[] add() {
		int[] x= {1,2,3};
		return x;
	}
	
	public Date getData() {
		Date date = new Date();
		return date;
	}
	
	public Random getRandom() {
		Random r = new Random();
		return r;
	}
	
	public int getRandom2() {
		Random r = new Random();
		return r.nextInt();
	}
	
	public int getHour() {
		Date date = new Date();
		return date.getHours();
	}
	
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add("고구마");
		return list;
	}
	
	public HashSet getSet() {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("펜");
		return bag;
	}
}
