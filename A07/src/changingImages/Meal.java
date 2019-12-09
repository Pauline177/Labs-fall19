package changingImages;

import java.awt.BorderLayout;
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

	
	/**
	 * Arrays of images
	 */
	private ArrayList<Image> proteins = new ArrayList<Image>();
	private ArrayList<Image> fats = new ArrayList<Image>();
	private ArrayList<Image> carbs = new ArrayList<Image>();
	private ArrayList<Image> juice = new ArrayList<Image>();
	
	private int nump = 0;
    private int numf = 0;
    private int numc = 0;
    private int numj = 0;
    
    
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
	 * that includes a label, 
	 * three checkboxes that correspond to three features, and a submit button.
	 */
	public Meal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		////adding pictures to their corresponding arrays
		for (int i = 1; i < 4; i++ ) {
			proteins.add(new ImageIcon(getClass().getResource("p"+ i +".png")).getImage());
			fats.add(new ImageIcon(getClass().getResource("f"+ i +".png")).getImage());
			carbs.add(new ImageIcon(getClass().getResource("c"+ i +".png")).getImage());
			juice.add(new ImageIcon(getClass().getResource("j"+ i +".png")).getImage());
			
		}

		plate();
		
		
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
		
		
		changes(panel,chckbxProtein, chckbxFats, chckbxCarbs, btnSubmit);
	
	}
	
	
	/**
	 * picture panel displays the picture with the three features, 
	 * and each of them is implemented a separate image.
	 * 
	 */
	private void plate() {
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.CENTER);
		panel1.setLayout(new GridLayout(3, 0, 0, 0));
		getContentPane().add(new pictures(), BorderLayout.CENTER);
		
	}
	
	/**
	 * changes all the features, whose check boxes were selected
	 * changes juice when no checkbox is selected.
	 * @param panel
	 * @param chckbxProtein
	 * @param chckbxFats
	 * @param chckbxCarbs
	 * @param btnSubmit
	 */
	private void changes(JPanel panel,JCheckBox chckbxProtein, JCheckBox chckbxFats, JCheckBox chckbxCarbs, JButton btnSubmit  ) {
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					proteinChange(chckbxProtein);
					fatsChange(chckbxFats);
					carbsChange(chckbxCarbs);
				
				
				if(!(chckbxProtein.isSelected())&& !(chckbxFats.isSelected()) && !(chckbxCarbs.isSelected())) {
					juiceChange();
				}
			}
		});
		
	}
	
	/**
	 * displays a different option of protein when checkbox is selected
	 * @param chckbxProtein
	 */
	private void proteinChange(JCheckBox chckbxProtein) {
		if(chckbxProtein.isSelected()) {
			if(nump != 2) {
				nump ++;
			}
			else {
				nump = 0;
			}
		}
	}
	
	/**
	 * displays a different option of fats when checkbox is selected
	 * @param chckbxFats
	 */
	private void fatsChange(JCheckBox chckbxFats) {
		if(chckbxFats.isSelected()) {
			if(numf != 2) {
				numf ++;
			} 
			else {
				numf = 0;
			}
		}
	}
	
	/**
	 * displays a different option of carbs when checkbox is selected
	 * @param chckbxCarbs
	 */
	private void carbsChange(JCheckBox chckbxCarbs) {
		if(chckbxCarbs.isSelected()) {
			if(numc != 2) {
				numc ++;
			} 
			else {
				numc = 0;
			}
		}
	}
	
	/**
	 * displays a different option of juice when none of the 
	 * checkboxes is selected
	 */
	private void juiceChange() {
			if(numj != 2) {
				numj ++;
			} 
			else {
				numj = 0;
			}
		
	}
	
	
	/**
	 *picture panel draws the picture with the four features
	 */
	protected class pictures extends JPanel
    {
		@Override
		public void paint(Graphics g){
			super.paint(g);

			g.drawImage(proteins.get(nump), 150, 25, 100, 100, null);
			g.drawImage(fats.get(numf), 250, 25, 100, 100, null);
			g.drawImage(carbs.get(numc), 150, 125, 200, 100, null);
			g.drawImage(juice.get(numj), 10, 50, 100, 100, null);
			repaint();
     
		}

    }


	
	
}
