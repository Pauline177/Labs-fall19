package module03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExerciseGui1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciseGui frame = new ExerciseGui();
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
	public ExerciseGui1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.RED);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblVote = new JLabel("VOTE");
		lblVote.setBackground(Color.LIGHT_GRAY);
		lblVote.setForeground(Color.DARK_GRAY);
		lblVote.setOpaque(true);
		lblVote.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		lblVote.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblVote, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		Image rep = new ImageIcon(this.getClass().getResource("Republican-Logo-3.png")).getImage();
		Image dem = new ImageIcon(this.getClass().getResource("Democrat-Logo-2.png")).getImage();
		
		double repv = 0;
		double demv = 0;
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ExerciseGui.class.getResource("/module03/Images/Republican-Logo-3.png")));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ExerciseGui.class.getResource("/module03/Images/Democrat-Logo-2.png")));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		panel.add(lblNewLabel_1);
		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblRepCount = new JLabel("Republican: " + repv);
		panel_1.add(lblRepCount);
		
		JLabel lblDemCount = new JLabel("Democrat: " + demv);
		panel_1.add(lblDemCount);
	}

}
