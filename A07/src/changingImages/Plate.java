/**
 * 
 */
package changingImages;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import java.awt.Dimension;

/**
 * @author paulinemakoma
 * Assignment:A07
 * Date:Nov 27, 2019
 */
@SuppressWarnings("serial")
public class Plate extends JPanel {
	
	public Plate() {
		
		setBounds(100, 100, 400, 400);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillArc(5, 10, 200, 200, 0, 117);
		g.fillArc(5, 10, 200, 200, 120, 117);
		g.fillArc(5, 10, 200, 200, 240, 117);
	}
	
}
