package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO2;

public class BBSUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(500, 850);
		
		JLabel l1 = new JLabel("<<게시판글쓰기화면>>");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 글쓴이");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시판가입처리");
		JButton b2 = new JButton("게시판탈퇴처리");
		JButton b3 = new JButton("게시판수정처리");
		JButton b4 = new JButton("게시판검색처리");
		
		
		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", Font.BOLD, 45);
		
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
	
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.getContentPane().setBackground(Color.darkGray);
		
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);
		
		t1.setBackground(Color.lightGray);
		t1.setForeground(Color.black);
		
		t2.setBackground(Color.lightGray);
		t2.setForeground(Color.black);
		
		t3.setBackground(Color.lightGray);
		t3.setForeground(Color.black);

		t4.setBackground(Color.lightGray);
		t4.setForeground(Color.black);
		
		b1.setBackground(Color.LIGHT_GRAY);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.LIGHT_GRAY);
		b4.setBackground(Color.LIGHT_GRAY);
		
		b1.setForeground(Color.black);
		b2.setForeground(Color.black);
		b3.setForeground(Color.black);
		b4.setForeground(Color.black);

		
		f.setVisible(true);
	}

}
