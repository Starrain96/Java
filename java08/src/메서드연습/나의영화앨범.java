package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class 나의영화앨범 {

	static int index = 2; // 현재 2 부터 시작
	static int index2 = 5;
	static int index3 = 0;

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의길", "교섭", "바빌론" };
		String[] img = { "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg" };
		String[] jumsu = { "9.28", "9.72", "8.82", "6.26", "8.37" };

		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.gray);

		Font font = new Font("궁서", Font.BOLD, 40);

		// 배치부품을 바꾸어주지 않으면 경계레이아웃을 사용하여 셋팅
		// BorderLayout
		JLabel top = new JLabel(title[index]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.white);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon1 = new ImageIcon(img[index]);
		center.setIcon(icon1);
		f.add(center, BorderLayout.CENTER);

		JLabel bottom = new JLabel(jumsu[index]);
		bottom.setFont(font);
		bottom.setHorizontalAlignment(0);
		bottom.setForeground(Color.red);
		f.add(bottom, BorderLayout.SOUTH);

		JButton left = new JButton("왼쪽");
		left.setFont(font);
		left.setBackground(Color.black);
		left.setForeground(Color.white);
		f.add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					bottom.setText(jumsu[index - 1] + "");
					index--; // index = index - 1; index -= 1;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});

		JButton right = new JButton("오른쪽");
		right.setFont(font);
		right.setBackground(Color.black);
		right.setForeground(Color.white);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					bottom.setText(jumsu[index + 1] + "");
					index++; // index = index + 1; index += 1;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}
}
