package LabBallon;

/**
 * @Assignement LabBalloon
 * @author paulinemakoma
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class BalloonApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonApp frame = new BalloonApp();
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
	public BalloonApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabBalloon.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		contentPane.add(lblLabBalloon, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(BalloonApp.class.getResource("/images/Republican-Logo-3.png")));
		label.setBorder(new EmptyBorder(0, 10, 10, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(BalloonApp.class.getResource("/images/Democrat-Logo-2.png")));
		label_1.setBorder(new EmptyBorder(0, 10, 10, 0));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		Random rand = new Random();
		
		Image i20 = new ImageIcon(this.getClass().getResource("/balloon20.jpg")).getImage();
		Image i40 = new ImageIcon(this.getClass().getResource("/balloon40.jpg")).getImage();
		Image i60 = new ImageIcon(this.getClass().getResource("/balloon60.jpg")).getImage();
		Image i80 = new ImageIcon(this.getClass().getResource("/balloon80.jpg")).getImage();
		Image i100 = new ImageIcon(this.getClass().getResource("/balloon100.jpg")).getImage();
		
		
		JButton btnGet = new JButton("Get Random Balloon");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int firstRand = rand.nextInt(5)+1;
				int secondRand = rand.nextInt(5)+1;
				
				boolean bool1 = rand.nextBoolean();
				boolean bool2 = rand.nextBoolean();
				
				Size size1;
				Size size2;
				
				if(firstRand == 1) {
					size1 = Size.XS;
					label.setIcon(new ImageIcon(i20));
					if(bool1) {
						lblNewLabel.setText("XS helium");
						} else{
						lblNewLabel.setText("XS air");}
					
				}else if(firstRand == 2) {
					size1 = Size.S;
					label.setIcon(new ImageIcon(i40));
					if(bool1) {
						lblNewLabel.setText("S helium");
						} else{
						lblNewLabel.setText("S air");}
					
				}else if(firstRand == 3) {
					size1 = Size.M;
					label.setIcon(new ImageIcon(i60));
					if(bool1) {
						lblNewLabel.setText("M helium");
						} else{
						lblNewLabel.setText("M air");}
				}else if(firstRand == 4) {
					size1 = Size.L;
					label.setIcon(new ImageIcon(i80));
					if(bool1) {
						lblNewLabel.setText("L helium");
						} else{
						lblNewLabel.setText("L air");}
				}else  {
					size1 = Size.XL;
					label.setIcon(new ImageIcon(i100));
					if(bool1) {
						lblNewLabel.setText("XL helium");
						} else{
						lblNewLabel.setText("XL air");}
				}
				
				
				if(secondRand == 1) {
					size2 = Size.XS;
					label_1.setIcon(new ImageIcon(i20));
					if(bool2) {
						lblNewLabel_1.setText("XS helium");
						} else{
						lblNewLabel_1.setText("XS air");}
				}else if(secondRand == 2) {
					size2 = Size.S;
					label_1.setIcon(new ImageIcon(i40));
					if(bool2) {
						lblNewLabel_1.setText("S helium");
						} else{
						lblNewLabel_1.setText("S air");}
				}else if(secondRand == 3) {
					size2 = Size.M;
					label_1.setIcon(new ImageIcon(i60));
					if(bool2) {
						lblNewLabel_1.setText("M helium");
						} else{
						lblNewLabel_1.setText("M air");}
				}else if(secondRand == 4) {
					size2 = Size.L;
					label_1.setIcon(new ImageIcon(i80));
					if(bool2) {
						lblNewLabel_1.setText("L helium");
						} else{
						lblNewLabel_1.setText("L air");}
				}else  {
					size2 = Size.XL;
					label_1.setIcon(new ImageIcon(i100));
					if(bool2) {
						lblNewLabel_1.setText("XL helium");
						} else{
						lblNewLabel_1.setText("XL air");}
				}
				
				
				
				Balloon b1 = new Balloon(size1, bool1);
				Balloon b2 = new Balloon(size2, bool2);
				
				if(b1.equals(b2)) {
					label_2.setText("Balloons are equal");
					label_2.setBackground(Color.GREEN);
				}else {
					label_2.setText("Balloons are not equal");
					label_2.setBackground(Color.RED);

				}
		
			}
		});
		panel_1.add(btnGet);
		panel_1.add(label_2);
		
		
	}

}
