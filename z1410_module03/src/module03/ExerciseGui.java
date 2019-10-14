package module03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import newProject.ExerciseGui;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class ExerciseGui extends JFrame {

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
	
	public ExerciseGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		Image rep = new ImageIcon(this.getClass().getResource("Republican-Logo-3.png")).getImage();
		Image dem = new ImageIcon(this.getClass().getResource("Democrat-Logo-2.png")).getImage();
		
		JLabel lblVote = new JLabel("vote");
		lblVote.setFont(new Font("Kefa", Font.BOLD, 26));
		lblVote.setBackground(Color.LIGHT_GRAY);
		lblVote.setForeground(Color.DARK_GRAY);
		lblVote.setOpaque(true);
		lblVote.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblVote, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblRep = new JLabel("");
		lblRep.setHorizontalAlignment(SwingConstants.CENTER);
		lblRep.setIcon(new ImageIcon(ExerciseGui.class.getResource("/module03/Images/Republican-Logo-3.png")));
		panel.add(lblRep);
		
		
		JLabel lblDem = new JLabel("");
		lblDem.setIcon(new ImageIcon(ExerciseGui.class.getResource("/module03/Images/Democrat-Logo-2.png")));
		lblDem.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblDem);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblRep_1 = new JLabel("rep");
		panel_1.add(lblRep_1);
		
		JLabel lblDem_1 = new JLabel("dem");
		lblRep.setIcon(new ImageIcon(ExerciseGui.class.getResource("/Democrat-Logo-2.png")));
		panel_1.add(lblDem_1);
		
		
		
		
	}
	
	

}
