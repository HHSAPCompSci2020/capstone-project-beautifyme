
/**
* This class represents the Pixels within a Photograph
* It allows the user to change and get the colors of each individual pixel.
* @author Mana Nagampalli, Mira Shlimenzon, and JavaDip (for the try and catch part)
* @version 1.0 on 5/6
* @since 1.0 
*/
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;

class Pixel {
	Color color;

	/**
	 * Initializes the 2D Array of Pixels with the Color of each designated pixel
	 * for the Photograph
	 * 
	 * @param p Photograph that the pixels belong to
	 */
	public Pixel(Color c) {
		this.color = c;
	}

	/**
	 * Gets the color at the pixel location(x,y)
	 * 
	 * @param x X-coordinate of pixel location
	 * @param y Y-coordinate of pixel location
	 * @return Color color of the pixel at the location (x,y)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets a new Color at the pixel location(x,y)
	 * 
	 * @param x X-coordinate of pixel location
	 * @param y Y-coordinate of pixel location
	 * @param c New color to be sent at this location
	 */
	public void setColor(Color c) {
		color = c;
	}
}
