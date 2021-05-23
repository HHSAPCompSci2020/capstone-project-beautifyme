
/**
* This class represents a single Pixel that is within a photograph
* It allows the user to change the color of the pixel and get the color of the pixel.
* @author Mana Nagampalli, Mira Shlimenzon, and JavaDip (for the basic idea of the Pixel)
* @version 3.0 on 5/23
* @since 1.0 
*/
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;

class Pixel {
	private Color color;

	/**
	 * Initializes a Pixel with a designated color part of a photograph
	 * 
	 * @param c Color of the pixel 
	 */
	public Pixel(Color c) {
		this.color = c;
	}

	/**
	 * Gets the color for this pixel
	 * 
	 * @return Color color of pixel
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets a new Color for the pixel 
	 * 
	 * @param c New color to be set
	 */
	public void setColor(Color c) {
		color = c;
	}
}
