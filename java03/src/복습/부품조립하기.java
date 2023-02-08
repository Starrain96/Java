package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 부품조립하기 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400,300);
		f.getContentPane().setBackground(Color.green); // 프레임 배경 색
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 30);
		
		TextField text = new TextField(20);
		text.setBackground(Color.cyan);
		text.setForeground(Color.blue);
		text.setFont(font2);
		
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		f.add(l);
		f.add(text);
		f.add(b);
		
		l.setFont(font);
		l.setForeground(Color.red);
		
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("숫자 맞추기 게임");
		
		f.setVisible(true);
	}

}
