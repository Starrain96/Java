package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame {

	DatagramSocket socket;
	JTextArea list;
	JTextField input;

	public 메신저B() {
		try {
			socket = new DatagramSocket(5555);
		} catch (Exception e) {
			// TODO: handle exception
		}
		list = new JTextArea();
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("메신저B");
		setSize(400, 400);
		list.setBackground(Color.green);
		input.setBackground(Color.lightGray);
		list.setEditable(false);

		Font font = new Font("궁서", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// UDP용 소켓이 있어야 함.
					DatagramSocket socket = new DatagramSocket(); // 전화기 역활
					// UDP용 패킷이 있어야 함.(데이터, 터에터의 크기, ip, port)
					String s = input.getText();
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);
					// 소켓을 이용해서 패킷을 보낸다.!
					list.append("나>>" + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close(); // 전화기를 끊겠습니다.
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});

		setVisible(true);
	}

	// 받는 부분 무한루프로 계속 받을 수 있게 먼저 실행해야 한다.
	public void process() {
		while (true) {
			try {
				// 2. 패킷으로 보냈기 때문에 빈 패킷을 만들어두면 ,
				// 빈 패킷 안에는 핀 byte[]이 있어야 한다.
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				// 3. 소켓이 정보를 받아 빈 패킷에다가 넣는다.
				socket.receive(packet);
				// 4. byte[]에 있는 String으로 바꾸어준다.
				System.out.println("너>> " + new String(data));
				list.append("너>>" + new String(data) + "\n");
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	public static void main(String[] args) {
		메신저B name = new 메신저B();
		name.process();
	}

}
