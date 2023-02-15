package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 중국집키오스크2 {

	public static void main(String[] args) {

		String[] image = { "zam.jpg", "za.jpg", "tang.jpg" };
		int[] p = { 7000, 6000, 15000 };

		JFrame f = new JFrame("멀티짜장집 키오스크");
		f.setSize(800, 600);
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 20);

		JLabel text1 = new JLabel("개수:");
		TextField textField = new TextField(5);
		JLabel img = new JLabel();
		JLabel price = new JLabel();

		text1.setFont(font2);
		textField.setFont(font);
		price.setFont(font);

		ImageIcon icon1 = new ImageIcon("zzang.png");
		img.setIcon(icon1);

		JButton btn1 = new JButton("짬뽕");
		btn1.setBorderPainted(false);
		btn1.setBackground(Color.red);
		btn1.setForeground(Color.white);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon1 = new ImageIcon(image[0]);
				img.setIcon(icon1);
				String a = textField.getText();
				int result = Integer.parseInt(a) * p[0];
				String result2 = String.valueOf(result);
				price.setText("총 결제금액은 " + result2 + "원");

			}
		});
		JButton btn2 = new JButton("짜장면");
		btn2.setBackground(Color.black);
		btn2.setForeground(Color.white);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon1 = new ImageIcon(image[1]);
				img.setIcon(icon1);
				String a = textField.getText();
				int result = Integer.parseInt(a) * p[1];
				String result2 = String.valueOf(result);
				price.setText("총 결제금액은 " + result2 + "원");

			}
		});
		JButton btn3 = new JButton("탕수육");
		btn3.setBackground(Color.yellow);
		btn3.setForeground(Color.black);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon1 = new ImageIcon(image[2]);
				img.setIcon(icon1);
				String a = textField.getText();
				int result = Integer.parseInt(a) * p[2];
				String result2 = String.valueOf(result);
				price.setText("총 결제금액은 " + result2 + "원");

			}
		});
		
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(text1);
		f.add(textField);
		f.add(img);
		f.add(price);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}
}
