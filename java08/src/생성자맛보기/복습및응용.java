package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 복습및응용 {

	public static void main(String[] args) {
		// font, flowlayout,
		// jframe, imageicon, imagelabel
		// idlabel, pwlabel, id입력칸, pw입력칸
		// 로그인버튼, reset 버튼
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(600, 600);
		f.getContentPane().setBackground(Color.darkGray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아   이    디 : ");
		id.setForeground(Color.white);
		JLabel pw = new JLabel("패 스 워 드  : ");
		pw.setForeground(Color.white);
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.jpg");
		Image icon11 = icon1.getImage(); // ImageIcon을 Image로 변환.
		Image icon111 = icon11.getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon1111 = new ImageIcon(icon111); // Image로 ImageIcon 생성

		ImageIcon icon2 = new ImageIcon("login.JPG");

		ImageIcon icon3 = new ImageIcon("reset.png");
		Image icon33 = icon3.getImage(); // ImageIcon을 Image로 변환.
		Image icon333 = icon33.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon3333 = new ImageIcon(icon333); // Image로 ImageIcon 생성

		ImageIcon icon4 = new ImageIcon("join.png");
		Image icon44 = icon4.getImage(); // ImageIcon을 Image로 변환.
		Image icon444 = icon44.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon4444 = new ImageIcon(icon444); // Image로 ImageIcon 생성

		
		top.setIcon(icon1111);

		JTextField idtext = new JTextField(10);
		JTextField pwtext = new JTextField(10);
		idtext.setBackground(Color.GRAY);
		pwtext.setBackground(Color.GRAY);
		idtext.setFont(font);
		pwtext.setFont(font);

		JButton login = new JButton();
		login.setIcon(icon2);
		login.setBackground(Color.darkGray);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idtext.getText(); //root
				String pw2 = pwtext.getText(); //1234
				if (id2.equals("root")&& pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					Write diary = new Write();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});

		JButton reset = new JButton();
		reset.setIcon(icon3333);
		reset.setBackground(Color.darkGray);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				idtext.setText("");
				pwtext.setText("");
			}
		});
		
		JButton join = new JButton();
		join.setIcon(icon4444);
		reset.setBackground(Color.darkGray);
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				join join = new join();
				join.open();
				f.setVisible(false);
			}
		});
		

		f.add(top);
		f.add(id);
		f.add(idtext);
		f.add(pw);
		f.add(pwtext);
		f.add(login);
		f.add(reset);
		f.add(join);
		f.setVisible(true);
	}

}
