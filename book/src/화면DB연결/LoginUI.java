package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO;
import 자바DB연결.MemberVO;

public class LoginUI {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("로그인 화면");
		f.setSize(500, 550);

		JLabel l1 = new JLabel("< < 로그인 > >");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		JButton b1 = new JButton("로그인하기");
		JButton b2 = new JButton("회원가입하기");

		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", Font.BOLD, 45);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
				MemberDAO dao = new MemberDAO();
				//보내는 쪽 가방 만들기
				MemberVO bag = new MemberVO();
				//입력값 넣기!!!
				bag.setId(id);
				bag.setPw(pw);
				
				//앙 전달해야디~
				int result = dao.login(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "아아아로그인성공");
					RankUI rank = new RankUI();
					rank.open(id);
				} else {
					JOptionPane.showMessageDialog(null, "아아ㅠ로그인실패");
					MemberUI member = new MemberUI();
					member.open();
				}
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberUI member = new MemberUI();
				member.open();
				
			}
		});

		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);

		b1.setFont(font);
		b2.setFont(font);

		f.getContentPane().setBackground(new Color(204, 229, 255));

		l1.setForeground(Color.black);
		l2.setForeground(Color.black);
		l3.setForeground(Color.black);

		t1.setBackground(Color.white);
		t1.setForeground(Color.black);

		t2.setBackground(Color.white);
		t2.setForeground(Color.black);

		b1.setBackground(Color.white);
		b2.setBackground(Color.white);

		b1.setForeground(Color.black);
		b2.setForeground(Color.black);

		f.setVisible(true);
	}

}
