package com.multi.www.web02;

public class MainCar {

	public static void main(String[] args) {
		Car car; //12 4*3
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 6000, 200);
			System.out.println(car); //주소 확인
		}
		
		System.out.println("메모리 크기 >>" + 12 * 1000);
	}

}
