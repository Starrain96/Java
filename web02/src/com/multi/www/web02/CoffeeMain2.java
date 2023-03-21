package com.multi.www.web02;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 coffee2;
		for (int i = 0; i < 1000; i++) {
			coffee2 = Coffee2.getInstance();
			System.out.println(coffee2);
						
		}
	}

}
