
package 조건문;

import java.util.Date;

public class IF문6 {

	public static void main(String[] args) {

		// Date - 년월일시분초, java.util.Date
			
		Date date = new Date();
		//1. 
		int year = date.getYear()+1900;
		
		if (year>=2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		
		//2.
		
		int day = date.getDate();
		
		switch (day) {
		case 0: case 6:
			System.out.println("쉬~~~~~~~~~~~자");
			break;

		default:
			System.out.println("열심히 공부하자");
			break;
		}
		
		//3. 
		int month = date.getMonth()+1;
		
		switch (month) {
		case 2:
			for (int i = 1; i < 29; i++) {
				System.out.println(month+"월"+i+"일");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		for (int i = 1; i < 31; i++) {
			System.out.println(month+"월"+i+"일");
		}
		break;
		
		default:
			for (int i = 1; i < 32; i++) {
				System.out.println(month+"월"+i+"일");
			}
			break;
		}
		
		//3. 
		
		
		}

}
