package LabIntriGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMyFirstGui = new JLabel("My First Gui");
		lblMyFirstGui.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblMyFirstGui.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyFirstGui.setForeground(Color.GREEN);
		lblMyFirstGui.setBackground(Color.BLUE);
		lblMyFirstGui.setOpaque(true);
		contentPane.add(lblMyFirstGui, BorderLayout.NORTH);
		
		JButton btnWest = new JButton("WEST");
		btnWest.setBackground(Color.BLUE);
		btnWest.setOpaque(true);
		
		btnWest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWest.setForeground(SystemColor.activeCaptionText);
		btnWest.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnWest.setBackground(SystemColor.textHighlight);
		btnWest.setOpaque(true);
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("Name: ");
		panel.add(lblName);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setForeground(Color.YELLOW);
		lblHi.setBackground(Color.RED);
		lblHi.setOpaque(true);
		lblHi.setFont(new Font("Heiti TC", Font.ITALIC, 77));
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHi, BorderLayout.CENTER);
	}

}
