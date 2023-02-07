package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 더하기계산기 {
	public static void main(String[] args) {
		
		
		JFrame f = new JFrame();
		f.setSize(250, 370);
		
		ImageIcon icon = new ImageIcon("011.jpg");
		
		JLabel text1 = new JLabel();
		text1.setIcon(icon);
		
		JLabel text2 = new JLabel();
		JLabel text3 = new JLabel();
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		b.setText("+");
		b2.setText("-");
		b3.setText("*");
		b4.setText("/");
		
		Font font = new Font("굴림", 1, 20);
		text2.setFont(font);
		text3.setFont(font);
		b.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
	
		text2.setText("숫자 1");
		text3.setText("숫자 2");
		
		f.add(text1);
		f.add(text2);
		f.add(input1);
		f.add(text3);
		f.add(input2);
		f.add(b);
		f.add(b4);
		f.add(b2);
		f.add(b3);
		
		
		text2.setForeground(Color.blue);
		text3.setForeground(Color.blue);
		input1.setBackground(Color.green);
		input1.setForeground(Color.yellow);
		input2.setBackground(Color.green);
		input2.setForeground(Color.yellow);
		b.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.blue);
		
		f.setVisible(true);
	}
}
