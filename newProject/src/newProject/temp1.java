package newProject;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class temp1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 500, 500);

		JPanel panel = new JPanel();
		
		panel.setBackground(Color.RED);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
