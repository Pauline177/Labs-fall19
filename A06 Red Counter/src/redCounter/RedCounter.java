
package redCounter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;

/**
 * @author paulinemakoma
 * Assignment:A06 Red Counter
 * Date:Nov 22, 2019
 */

@SuppressWarnings("serial")
public class RedCounter extends JFrame {
	/**
	 * JFrame class that displays 2 labels and a button
	 */
	
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedCounter frame = new RedCounter();
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
	public RedCounter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1, 1));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(0, 0));
		panel_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_1.setPreferredSize(new Dimension(240, 100));
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Red Counter: 00");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setPreferredSize(new Dimension(250, 100));
		lblNewLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setMinimumSize(new Dimension(0, 0));
		panel_2.setPreferredSize(new Dimension(240, 100));
		panel.add(panel_2);
		
		
		JLabel lblClickMe = new JLabel("Click Me");
		/**
		 * count: incremented by 1 when color red is displayed
		 * number: the generated random number
		 */
		lblClickMe.addMouseListener(new MouseAdapter() {
			
			int count = 0;
			int number;
			/**
			 * mouseClicke method displays a color depending 
			 * on the random number that was generated
			 * and increments count by 1 when red is displayed.
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				
				number = (int) (Math.random()*4+1);
			
					if(number == 1) {
						lblClickMe.setBackground(Color.GREEN);
					}else if (number == 2) {
						lblClickMe.setBackground(Color.BLUE);
					}else if (number == 3) {
						lblClickMe.setBackground(Color.RED);
						count++;
						lblNewLabel.setText(String.format("Red Counter: %02d", count));
					}else if (number == 4) {
						lblClickMe.setBackground(Color.ORANGE);
					}else if (number == 5) {
						lblClickMe.setBackground(Color.MAGENTA);
					}

				}	
		});
		
		lblClickMe.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblClickMe.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickMe.setHorizontalTextPosition(SwingConstants.CENTER);
		lblClickMe.setPreferredSize(new Dimension(250, 100));
		lblClickMe.setForeground(Color.WHITE);
		lblClickMe.setBackground(Color.BLUE);
		lblClickMe.setOpaque(true);
		panel_2.add(lblClickMe);
		
		JLabel lblPaulinesGui = new JLabel("Pauline's Gui");
		lblPaulinesGui.setBackground(UIManager.getColor("List.selectionInactiveBackground"));
		lblPaulinesGui.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblPaulinesGui.setPreferredSize(new Dimension(480, 60));
		lblPaulinesGui.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaulinesGui.setOpaque(true);
		contentPane.add(lblPaulinesGui, BorderLayout.SOUTH);
		
	}

}
