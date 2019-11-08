package LabCoin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoinGui extends JFrame {

	private JPanel contentPane;
	private JButton btnCent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
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
	public CoinGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		Image centp = new ImageIcon(this.getClass().getResource("/UsCent.png")).getImage();
		Image nickelp = new ImageIcon(this.getClass().getResource("/UsNickel.png")).getImage();
		Image dimep = new ImageIcon(this.getClass().getResource("/UsDime.png")).getImage();
		Image quarterp = new ImageIcon(this.getClass().getResource("/UsQuarter.png")).getImage();
		
		JLabel lblInformationDisplay = new JLabel("Click on a coin to view weight and diameter");
		
		btnCent = new JButton("");
		btnCent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformationDisplay.setText(Coin.CENT.toString());
			}
		});
		btnCent.setIcon(new ImageIcon(centp));
		panel.add(btnCent);
		
		JButton btnNickel = new JButton("");
		btnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformationDisplay.setText(Coin.NICKEL.toString());
			}
		});
		btnNickel.setIcon(new ImageIcon(nickelp));
		panel.add(btnNickel);
		
		JButton btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformationDisplay.setText(Coin.DIME.toString());
			}
		});
		btnDime.setIcon(new ImageIcon(dimep));
		panel.add(btnDime);
		
		JButton btnQuarter = new JButton("");
		btnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformationDisplay.setText(Coin.QUARTER.toString());
			}
		});
		btnQuarter.setIcon(new ImageIcon(quarterp));
		panel.add(btnQuarter);
		
		
		lblInformationDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblInformationDisplay, BorderLayout.CENTER);
	}

}
