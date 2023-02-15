package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class join {
	
	public void open() {
		JFrame f = new JFrame();
		f.setTitle("회원 가입하기");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.darkGray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 30);
		
		JLabel name = new JLabel("이름");
		name.setForeground(Color.white);
		JLabel year = new JLabel("생년월일");
		year.setForeground(Color.white);
		JLabel ph = new JLabel("핸드폰번호");
		ph.setForeground(Color.white);
		JLabel id = new JLabel("아이디");
		id.setForeground(Color.white);
		JLabel pw = new JLabel("비밀번호");
		pw.setForeground(Color.white);
		name.setFont(font);
		year.setFont(font);
		ph.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		
		JTextField nametext = new JTextField(5);
		JTextField yeartext = new JTextField(8);
		JTextField phtext = new JTextField(13);
		JTextField idtext = new JTextField(5);
		JTextField pwtext = new JTextField(5);
		nametext.setBackground(Color.GRAY);
		yeartext.setBackground(Color.GRAY);
		phtext.setBackground(Color.GRAY);
		idtext.setBackground(Color.GRAY);
		pwtext.setBackground(Color.GRAY);
		nametext.setFont(font);
		yeartext.setFont(font);
		phtext.setFont(font);
		idtext.setFont(font);
		pwtext.setFont(font);
		
		JButton btn = new JButton("저장");
		
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String name = nametext.getText();
				String year = yeartext.getText();
				String ph = phtext.getText();
				String id = idtext.getText();
				String pw = pwtext.getText();

				try {
					FileWriter file = new FileWriter(name+year + ".txt");
					file.write(name + "\n");
					file.write(year + "\n");
					file.write(ph + "\n");
					file.write(id + "\n");
					file.write(pw + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제가 생김..!");
				}
			}
		});
		
		f.add(name);
		f.add(nametext);
		f.add(year);
		f.add(yeartext);
		f.add(ph);
		f.add(phtext);
		f.add(id);
		f.add(idtext);
		f.add(pw);
		f.add(pwtext);
		f.add(btn);
		
		f.setVisible(true);
	}

}
