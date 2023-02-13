package 배열응용;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼2 {

	public static void main(String[] args) {
		// 1.프레임 만들기
		JFrame f = new JFrame();
		// 2. 프레임 설정
		f.setSize(1000, 800);
		f.setLayout(null);
		// 3. 버튼을 넣을 배열을 먼저 만들어두세요 500개
		JButton[] buttons = new JButton[500];
		Random r = new Random();
		Color[] colors = {Color.red,Color.blue,Color.white,Color.gray,Color.green,Color.orange};
		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
			int x = r.nextInt(800);
			int y = r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(buttons[i]);
		}
		// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
		f.getContentPane().setBackground(Color.yellow);
	
		f.setVisible(true);

	}

}
