package 순차문;
import javax.naming.spi.DirStateFactory.Result;
//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;
public class 순차문2 {
	public static void main(String[] args) {
		//기본 순차문 == 입력--> 처리 --> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!! 사용해보자.!
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오? ");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오?");
		
		//처리 -> 숫자 계산
		//출력 -> 모니터 화면에 보이고 싶음.
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		int result1 = Integer.valueOf(data1) + Integer.valueOf(data2);
		// data1 + (100 + 200);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
}