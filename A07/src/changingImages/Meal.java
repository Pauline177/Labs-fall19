/**
 * 
 */
package changingImages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * @author paulinemakoma
 * Assignment:A07
 * Date:Nov 27, 2019
 */
@SuppressWarnings("serial")
public class Meal extends JFrame {
	
	public Plate plate = new Plate();
	private JPanel contentPane;
	private JCheckBox chckbxProteins;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meal frame = new Meal();
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
	public Meal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 10));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblMakeYourMeal = new JLabel("Make your meal:");
		panel.add(lblMakeYourMeal);
		
		chckbxProteins = new JCheckBox("Proteins");
		chckbxProteins.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxProteins);
		
		JCheckBox chckbxFats = new JCheckBox("Fats");
		panel.add(chckbxFats);
		
		JCheckBox chckbxCarbs = new JCheckBox("Carbs");
		panel.add(chckbxCarbs);
		
		JButton btnGetYourMeal = new JButton("Get your meal");
		panel.add(btnGetYourMeal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(400, 400));
		contentPane.add(panel_1, BorderLayout.EAST);
		
		
		plate.setPreferredSize(new Dimension(300, 300));
		panel_1.add(plate);
	}

}
