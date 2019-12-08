package changingImages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Graphics;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;

/**
 * @author paulinemakoma
 * Assignment:A07 Changing Images
 * Date:Dec 8, 2019
 */
public class Plate1 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plate1 frame = new Plate1();
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
	public Plate1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblMakeYourPlate = new JLabel("Make your plate");
		panel.add(lblMakeYourPlate);
		
		JCheckBox chckbxProtein = new JCheckBox("Protein");
		panel.add(chckbxProtein);
		
		JCheckBox chckbxFats = new JCheckBox("Fats");
		panel.add(chckbxFats);
		
		JCheckBox chckbxCarbs = new JCheckBox("Carbs");
		panel.add(chckbxCarbs);
		
		JButton btnSubmit = new JButton("Submit");
		panel.add(btnSubmit);
	}
	

}
