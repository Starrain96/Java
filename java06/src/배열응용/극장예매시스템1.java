package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.event.IIOReadWarningListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(800, 1000);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 45);
		JButton[] btn = new JButton[100];
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들어줍시다..!!

		int[] seat = new int[100];
		// 각 자리에 저장된 값이 0이면 아직 예약 X. 예약 완료시 1로 바꿈!..!

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + 1 + "");
			f.add(btn[i]);
			btn[i].setFont(font);

			// 버튼에 액션기능 추가하기

			btn[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					//이미 해당 좌석 번호가 1로 저장되어 있는지 확인하고, 1이 아니면 예약가능.
					if (seat[no-1]==1) {
						result.setText("예약불가입니다.");
						result.setForeground(Color.blue);
					} else {
						seat[no-1] = 1;
						result.setText(text + "번 예약완료.");
						result.setForeground(Color.red);
						btn[no-1].setEnabled(false);
						btn[no-1].setBackground(Color.gray);
					}
		
				}
			});
		}
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇 개가 1인지 세어서 더해줌
				// 영화 예매비 1장당 1만원, 결제금액 출력
				int count = 0;
				for (int i : seat) {
					if (i == 1) {
						count ++;
					}
				}
				JOptionPane.showMessageDialog(f, (count*10000) + "원 결제해주세요.");
			}
		});
		
		f.setVisible(true);
	}

}
