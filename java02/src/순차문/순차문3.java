package 순차문;

//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;
public class 순차문3 {
	public static void main(String[] args) {
		//기본 순차문 == 입력--> 처리 --> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!! 사용해보자.!
		String data1 = JOptionPane.showInputDialog("신장을 입력하시오. ");
		String data2 = JOptionPane.showInputDialog("몸무게를 입력하시오.");
		
		double data11 = Double.parseDouble(data1);
		double data22 = Double.parseDouble(data2);
		
		double result = (data11-data22)*0.9;
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		
	}
}