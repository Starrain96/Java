
package 조건문;

import java.util.Date;

public class IF문3 {

	public static void main(String[] args) {

		// Date - 년월일시분초, java.util.Date
		
		Date date = new Date();
		int hour = date.getHours();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		
		System.out.println(date.getYear());
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth()+ 1);
		
		System.out.println(date.getDate()); // 요일! 0부터 시작, 일요
		
		System.out.println(date.getDay());
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14) {
			System.out.println("굿에프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
		//int month = 2;
		int month = date.getMonth();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}
}
