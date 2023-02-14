package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Write {

	public void open() {

		JFrame f = new JFrame();
		f.setTitle("내 일기장");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.darkGray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 30);

		JLabel day = new JLabel("오늘의 날짜");
		day.setForeground(Color.white);
		JLabel title = new JLabel("오늘의 제목");
		title.setForeground(Color.white);
		JLabel content = new JLabel("오늘의 내용");
		content.setForeground(Color.white);
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);

		JTextField daytext = new JTextField(10);
		JTextField titletext = new JTextField(10);
		daytext.setBackground(Color.GRAY);
		titletext.setBackground(Color.GRAY);
		daytext.setFont(font);
		titletext.setFont(font);

		JTextArea contenttext = new JTextArea(5, 10);
		contenttext.setFont(font);

		JButton btn = new JButton("저장");
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String day2 = daytext.getText();
				String title2 = titletext.getText();
				String content2 = contenttext.getText();

				System.out.println(day2 + "" + title2 + "" + content2);

				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제가 생김..!");
				}
				Window.ge
			}
		});

		btn.setFont(font);

		f.add(day);
		f.add(daytext);
		f.add(title);
		f.add(titletext);
		f.add(content);
		f.add(contenttext);
		f.add(btn);

		f.setVisible(true);

	}
}
