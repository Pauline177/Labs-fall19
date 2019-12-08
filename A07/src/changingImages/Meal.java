/**
 * 
 */
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
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * @author paulinemakoma
 * Assignment:A07 Changing Images
 * Date:Dec 8, 2019
 */
public class Meal extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	///// making an array of and adding images to it
	private ArrayList<ImageIcon> proteins = new ArrayList<ImageIcon>();
	ImageIcon pro1 = new ImageIcon("changingImages/p chicken.jpg");
	ImageIcon pro2 = new ImageIcon("changingImages/p eggs.jpg");
	ImageIcon pro3 = new ImageIcon("changingImages/p tuna.jpg");
	
	private ArrayList<Image> fats = new ArrayList<Image>();
	
	private ArrayList<Image> carbs = new ArrayList<Image>();
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		////adding pictures to the array
		proteins.add(pro1); proteins.add(pro2); proteins.add(pro3);
		
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
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
		
		JPanel panel1 = new JPanel();
		///// adding the changing image
		contentPane.add(panel1, BorderLayout.CENTER);
		panel1.setLayout(new GridLayout(0,1,0,0));
		getContentPane().add(new PlateDesign(), BorderLayout.CENTER);
	}
	
	
	protected class PlateDesign extends JPanel{	
		public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.black);
		g.setColor(Color.WHITE);
		
		
		g.drawArc(5, 10, 200, 200, 0, 117);
		g.drawArc(5, 10, 200, 200, 120, 117);
		g.drawArc(5, 10, 200, 200, 240, 117);
	}
	}
	

	
	private void changes(JCheckBox chckbxProtein, JCheckBox chckbxFats, JCheckBox chckbxCarbs, JPanel panel1, JButton btnSubmit  ) {
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	private void proteinChange(JCheckBox chckbxProtein) {
		proteins.add(pro1); proteins.add(pro2); proteins.add(pro3);
		if(chckbxProtein.isSelected()) {
			
		}
	}
	
	private void FatsChange(JCheckBox chckbxFats) {
		if(chckbxFats.isSelected()) {
			
		}
	}
	
	private void CarbsChange(JCheckBox chckbxCarbs) {
		if(chckbxCarbs.isSelected()) {
			
		}
	}
	
	
}
