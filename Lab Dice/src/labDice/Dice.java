package labDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice frame = new Dice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//		Icon [] icons = { "file:///Users/paulinemakoma/Downloads/dice/die-1.png", 
//					"file:///Users/paulinemakoma/Downloads/dice/die-2.png", 
//					"file:///Users/paulinemakoma/Downloads/dice/die-3.png", 
//					"file:///Users/paulinemakoma/Downloads/dice/die-4.png", 
//					"file:///Users/paulinemakoma/Downloads/dice/die-5.png", 
//					"file:///Users/paulinemakoma/Downloads/dice/die-6.png" };
		
		JButton btnRoll = new JButton("ROLL");
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				///rolling the dice event will occur here.
				
			}
		});
		btnRoll.setForeground(Color.RED);
		contentPane.add(btnRoll, BorderLayout.SOUTH);
		
		
	}

}
