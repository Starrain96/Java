package 배열;

public class 배열다루기2 {

	public static void main(String[] args) {

		// 1.
		int[] x = new int[5];

		// 2.
		System.out.println(x.length);
		
		System.out.println("");

		// 3.
		x[0] = 100;
		System.out.println(x[0]);
		
		System.out.println("");
		
		// 4.
		x[4] = 500;
		System.out.println(x[4]);
		
		System.out.println("");
		
		//5.
		x[2]=200;
		System.out.println(x[2]);
		
		System.out.println("");
		
		//6.
		for (int j = 0; j < x.length; j++) {
			System.out.println(x[j]);
		}
		
		System.out.println("");
		
		//7.
		for (int j = 0; j < x.length; j++) {
			System.out.println("인덱스 "+ (j+1)+ " : " +x[j]);
		}
	}

}
