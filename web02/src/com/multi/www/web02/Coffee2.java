package com.multi.www.web02;

public class Coffee2 {
	int pirce;
	String name;
	
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance() {
		if (coffee2==null) {
			coffee2 = new Coffee2(1000,"라떼");
		}
		return coffee2;
	}
	
	public void drink() {
		System.out.println("마시자~~~~~~~~~~~!!!.");
	}
	
	private Coffee2(int pirce, String name) {
		this.pirce = pirce;
		this.name = name;
	}
	
	
}
