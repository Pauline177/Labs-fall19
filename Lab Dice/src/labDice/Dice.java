package labDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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

		
		
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/die-1.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/die-2.png")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/die-3.png")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("/die-4.png")).getImage();
		Image img5 = new ImageIcon(this.getClass().getResource("/die-5.png")).getImage();
		Image img6 = new ImageIcon(this.getClass().getResource("/die-6.png")).getImage();
		
		Random rand = new Random();
		
		
		JButton btnRoll = new JButton("ROLL");
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = rand.nextInt(6)+1;
				if (n == 1) {
					lblNewLabel.setIcon(new ImageIcon(img1));
				} else if (n == 2) {
					lblNewLabel.setIcon(new ImageIcon(img2));
				} else if ( n ==3 ) {
					lblNewLabel.setIcon(new ImageIcon(img3));
				} else if( n == 4) {
					lblNewLabel.setIcon(new ImageIcon(img4));
				}else if( n ==5 ) {
					lblNewLabel.setIcon(new ImageIcon(img5));
				} else if (n ==6){
					lblNewLabel.setIcon(new ImageIcon(img6));
				} else 
					System.out.println(" nothing");
			}
		});
		
		btnRoll.setForeground(Color.RED);
		contentPane.add(btnRoll, BorderLayout.SOUTH);
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		
	}

}
