package 부품사용하기;

import 부품만들기.TV;

public class TV사용하기 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ch = 10;
		tv1.vol = 9;
		tv1.onOff = true;
		tv1.채널을바꾸다();
		System.out.println(tv1.ch + " " + tv1.vol + " " + tv1.onOff);
		System.out.println(tv1);

		TV tv2 = new TV();
		tv1.ch = 20;
		tv1.vol = 15;
		tv1.onOff = false;
		tv1.유투브보다();
		System.out.println(tv2.ch + " " + tv2.vol + " " + tv2.onOff);
		System.out.println(tv2);
	}
}
