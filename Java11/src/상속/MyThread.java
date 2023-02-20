package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {
	int x, y;
	JLabel label;

	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon();
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100);
	}

	@Override
	public void run() {
		// 동시에 실행하고 싶은 내용!!
		// 모든 스레드가 오른쪽으로 움직이고 싶음
		// 화면에서는 x
		Random r = new Random();
		int move = r.nextInt(50); // 0~49 이동
		x = x + move;
		label.setBounds(x, y, 100, 100); //다시 위치 조정
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
