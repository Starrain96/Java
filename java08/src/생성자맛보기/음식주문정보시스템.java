package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문정보시스템 {

	static int count;
	static int count1; // 짜장
	static int count2; // 짱뽕
	static int count3; // 탕수육

	final static int price1 = 5000;
	final static int price2 = 6000;
	final static int price3 = 10000;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(700, 600);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("짜장");
		JButton b2 = new JButton("짬뽕");
		JButton b3 = new JButton("탕수육");
		Font font = new Font("궁서", Font.ITALIC, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.cyan);

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("zzang.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("za.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("짜장: " + count1 + "개 짬뽕: " + count2 + "개 탕수육" + count3 + "개");
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				result.setText("결제금액 : " + total + "원");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("zam.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count2++;
				f.setTitle("짜장: " + count1 + "개 짬뽕: " + count2 + "개 탕수육" + count3 + "개");
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				result.setText("결제금액 : " + total + "원");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("tang.jpg");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count3++;
				f.setTitle("짜장: " + count1 + "개 짬뽕: " + count2 + "개 탕수육" + count3 + "개");
				int total = (count1 * price1) + (count2 * price2) + (count3 * price3);
				result.setText("결제금액 : " + total + "원");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);
	}

}