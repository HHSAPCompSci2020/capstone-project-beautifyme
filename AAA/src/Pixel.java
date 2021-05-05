
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
	BufferedImage image; // get rid of this because not object oriented to have image
	int width;
	int height;
	Color[][] color = new Color[][]''

	public Pixel() {
		try {
			File input = new File("blackandwhite.jpg");
			image = ImageIO.read(input); // make this image local
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

	static public void main(String args[]) throws Exception {
		Pixel obj = new Pixel(); // get rid of main and make pixel in image
	}
}
