/**
 * @author paulinemakoma
 * Assignment:A09 ListVsSet
 * Date:Dec 7, 2019
 */
package listVsSet;

import java.awt.Color;

public class ColoredSquare {
	
	private int side;
	private Color color;
	
	/**
	 * @param s number of side 
	 * @param c color value
	 */
	public ColoredSquare(int s, Color c) {
		this.side = s;
		this.color = c;
	}
	
	/**
	 * @return area which is side * side
	 */
	public int area() {
		return side*side;
	}
	
	
	
	/**
	 * 2 colored squares should be 
	 * considered equal if they have the same size and	color
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + side;
		return result;
	}

	/**
	 * 2 colored squares should be 
	 * considered equal if they have the same size and	color
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ColoredSquare))
			return false;
		ColoredSquare other = (ColoredSquare) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (side != other.side)
			return false;
		return true;
	}

	/**
	 * return element in this format example: side:14 #0000FF
	 */
	public String toString() {
		return String.format("side:%d #%02X%02X%02X %n",side,color.getRed(), color.getBlue(), color.getGreen() );
	}
}
