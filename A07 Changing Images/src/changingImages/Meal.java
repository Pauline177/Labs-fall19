/**
 * 
 */
package changingImages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;

/**
 * @author paulinemakoma
 * Assignment:A07 Changing Images
 * Date:Nov 26, 2019
 */
public class Meal extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel.setPreferredSize(new Dimension(150, 10));
		contentPane.add(panel, BorderLayout.WEST);
		
		JLabel lblMakeYourMeal = new JLabel("Make your meal:");
		lblMakeYourMeal.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		panel.add(lblMakeYourMeal);
		
		JCheckBox chckbxProteins = new JCheckBox("Proteins");
		chckbxProteins.setPreferredSize(new Dimension(125, 23));
		chckbxProteins.setHorizontalTextPosition(SwingConstants.RIGHT);
		chckbxProteins.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chckbxProteins);
		
		JCheckBox chckbxFats = new JCheckBox("Fats");
		chckbxFats.setPreferredSize(new Dimension(125, 23));
		chckbxFats.setHorizontalTextPosition(SwingConstants.RIGHT);
		chckbxFats.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chckbxFats);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("carbohydrates");
		chckbxNewCheckBox.setPreferredSize(new Dimension(125, 23));
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.BOTTOM);
		chckbxNewCheckBox.setVerticalTextPosition(SwingConstants.BOTTOM);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chckbxNewCheckBox);
		
		JButton btnFindMeal = new JButton("Find Meal");
		panel.add(btnFindMeal);
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(340, 30));
		contentPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblP = new JLabel("Display proteins");
		panel_1.add(lblP);
		
		JSeparator separator = new JSeparator();
		panel_1.add(separator);
		
		JLabel lblNewLabel = new JLabel("Display fats");
		panel_1.add(lblNewLabel);
		
		JSeparator separator_2 = new JSeparator();
		panel_1.add(separator_2);
		
		JLabel lblDisplayCarbs = new JLabel("Display carbs");
		panel_1.add(lblDisplayCarbs);
	}

}
