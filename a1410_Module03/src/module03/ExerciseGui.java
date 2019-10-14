package module03;

/**
 * @author paulinemakoma
 * Assignment Module03
 * Date 10/09/2019
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

/**
 * 
 *repv number of Republicans votes
 *demv number of Democrats votes
 *
 */
public class ExerciseGui extends JFrame {
	private int repv = 0;
	private int demv = 0;
	
	private JPanel contentPane;
	private JTextArea textArea;

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

		
		Image img6 = new ImageIcon(this.getClass().getResource("/Democrat-Logo-2.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/Republican-Logo-3.png")).getImage();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		

		textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setFont(new Font("Kefa", Font.PLAIN, 13));
		textArea.setMargin(new Insets(0, 0, 0, 100));
		textArea.setText("Republican: " + String.format("%02d", repv));
		panel_1.add(textArea);
		

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.DARK_GRAY);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setMargin(new Insets(0, 40, 0, 0));
		textArea_1.setText("Democrat: " + String.format("%02d", demv));
		panel_1.add(textArea_1);
		
		JLabel lblVote = new JLabel("vote");
		lblVote.setFont(new Font("Kefa", Font.BOLD, 26));
		lblVote.setBackground(Color.LIGHT_GRAY);
		lblVote.setForeground(Color.DARK_GRAY);
		lblVote.setOpaque(true);
		lblVote.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblVote, BorderLayout.NORTH);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(15, 15, 15, 15));
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		
		JButton lblRep = new JButton("");
		lblRep.setMargin(new Insets(15, 15, 15, 15));
//		lblRep.setMargin(new Insets(0,0,0,15));
		lblRep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repv++;
				if (repv > 99) {
					repv = 0;
				}
				textArea.setText("Republican: " + String.format("%02d", repv));
				
				
				
			}
		});
		lblRep.setHorizontalAlignment(SwingConstants.CENTER);
		lblRep.setIcon(new ImageIcon(img1));
		panel.add(lblRep);
		
		
		JButton lblDem = new JButton("");
		lblDem.setMargin(new Insets(15, 15, 15, 15));
//		lblDem.setMargin(new Insets(0,0,15,0));
		lblDem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				demv++;
				if (demv > 99) {
					demv = 0;
				}
				textArea_1.setText("Democrat: " + String.format("%02d", demv));
				
			}
		});
		lblDem.setHorizontalAlignment(SwingConstants.CENTER);
		lblDem.setIcon(new ImageIcon(img6));
		panel.add(lblDem);
		
		
	}

}
