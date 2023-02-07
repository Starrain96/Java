package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		JLabel text22 = new JLabel();
		JLabel text11 = new JLabel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JTextField input1 = new JTextField(5);
		JTextField input2 = new JTextField(5);
		Font font = new Font("궁서", 1 , 20);
		
		text11.setText("아이디");
		text22.setText("패스워드");
		b1.setText("버튼");
		b2.setText("버튼");
		
		b1.setFont(font);
		text11.setFont(font);
		input1.setFont(font);
		text22.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		
		f.add(text11);
		f.add(input1);
		f.add(b1);
		f.add(text22);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);

	}

}
