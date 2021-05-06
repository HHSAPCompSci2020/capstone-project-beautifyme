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
	private int width; 
	private int height; 
	Color[][] color;
	
	/**
	 *Initializes the 2D Array of Pixels with the Color of each designated pixel for the Photograph
	 *@param p Photograph that the pixels belong to
	 */
	public Pixel(Photograph p) {
		
		try {
			File input = new File("blackandwhite.jpg"); //change this blackandwhite to p.getImage()
			BufferedImage image = ImageIO.read(input); // make this image local 
			//maybe make the try and catch thing in Photograph so then the image gets saved there and then just pass
			//in Photograph to the constructor so then it can save all the values in Pixel like that
			width = image.getWidth();
			height = image.getHeight();
			color  = new Color[width][height];
			int count = 0;
			for (int i = 0; i < height; i++) {

				for (int j = 0; j < width; j++) {

					count++;
					color[j][i] = new Color(image.getRGB(j, i));
				}
			}

		} catch (Exception e) {
		}
	}
	
	/**
	 *Gets the color at the pixel location(x,y)
	 *@param x X-coordinate of pixel location
	 *@param y Y-coordinate of pixel location
	 *@return Color color of the pixel at the location (x,y)  
	 */
	public Color getColor(int x, int y) {
		return color[y][x];
	}
	
	/**
	 *Sets a new Color at the pixel location(x,y) 
	 *@param x X-coordinate of pixel location
	 *@param y Y-coordinate of pixel location
	 *@param c New color to be sent at this location 
	 */
	public void setColor(int x, int y, Color c) {
		color[y][x] = c;
	}
}
