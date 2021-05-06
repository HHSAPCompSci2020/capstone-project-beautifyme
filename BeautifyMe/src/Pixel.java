
/**
 * the author of this code was java dip but modifications were
 *  made to fit prompt by Mana Nagampalli
 * */
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Pixel {
	private int width; 
	private int height; 
	Color[][] color = new Color[][];

	public Pixel(Photograph p) {
		
		try {
			File input = new File("blackandwhite.jpg"); //change this blackandwhite to p.getImage()
			BufferedImage image = ImageIO.read(input); // make this image local 
			//maybe make the try and catch thing in Photograph so then the image gets saved there and then just pass
			//in Photograph to the constructor so then it can save all the values in Pixel like that
			width = image.getWidth();
			height = image.getHeight();

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
	public Color getColor(int x, int y) {
		return color[y][x];
	}
	public void setColor(int x, int y, Color c) {
		color[y][x] = c;
	}
	static public void main(String args[]) throws Exception {
		Pixel obj = new Pixel(); // get rid of main and make pixel in image
	}
}
