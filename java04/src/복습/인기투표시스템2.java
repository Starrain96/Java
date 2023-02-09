package 복습;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SizeSequence;

public class 인기투표시스템2 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(700,1000);
		
		FlowLayout flow = new FlowLayout();

		JLabel nametext = new JLabel();
		JLabel iutext1 = new JLabel();
		JLabel iutext2 = new JLabel();
		JLabel bttext1 = new JLabel();
		JLabel bttext2 = new JLabel();
		JLabel netext1 = new JLabel();
		JLabel netext2= new JLabel();
		
		ImageIcon icon1 = new ImageIcon("IU.jpg");
		
		Image icon11 = icon1.getImage();  //ImageIcon을 Image로 변환.
		Image icon111 = icon11.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon1111 = new ImageIcon(icon111); //Image로 ImageIcon 생성
		
		ImageIcon icon2 = new ImageIcon("BT.jpg");
		
		Image icon22 = icon2.getImage();  //ImageIcon을 Image로 변환.
		Image icon222 = icon22.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon2222 = new ImageIcon(icon222); //Image로 ImageIcon 생성
		
		ImageIcon icon3 = new ImageIcon("NE.jpg");
		
		Image icon33 = icon3.getImage();  //ImageIcon을 Image로 변환.
		Image icon333 = icon33.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon3333 = new ImageIcon(icon333); //Image로 ImageIcon 생성
		
		
		
		JButton iub1 = new JButton();
		JButton btb1 = new JButton();
		JButton neb1 = new JButton();
		
		iub1.setPreferredSize(new Dimension(300, 300));
		btb1.setPreferredSize(new Dimension(300, 300));
		neb1.setPreferredSize(new Dimension(300, 300));
		
		iub1.setIcon(icon1111);
		btb1.setIcon(icon2222);
		neb1.setIcon(icon3333);
		
		
		Font font1 = new Font("굴림", 1 ,50);
		Font font2 = new Font("굴림", 1 ,30);
		
		nametext.setText("인기 투표 시스템");
		iutext1.setText("아이유 - 라일락");
		bttext1.setText("방탄 - 머시깽이");
		netext1.setText("뉴진스 - 하입보이");
		
		iub1.addActionListener(new ActionListener() {
			int iu = 0;
			public void actionPerformed(ActionEvent e) {
			    
					iu++;
					iutext2.setText(iu + "표");
				
			}
		});
		
		btb1.addActionListener(new ActionListener() {
			int bt = 0;
			public void actionPerformed(ActionEvent e) {
			    
					bt++;
					bttext2.setText(bt + "표");
				
			}
		});
		
		neb1.addActionListener(new ActionListener() {
			int ne = 0;
			public void actionPerformed(ActionEvent e) {
			    
					ne++;
					netext2.setText(ne + "표");
				
			}
		});
		
		
		
		nametext.setFont(font1);
		iutext1.setFont(font2);
		iutext2.setFont(font2);
		bttext1.setFont(font2);
		bttext2.setFont(font2);
		netext1.setFont(font2);
		netext2.setFont(font2);
		
		
		f.setLayout(flow);
		f.add(nametext);
		f.add(iub1);
		f.add(iutext1);
		f.add(iutext2);
		f.add(btb1);
		f.add(bttext1);
		f.add(bttext2);
		f.add(neb1);
		f.add(netext1);
		f.add(netext2);
		
		
		f.setVisible(true);
	}
}
