package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 문자판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(300, 600);
		f.getContentPane().setBackground(Color.darkGray);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel label = new JLabel("문장을 넣으세요. ");

		TextArea area = new TextArea(7, 10);
		label.setForeground(Color.white);

		JButton btn1 = new JButton("글자수카운트");
		JButton btn2 = new JButton("배경색바꾸기");
		JButton btn3 = new JButton("글자색바꾸기");

		label.setFont(font);
		area.setFont(font);
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);

		// 1. text.length(); 글자수 구해줌.
		// 2. area.setBackground(Color.yellow);
		// 3. area.setForeground(Color.red);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
				area.setText("");
				area.setBackground(Color.white);
				area.setForeground(Color.black);

			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
			}
		});

		f.add(label);
		f.add(area);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		f.setVisible(true);
	}

}
