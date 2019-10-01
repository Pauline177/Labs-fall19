package LabIntriGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class IntroGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroGui frame = new IntroGui();
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
	public IntroGui() {
		
		JLabel lblMyFirstGui = new JLabel("My First Gui");
		lblMyFirstGui.setForeground(Color.GREEN);
		lblMyFirstGui.setBackground(Color.BLUE);
		lblMyFirstGui.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
		lblMyFirstGui.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMyFirstGui, BorderLayout.NORTH);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setBackground(Color.CYAN);
		lblWest.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		getContentPane().add(lblWest, BorderLayout.WEST);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setBackground(Color.RED);
		lblHi.setForeground(Color.YELLOW);
		lblHi.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblHi, BorderLayout.CENTER);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBackground(Color.GRAY);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		getContentPane().add(lblName, BorderLayout.SOUTH);
		
		JLabel lblMyFirstGui = new JLabel("MY First Gui");
		getContentPane().add(lblMyFirstGui, BorderLayout.NORTH);
		
		JLabel lblWest = new JLabel("West");
		getContentPane().add(lblWest, BorderLayout.WEST);
		
		JLabel label_1 = new JLabel("New label");
		getContentPane().add(label_1, BorderLayout.CENTER);
		
		JLabel lblMyFirstGui = new JLabel("My First Gui");
		lblMyFirstGui.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblMyFirstGui.setBackground(Color.BLUE);
		lblMyFirstGui.setOpaque(true);
		lblMyFirstGui.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMyFirstGui, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.GREEN);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblMyFirstGui = new JLabel("My First Gui");
		lblMyFirstGui.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMyFirstGui.setBackground(Color.BLUE)
		panel.add(lblMyFirstGui);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setBackground(SystemColor.textHighlight);
		lblWest.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblWest, BorderLayout.WEST);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setForeground(Color.YELLOW);
		lblHi.setBackground(new Color(255, 0, 0));
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHi, BorderLayout.CENTER);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBackground(Color.GRAY);
		contentPane.add(lblName, BorderLayout.SOUTH);
	}

}
