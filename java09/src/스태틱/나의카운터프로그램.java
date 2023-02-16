package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의카운터프로그램 {

	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel number = new JLabel("0");
		number.setForeground(Color.red);

		Font font = new Font("궁서", Font.BOLD, 150);

		number.setFont(font);

		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});

		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");

			}
		});

		JButton b3 = new JButton("1 빼기");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");

			}
		});

		b1.setBackground(Color.black);
		b2.setBackground(Color.white);
		b3.setBackground(Color.black);
		b1.setForeground(Color.white);
		b2.setForeground(Color.black);
		b3.setForeground(Color.white);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);

		f.setVisible(true);
	}

}
