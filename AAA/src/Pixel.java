/**
 * the author of this code is java dip
 * this code gets the pixel rgb values of a given image
 * */
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Pixel {
	BufferedImage image; //get rid of this because not object oriented to have image
	int width;
	int height;
	//create int r, int g, int b that will save the get stuff

	public Pixel() {
		try {
			File input = new File("blackandwhite.jpg");
			image = ImageIO.read(input); //make this image local 
			width = image.getWidth();
			height = image.getHeight();

			int count = 0;

			for (int i = 0; i < height; i++) {

				for (int j = 0; j < width; j++) {

					count++;
					Color c = new Color(image.getRGB(j, i));
					System.out.println("S.No: " + count + " Red: " + c.getRed() + "  Green: " + c.getGreen() + " Blue: "
							+ c.getBlue()); //save the rgb stuff
				}
			}

		} catch (Exception e) {
		}
	}

	static public void main(String args[]) throws Exception {
		Pixel obj = new Pixel(); //get rid of main and make pixel in image 
	}
}
