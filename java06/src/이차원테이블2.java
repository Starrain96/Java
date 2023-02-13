import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String header[] = { "a", "b", "c" };
		Integer contents[][] = { // int로 넣고 싶을 때
				{ 1, 2, 3 },
				{ 1, 2, 3 },
				{ 1, 2, 3 },
				{ 1, 2, 3 }
				};
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);

	}
}
